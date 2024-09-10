public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i < 1000) {
            boolean divisibleby3 = i % 3 == 0;
            boolean divisibleby5 = i % 5 == 0;

            if (divisibleby3 || divisibleby5) {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }

}
