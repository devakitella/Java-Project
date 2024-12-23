package algods;

import java.util.*;
public class Main
{
    public List<List<Integer>> skyline(int[][] buildings)
    {
        List<BuildingPoint> buildingPoints = new ArrayList<>();
        for (int[] building : buildings)
        {
            buildingPoints.add(new BuildingPoint(building[0], building[2], true));
            buildingPoints.add(new BuildingPoint(building[1], building[2], false));
        }
        Collections.sort(buildingPoints);
        List<List<Integer>> result = new ArrayList<>();
        TreeMap<Integer, Integer> heightMap = new TreeMap<>();
        heightMap.put(0, 1);
        int prevMaxHeight = 0;
        for (BuildingPoint point : buildingPoints) {
            if (point.isStart) {
                heightMap.compute(point.height, (key, value)-> (value == null) ? 1 : value + 1);
            }
            else
            {
                heightMap.compute(point.height, (key, value)->
                {
                    if (value == 1)
                    {
                        return null;
                    }
                    else
                    {
                        return value- 1;
                    }
                });
            }
            int currentMaxHeight = heightMap.lastKey();
            if (prevMaxHeight != currentMaxHeight)
            {
                result.add(Arrays.asList(point.x, currentMaxHeight));
                prevMaxHeight = currentMaxHeight;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of buildings:");
        int numBuildings = scanner.nextInt();
        int[][] buildings = new int[numBuildings][3];
        System.out.println("Enter the left, right, and height for each building:");
        for (int i = 0; i < numBuildings; i++) {
            System.out.println("Building " + (i + 1) + ":");
            buildings[i][0] = scanner.nextInt();
            buildings[i][1] = scanner.nextInt();
            buildings[i][2] = scanner.nextInt();
        }
        Main skylineProblem = new Main();
        List<List<Integer>> result = skylineProblem.skyline(buildings);
        System.out.println("Skyline points:");
        for (List<Integer> point : result) {
            System.out.print(Arrays.toString(point.toArray()) + " ");
        }
    }
}
class BuildingPoint implements Comparable<BuildingPoint> {
    int x;
    int height;
    boolean isStart;
    public BuildingPoint(int x, int height, boolean isStart) {
        this.x = x;
        this.height = height;
        this.isStart = isStart;
    }
    @Override
    public int compareTo(BuildingPoint other) {
        if (this.x != other.x) {
            return Integer.compare(this.x, other.x);
        } else {
            return Integer.compare((this.isStart ?-this.height : this.height),
                    (other.isStart ?-other.height : other.height));
        }
    }
}
