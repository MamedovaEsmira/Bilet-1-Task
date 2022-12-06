public class Main {

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ", ");
            }
            System.out.println();
            for (int i= number.length-1; i>=0; i--) {
                System.out.print(number[i] + ", ");

        }
    }
}
