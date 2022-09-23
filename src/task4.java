public class task4 {
    public static void main(String[] args) {
        // task 4-1.
        System.out.println("task 4.");
        int[] integer = new int[3];
        integer[0] = 2;
        integer[1] = 5;
        integer[2] = 7;
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 == 1) {
                integer[i] = integer[i] + 1;
                System.out.println(integer[i] + " ");

            }


        }

    }
}
