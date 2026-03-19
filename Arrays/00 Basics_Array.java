import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[10];

        System.out.println("Enter the Marks of Java Basics : ");
        marks[0] = sc.nextInt();

        System.out.println("Enter the Marks of Maths-1 : ");
        marks[1] = sc.nextInt();

        System.out.println("Enter the Marks of Maths-2 : ");
        marks[2] = sc.nextInt();

        System.out.println("Enter the Marks of DSA : ");
        marks[3] = sc.nextInt();

        System.out.print("Marks of JAVA BASICS : " + marks[0] +
                "\nMarks of MATHS-1 : " + marks[1] +
                "\nMarks of MATHS-2 : " + marks[2] + "\nMarks of DSA : " + marks[3]);

        marks[3] = 97;
        System.out.println("\nUpdated Marks of DSA : " + marks[3]);
        System.out.println("Length of ARRAY : " + marks.length);
    }
}