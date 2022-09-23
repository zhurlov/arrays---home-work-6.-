public class task3 {
    public static void main(String[] args) {
        // task 3-1.
        System.out.println("task 3.");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        for (int i = integer.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(integer[i] + ",");
            } else {
                System.out.println(integer[i] + "");
            }
        }
        //task 3-2.
        System.out.println();
        double[] fractional = {1.57, 7.654, 9.986};
        for (int i = fractional.length -1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.println(fractional[i] + "");
            } else {
                System.out.print(fractional[i] + ",");
            }
        }
        // task 3-3.
        System.out.println();
        int[] arbitrary = {3,9,27,71,17,62,77};
        for (int i = arbitrary.length - 1; i >= 0; i--) {
            arbitrary[i] = arbitrary[i] * 2;
            if (i == 0) {
                System.out.println(arbitrary[i] + "");

            } else {
                System.out.print(arbitrary[i] + ",");
            }
        }

    }
}
