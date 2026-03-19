import java.util.Scanner;
class Array_Arguments {

    public static void update(int marks[]){
        for (int i=0; i< marks.length; i++){
            marks[i] = marks[i] + 2;
            System.out.println("Updated Marks with Attendance Marks : " + marks[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];

        System.out.println("Enter the Marks of Subject 1 : ");
        marks[0] = sc.nextInt();

        System.out.println("Enter the Marks of Subject 2 : ");
        marks[1] = sc.nextInt();

        System.out.println("Enter the Marks of Subject 3 : ");
        marks[2] = sc.nextInt();

        update(marks);
    }
}
