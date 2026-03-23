import java.util.Scanner;
class Find_repeated {

    public static boolean repeated_num(int nums[]){
        for (int i=0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];
        System.out.print("Enter 5 Numbers : ");
        for (int i=0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(repeated_num(nums));
    }
}
