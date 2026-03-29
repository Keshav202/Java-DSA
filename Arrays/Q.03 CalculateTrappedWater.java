import java.util.Scanner;
class TrappedWater {

    public static int trappedWater(int height[]){
        int n = height.length;

        int left_max[] = new int[n];
        left_max[0] = height[0];
        for (int i=1; i<n; i++){
            left_max[i] = Math.max(height[i], left_max[i-1]);
        }

        int right_max[] = new int[n];
        right_max[n-1] = height[n-1];
        for (int i=n-2; i>=0; i--){
            right_max[i] = Math.max(height[i], right_max[i+1]);
        }

        int trapped_water = 0;
        for (int i=0; i<n; i++){
            int waterLevel = Math.min(left_max[i], right_max[i] );
            trapped_water += waterLevel - height[i];
        }

        return trapped_water;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height[] = new int[5];

        System.out.print("Enter Height of 5 Bars : ");
        for (int i=0; i < height.length; i++){
            height[i] = sc.nextInt();
        }

        System.out.println("Trapped Water : " + trappedWater(height));
    }
}
