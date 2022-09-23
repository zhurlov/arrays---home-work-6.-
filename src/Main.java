public class Main {
    public static void main(String[] args) {
        // task 1.
        System.out.println("task 1.");
        int [] integer = new int [3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(integer[i]);
        }

        // task 1-2.
        System.out.println();
        double[] fractional = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.println(fractional[i]);
        }

        // task 1-3.
        System.out.println();
        int[] arbitrary = {3,9,27,71,17,62,77};
        for (int i = 0; i < 7; i++) {
            arbitrary[i] = arbitrary[i]  * 2;
            System.out.println(arbitrary[i]);
        }
    }
}