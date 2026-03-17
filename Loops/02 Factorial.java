
//Write a program to find the factorial of any number entered by the user

import java.util.*;
class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int fac = 1;

        for (int i = 1; i <= num; i++){
            fac = fac*i;
        }
        System.out.println("Factorial : " + fac);
    }
}
