import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

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

        byte[] nums2 = new byte[3];
        System.out.println(Arrays.toString(nums2));

    }

    public static void task3() {
        System.out.println("Задача 3");

        int[] nums3 = new int[]{1, 2, 3};
        for (int i = nums3.length - 1; i >= 0; i--) {
            if (i == nums3.length - 3) {
                System.out.println(nums3[i] + " ");
                break;
            }
            System.out.print(nums3[i] + ", ");
        }

        float[] nums4 =  {1.57f, 7.654f, 9.986f};
        for (int i = nums3.length - 1; i >= 0; i--) {
            if(i == nums3.length - 3) {
                System.out.println(nums4[i] + " ");
                break;
            }
            System.out.print(nums4[i] + ", ");
        }
    }

    public static void task4(){
        System.out.println("Задача 4");

        int[] nums6 = new int[] {1, 2, 3};
        for (int i = 0; i < nums6.length; i++) {
            if(nums6[i] % 2 != 0) {
                nums6[i] = nums6[i] + 1;
            }
        }
        System.out.println(Arrays.toString(nums6));
    }
}



