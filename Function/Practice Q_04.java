import java.util.*;
class SumOfDigit {

    public static int SumOfDigit(int digit){
        int sum = 0;
        while (digit != 0){
            int rem = digit % 10;
            digit /= 10;
            sum += rem;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Digit : ");
        int digit = sc.nextInt();
        int sum = SumOfDigit(digit);
        System.out.print("The Sum of each integer in the digit is : " + sum);
    }
}
