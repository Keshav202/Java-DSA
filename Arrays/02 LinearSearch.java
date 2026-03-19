import java.util.Scanner;
class LinearSearch {

    public static int linearSearch(int nums[], int key){
        for (int i=0; i< nums.length; i++){
            if (nums[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static String menuSearch(String menu[], String item){
        for (int i=0; i< menu.length; i++){
            if (menu[i].equals(item)){
                return "found";
            }
        }
        return "Not found";
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {10,20,30,40,50,60,70,80};

        String menu[] = {"Coke", "Fanta", "Maaza", "Pepsi", "Milk"};

        System.out.println("Enter the Menu Item, You want to Order:");
        String item = sc.nextLine();


        System.out.println("Enter the Key number you want to find :");
        int key = sc.nextInt();

        int index = linearSearch(nums, key);
        if (index == -1){
            System.out.println("Key NOT Found!");
        }else {
            System.out.println("Index of Key: " + index);
        }

        String menuIndex = menuSearch(menu, item);
    }
}
