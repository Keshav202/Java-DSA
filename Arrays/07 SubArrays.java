import java.util.Scanner;
class Sub_Arrays {

    public static void sub_array(int array[]){
        int tot_SubArr = 0;
        for (int i=0; i< array.length; i++){
            int start = i;
            for (int j=i; j< array.length; j++){
                int end = j;
                System.out.print("[ ");
                for (int k=start; k<=end; k++){
                    System.out.print(array[k] + " ");
                }
                tot_SubArr++;
                System.out.println("]");
            }
            System.out.println();
        }
        System.out.print("Total SubArrays = " + tot_SubArr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];

        System.out.println("Enter elements in Array : ");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        sub_array(array);

    }
}
