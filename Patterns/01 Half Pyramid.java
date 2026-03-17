import java.util.*;
class halfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows..");
        int row = sc.nextInt();

//        Half Pyramid
        System.out.println("Half Pyramid");
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
