public class ApproximatePi {
    public static void main(String[] args) {
        System.out.print("4 * (1 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11)) = ");
        System.out.println(
                4.0 * (1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0)));

        System.out
                .print("4 * (1 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11) + (1 / 13)) = ");
        System.out.println(4.0 * (1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0)
                - (1.0 / 11.0) + (1.0 / 13.0)));
    }
}
