import java.util.*;
class functions {
    public static void printHello() {
        System.out.println("Hello World!");
    }

    public static int sum(int num1, int num2){ // Here num1 and num2 are Formal Parameter/Parameter
        int sum = num1 + num2;
        return sum;
    }

    public static int product(int a, int b){
        int p = a * b;
        return p;
    }

    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++){
            f = f*i;
        }
        return f;
    }

    public static int BinomialCoefficient(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n - r);

        int bc = fact_n / (fact_r * fact_nr);
        return bc;
    }

    public static void main(String[] args) {
        printHello();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();

        int sum = sum(a,b); // Here a and b are actual Parameter/ Argument
        System.out.println("Sum is " + sum);

        int product = product(a,b);
        System.out.println("Product is " + product);

        System.out.print("Enter a Number for Factorial : ");
        int n = sc.nextInt();
        int factorial = factorial(n);
        System.out.println("Factorial of Number " + n + " is " + factorial);

        System.out.print("Enter first number of Binomial : ");
        int f = sc.nextInt();
        System.out.print("Enter the second number of Binomial : ");
        int s = sc.nextInt();
        int bc = BinomialCoefficient(f,s);
        System.out.println("Binomial Coefficient of " + f + " and " + s + " is " + bc);

    }
}
