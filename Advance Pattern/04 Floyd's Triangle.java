import java.util.Scanner;
class FloydTriangle {

    public static void floydTriangle(int row, int count){
        count = 1;
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows...");
        int n = sc.nextInt();
        int counter = 1;

        floydTriangle(n,counter);
    }
}
