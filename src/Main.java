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

        int[] nums = new int[]{1, 2, 3};
        float[] nums1 = {1.57f, 7.654f, 9.986f};
        byte[] nums2 = new byte[3]; //по умолчанию все 3 элемента это - 0

    }

    public static void task2(){
        System.out.println("Задача 2");

        int[] nums = new int[] {1, 2, 3};
        System.out.println(nums[0] + ", " + nums[1] + ", " + nums[2]);

        float[] nums1 =  {1.57f, 7.654f, 9.986f};
        System.out.println(nums1[0] + ", " + nums1[1] + ", " + nums1[2]);

        byte[] nums2 = new byte[3];
        System.out.println(nums2[0] + ", " + nums2[1] + ", " + nums2[2]);
    }

    public static void task3(){
        System.out.println("Задача 3");

        int[] nums3 = new int[] {1, 2, 3};
        System.out.println(nums3[2] + ", " + nums3[1] + ", " + nums3[0]);

        float[] nums4 =  {1.57f, 7.654f, 9.986f};
        System.out.println(nums4[2] + ", " + nums4[1] + ", " + nums4[0]);

        byte[] nums5 = new byte[3];
        System.out.println(nums5[2] + ", " + nums5[1] + ", " + nums5[0]);

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