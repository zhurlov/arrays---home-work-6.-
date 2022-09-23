public class task2 {
    public static void main(String[] args) {

        // task 2-1.
        System.out.println("task 2.");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        for (int i = 0; i < integer.length; i++) {
            if (i == integer.length - 1) {
                System.out.println(integer[i] + "");
                break;
            }
            System.out.print(integer[i] + ",");
        }
        System.out.println();
        // task 2-2.
        double[] fractional = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractional.length; i++) {
            if (i == 3 - 1) {
                System.out.println(fractional[i] + "");
            } else {
                System.out.print(fractional[i] + ",");
            }
        }
        System.out.println();
        // task 2-3.
        int[] arbitrary = {3,9,27,71,17,62,77};
        for (int i = 0; i < arbitrary.length; i++) {
            arbitrary[i] = arbitrary[i] * 2;
            if (i == arbitrary.length - 1) {
                System.out.println(arbitrary[i] + "");
                break;
            }
            System.out.print(arbitrary[i] + ",");
        }
    }
}