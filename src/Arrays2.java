public class Arrays2 {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        System.out.println("Arrays 2");
        // task 1.
        int total = -1;
        for (int i : generateRandomArray()) {
           total = i;
            System.out.println("сумма трат за месяц составила " +  total + " рублей");
        }
        System.out.println();
        //task 2.
        int minimumSpendPerday = 201_000;
        int maximumSpendPerday = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimumSpendPerday) {
                minimumSpendPerday = arr[i];
            }
        }
        System.out.println("минимальная трата за день " + minimumSpendPerday + " рублей" );

        for (int j : arr) {
            if (j > maximumSpendPerday) {
                maximumSpendPerday = j;
            }
        }
        System.out.println("максимальная трата за день " + maximumSpendPerday + " рублей" );

        System.out.println();
        // task 3.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] / arr.length;
        }
        System.out.println("средняя сумма за месяц " + sum + " рублей");

        System.out.println();
        // task 4.
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

