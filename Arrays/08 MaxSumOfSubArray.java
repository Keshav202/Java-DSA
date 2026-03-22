import java.util.Scanner;
class Max_Sum_SubArray {

    public static void sum_of_SubArray(int array[]){
        int max_sum = Integer.MIN_VALUE;

        for (int i=0; i< array.length; i++){
            for (int j=i; j< array.length; j++){
                int curr_sum = 0;
                for (int k=i; k<=j; k++){
                    System.out.print(array[k] + " ");
                    curr_sum += array[k];
                }
                System.out.print("\nCurrent sum of SubArray = " + curr_sum);
                if (max_sum < curr_sum){
                    max_sum = curr_sum;
                }
                System.out.println();
            }
        }
        System.out.print("Maximum Sum of SubArray = " + max_sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];

        System.out.print("Enter the elements of Array : ");
        for (int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        sum_of_SubArray(array);
    }
}
