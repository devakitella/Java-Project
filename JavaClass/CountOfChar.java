package JavaClass;

public class CountOfChar {
    public static void main(String[] args) {
        String name = "Venkat Jillellamudi";
        int count = 0;
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == 'i')
                count += 1;
        }
        System.out.println(count);
    }
}
