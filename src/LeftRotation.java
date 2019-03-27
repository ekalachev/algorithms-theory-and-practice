public class LeftRotation {
    public static int[] rotLeft(int[] a, int d) {
        int j, k, tmp;

        for (int i = 0; i < gcd(d, a.length); i++) {
            tmp = a[i];
            j = i;
            while(true) {
                k = j + d;

                if (k >= a.length)
                    k = k - a.length;

                if(k == i)
                    break;

                a[j] = a[k];
                j = k;
            }

            a[j] = tmp;
        }

        return a;
    }

    private static int gcd (int a, int b) {
        if (b == 0)
            return a;

        return gcd (b, a % b);
    }
}
