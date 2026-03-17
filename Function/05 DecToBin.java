import java.util.*;
class DecToBin {

    public static void DecToBin(int n){

        int DecNum = n;
        int pow = 0;
        int bin = 0;

        while (n > 0){
            int rem = n % 2;
            bin += rem * (int)Math.pow(10, pow);
            pow++;
            n /= 2;
        }
        System.out.println("Binary form of " + DecNum + " is " + bin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Decimal Number : ");
        int n = sc.nextInt();
        DecToBin(n);
    }
}
