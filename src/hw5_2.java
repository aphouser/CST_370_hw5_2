import java.util.Scanner;

public class hw5_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // get number of entries
        int num = in.nextInt();

        // create two arrays to hold them for two approaches
        int[] nums1 = new int[num];
        int[] nums2 = new int[num];

        // read numbers into two arrays for two approaches
        for (int i = 0; i < num; i++) {
            int temp = in.nextInt();
            nums1[i] = temp;
            nums2[i] = temp;
        }

        in.close();

        // first approach
        // use 2 indexes swap them if left is positive and right is negative
        int i = 0;
        int j = num-1;

        while (i < j) {
            // if i is negative, move to the next number
            while (nums1[i] < 0) {
                i++;
            }

            // if j is positive, move to the next number
            while (nums1[j] > 0) {
                j--;
            }

            // swap if i is positive and j is negative
            if (j > i) {
                int temp = nums1[i];
                nums1[i] = nums1[j];
                nums1[j] = temp;
            }
        }

        // second approach
        // use 2 indexes starting from 0 swap them if i is positive and j is negative
        i = 0;
        j = 0;

        while (j < num-1 && i < num-1) {
            // if j is positive, move to the next number
            if (nums2[j] > 0 ) {
                j++;
            }

            // if j hits the end stop
            if (j == num-1) {
                break;
            }

            // if i is negative, move to the next number
            if (nums2[i] < 0 && i < j) {
                i++;
            }

            // swap if i is positive and j is negative
            if (nums2[i] > 0 && nums2[j] < 0) {
                int temp = nums2[i];
                nums2[i] = nums2[j];
                nums2[j] = temp;
            }

            if (nums2[i] < 0) {
                i++;
            }
            j++;
        }

        for (int x = 0; x < nums1.length; x++) {
            System.out.print(nums1[x] + " ");
        }
        System.out.println();
        for (int y = 0; y < nums2.length; y++) {
            System.out.print(nums2[y] + " ");
        }
    }
}
