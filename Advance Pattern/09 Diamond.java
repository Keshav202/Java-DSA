import java.util.Scanner;
class Diamond {

    public static void diamond(int row){
        for (int i=1; i<=row; i++){
            for (int j=1; j<=(row-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=row; i>=1; i--){
            for (int j=1; j<=(row-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lines..");
        int n = sc.nextInt();

        diamond(n);
    }
}
