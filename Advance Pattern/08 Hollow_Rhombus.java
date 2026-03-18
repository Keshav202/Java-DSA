import java.util.Scanner;
class Hollow_Rhombus {

    public static void hollow_rhombus(int rows, int cols){
        for (int i = 1; i <=rows; i++){
            for (int j = 1; j <= rows-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=rows; j++){
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
        System.out.println("Enter Rows..");
        int row = sc.nextInt();
        System.out.println("Enter colums");
        int col = sc.nextInt();

        hollow_rhombus(row,col);
    }
}
