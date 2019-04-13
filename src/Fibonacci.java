import java.util.ArrayList;

public class Fibonacci {
    public static ArrayList<Long> getPizanoPeriod(long m){
        ArrayList<Long> pizanoPeriod = new ArrayList();
        pizanoPeriod.add(0L);
        pizanoPeriod.add(1L);

        int index = 1;
        do{
            index++;
            pizanoPeriod.add((pizanoPeriod.get(index - 1) + pizanoPeriod.get(index - 2)) % m);
        }
        while (!(pizanoPeriod.get(index) == 1L && pizanoPeriod.get(index-1) == 0L));

        pizanoPeriod.remove(pizanoPeriod.size() - 1);
        pizanoPeriod.remove(pizanoPeriod.size() - 1);

        return pizanoPeriod;
    }

    public static long getLastFibonacciRest(long n, long m){
        ArrayList<Long> s = getPizanoPeriod(m);
        int pizanoPeriodLength = s.size();
        int val = (int)(n % pizanoPeriodLength);
        return s.get(val);
    }

    public static int[] getFibonaccList(int n) {
        int[] arr = new int[n + 1];

        arr[0] = 0;
        if(n == 0){
            return arr;
        }

        arr[1] = 1;
        if(n == 1){
            return arr;
        }

        int index = 2;

        while (index <= n){
            arr[index] = arr[index - 1] + arr[index - 2];
            index++;
        }

        return arr;
    }
}
