import java.util.*;
class avgOfNumbers {

//    This function is used to find the Average of 3 Numbers
    public static int AvgOf3Num(int a, int b, int c) {
        int avg = (a+b+c) / 3;
        return avg;
    }

//    This Function is used to find Average of All Numbers
    public static void FindAvg(){
        Scanner sc = new Scanner(System.in);
        System.out.print("This will find Average of all numbers you Input \nEnter the Count of Number : ");
        int count = sc.nextInt();
        int sum = 0;
        int Average;
        for (int i=1; i <= count; i++){
            System.out.println("Enter number " + i);
            int num = sc.nextInt();
            sum += num;
        }
        Average = sum/count;
        System.out.println("Sum is: " + sum + "\nAverage is : " + Average);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This will find Average of 3 Numbers. \nEnter Number 1 ");
        int a = sc.nextInt();
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
        System.out.println("Enter Number 3");
        int c = sc.nextInt();

        int ans = AvgOf3Num(a,b,c);
        System.out.println("Average of " + a + ", " + b + " and " + c + " is " + ans);

        FindAvg();
    }
}
