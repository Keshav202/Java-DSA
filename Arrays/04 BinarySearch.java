import java.util.Scanner;
class BinarySearch {

    public static int binarySearch(int array[], int key){
        int start = 0, end = array.length-1;
        while (start <= end){
            int mid = (start+end)/2;

            if (array[mid] == key){
                return mid;
            }
            if (array[mid] > key){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {10,20,30,40,50,60,70};
        int key = 50;

        int index = binarySearch(array,key);
        System.out.print("Index of the Key : " + index);
    }
}
