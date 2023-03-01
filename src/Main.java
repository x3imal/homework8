import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        //task3();
        //task4();

    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;

        float[] nums1 = {1.57f, 7.654f, 9.986f};
        byte[] nums2 = new byte[3]; //по умолчанию все 3 элемента это - 0

    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.println(nums[i] + " ");
                break;
            }
            System.out.print(nums[i] + ", ");
        }

        float[] nums1 = {1.57f, 7.654f, 9.986f};
        for(int i = 0; i < nums1.length; i ++) {
            if(i == nums1.length - 1) {
                System.out.println(nums1[i] + " ");
                break;
            }
            System.out.print(nums1[i] + ", ");
        }
    }
}


