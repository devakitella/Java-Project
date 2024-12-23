package JavaClass;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<Integer> {
    public Integer call()
    {
        int n1=10;
        int n2=90;
        int sum=n1+n2;
        return sum;
    }
}

