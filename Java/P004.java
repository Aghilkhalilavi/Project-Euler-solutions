public class P004 {
    public static void main(String[] args) {
        int largest = 0;
        for (int first = 1; first <= 999; first++) {
            for (int second = 1; second <= 999; second++) {
                int product = first * second;
                if ((product / 100000) % 10 == product % 10 && product / 10000 % 10 == product / 10 % 10
                        && product / 1000 % 10 == product / 100 % 10) {
                    if (product > largest) {
                        largest = product;
                    }
                }
            }
        }
        System.out.println(largest);
    }
}