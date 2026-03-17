import java.util.*;
class BinToDec {

    public static void BinToDec(int binNum){
        int n = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of " + n + " is " + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BinToDec(n);
    }
}
