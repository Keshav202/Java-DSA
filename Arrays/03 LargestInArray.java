import java.util.Scanner;
class LargestInArray {

    public static int findLargest_and_smallest(int list[]){
        int largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;

        for (int i=0; i< list.length; i++){
            if (largest < list[i]){
                largest = list[i];
            }
            if (Smallest > list[i]){
                Smallest = list[i];
            }
        }
        System.out.println("Smallest value in the list is " + Smallest);
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list[] = new int[5];
        System.out.print("Enter 1st Element of List : ");
        list[0] = sc.nextInt();
        System.out.print("Enter 2nd Element of List : ");
        list[1] = sc.nextInt();
        System.out.print("Enter 3rd Element of List : ");
        list[2] = sc.nextInt();
        System.out.print("Enter 4th Element of List : ");
        list[3] = sc.nextInt();
        System.out.print("Enter 5th Element of List : ");
        list[4] = sc.nextInt();

        int largest = findLargest_and_smallest(list);
        System.out.println("Largest Value in the list is : " + largest);
    }
}
