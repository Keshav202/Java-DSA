import java.util.*;
class Hollow_Rectangle {

    public static void hollow_rectangle(int rows, int cols){
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= cols; j++){
                if (i == 1 || i == rows || j ==1 || j == cols){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Rows");
        int row = sc.nextInt();
        System.out.println("Enter no of Columns");
        int col = sc.nextInt();
        hollow_rectangle(row,col);
    }
}
