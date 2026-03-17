import java.util.Scanner;
class Char_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows....");
        int row = sc.nextInt();

//        Character Pyramid
        System.out.println("Character Pyramid");
        char ch = 'A';
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
