import java.util.Scanner;

class Pairs_Array {

    public static void pairs_array(int arr[]){
        for (int i=0; i< arr.length; i++){
            int curr = arr[i];
            for (int j=i+1; j< arr.length; j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];

        System.out.print("Enter 5 Elements of Array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Your Array is : [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");

        pairs_array(array);
    }
}
