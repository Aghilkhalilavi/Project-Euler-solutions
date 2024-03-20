package Java;

public class P004 {
    public static void main(String[] args) {
        int n = 100;
        int sum = (n * (n + 1) / 2);
        sum *= sum;
        int sum1 = (n * (n + 1) * (2 * n + 1) / 6);
        System.out.println(sum - sum1);

    }
}
