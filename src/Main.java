public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};


        int sum2 = 0;

        for (int num1 : numbers) {

            sum2 += num1;

            System.out.println(num1 + ") Num is " + num1 + ", sum is " + sum2);
        }
        int sum1 = 0;

        for (int i = 0; i < numbers.length; i++) sum1 += numbers[i];

        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum1 + "\n");
    }

}