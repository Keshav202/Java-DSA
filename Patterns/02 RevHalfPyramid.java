import java.util.Scanner;
class revHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows..");
        int row = sc.nextInt();

        System.out.println("Reverse Half Pyramid");
        //        Reverse Half Pyramid
        for (int i = 1; i <= row; i++){
            for (int j = row; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
