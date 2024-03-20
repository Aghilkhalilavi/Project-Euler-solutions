package Java;

public class P003 {
    public static void main(String[] args) {
        int p = 3;
        long n = 600851475143L;
        while (p * p < n) {
            if (n % p == 0) {
                n /= p;
            } else
                p += 2;
        }
        System.out.println(n);
    }
}
