import java.util.Scanner;
class Reverse_Array {

    public static void reverse_array(int array[]){
        int start = 0;
        int end = array.length-1;

        while (start < end){
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;

            start++;
            end--;
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

        reverse_array(array);
        System.out.print("Reverse array is [ ");
        for (int i=0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("]");


    }
}
