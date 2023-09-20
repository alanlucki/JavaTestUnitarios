package test02;

public class Factorial {
    public long compute01(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input: " + n);
        if (n < 2) return 1;
        long f = 2;
        for (int i = 3; i <= n; i++)
            f *= i;
        return f;
    }

    public long compute02(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative input: " + n);
        if (n < 2) return 1;
        return n * compute02(n - 1);
    }

}
