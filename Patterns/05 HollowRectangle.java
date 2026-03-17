import java.util.Scanner;
class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows : ");
        int totRows = sc.nextInt();
        System.out.println("Enter the Number of Columns : ");
        int totColumns = sc.nextInt();

        System.out.println("Here is the Hollow Rectangle : ");

        for (int i = 1; i <= totRows; i++){
            for (int j = 1; j <= totColumns; j++){
                if (i == 1 || i == totRows || j == 1 || j == totColumns){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
