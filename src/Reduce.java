public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        extracted(i);
    }

    private static void extracted(int i) {
        int count = 0;
        while (i > 0) {
            boolean divisibleby2 = i % 2 == 0;
            if (divisibleby2) {
                i = i / 2;
                count++;
            }else{
                i = i - 1;
                count++;
            }
        }
        System.out.println(count);
    }

}
