
public class Main {
    public static void main(String[] args) {

        System.out.println(" Printout Homework 9 ");
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {

        int[] arr = generateRandomArray();
        System.out.println("             ");
        System.out.println("Printout Task1");
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма за месяц составила: " + sum + "  рублей");
    }

    public static void task2() {

        int[] arr = generateRandomArray();
        System.out.println("             ");
        System.out.println("Printout Task2");

        int curr = 0;
        for (int element : arr) {
            if (element > curr) {
                curr = element;

            }
        }
        System.out.println("Максимальная сумма трат за день составила: " + curr + " рублей");
        curr = arr[1];
        for (int element : arr) {
            if (element < curr) {
                curr = element;

            }
        }
        System.out.println("Минимальная сумма трат за день составила: " + curr + " рублей");
    }
    public static void task3() {

        int[] arr = generateRandomArray();

        System.out.println("             ");
        System.out.println("Printout Task3");

        int sum = 0;
        float average;
        int days=30;

        for (int element : arr) {
            sum += element;
        }
        average=sum/days;
        System.out.println("Средняя сумма трат за месяц составила: " + average + "  рублей");
    }
    public static void task4() {


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int arrL=reverseFullName.length;

        System.out.println("             ");
        System.out.println("Printout Task4");


        for (int i = arrL-1; i>-1; i-- ) {
            System.out.print(reverseFullName[i]);
        }


    }
}