
//Question : Writeaprogramthatreadsasetofintegers,and then prints the sum of the even and odd integers.

import java.util.*;
class SumOfEven_and_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int choice;
        int EvenSum = 0;
        int OddSum = 0;

        do {
            System.out.print("Enter the Number : ");
            num = sc.nextInt();

            if (num % 2 == 0){
                EvenSum += num;
            }else {
                OddSum += num;
            }

            System.out.print("Do you want to continue.. Press 1 else 0.");
            choice = sc.nextInt();
        }while (choice == 1);
        System.out.println("Sum of Even Numbers : " + EvenSum);
        System.out.println("Sum of Odd Numbers ; " + OddSum);


    }
}
