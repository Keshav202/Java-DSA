import java.util.*;
class Palindrome {

    public static boolean isPal(int num){
        int Palindrome = num;
        int rev = 0;
        while(Palindrome != 0){
            int remainder = Palindrome % 10;
            rev = rev * 10 + remainder;
            Palindrome = Palindrome /10;
        }
        if (num == rev){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Palindrome = sc.nextInt();

        if (isPal(Palindrome)){
            System.out.println();
        }

    }
}
