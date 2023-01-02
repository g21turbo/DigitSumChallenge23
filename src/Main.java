public class Main {

    public static void main(String[] args) {

        System.out.println("The sum of the digits in number 1234 is " + sumDigits(1234));
        System.out.println("The sum of the digits in number 68889 is " + sumDigits(68889));
        System.out.println("The sum of the digits in number 4180 is " + sumDigits(4180));
        System.out.println("The sum of the digits in number 224965 is " + sumDigits(224965));



    }



    public static int sumDigits(int number) {

        if (number < 0){
            return -1;
        }

        int sum = 0;

        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }

        sum += number;

        return sum;
    }


}
