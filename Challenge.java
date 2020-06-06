import java.util.Arrays;

public class Challenge {

    //running
    public static void main(String[] args) {
        
        int[] arr = new int[]{4,5,6,4,2,3,4,5};
        // print out a left rotated list
        System.out.println(listRotation(arr, -3));                
        
    }

    // method for rotating a list
    public static String listRotation(int[] arr, int num) {
        num = num % arr.length;
        if (num + Math.abs(num) == 0) {
            leftRotate(arr, Math.abs(num));
        }
        else {
            rightRotate(arr, num);
        }
        return Arrays.toString(arr);
    }

    // rotates a list to the right
    public static int[] rightRotate(int[] arr, int shift) {
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, shift-1);
        reverse(arr, shift, arr.length -1);
        return arr;
    }

    // rotates a list to the left
    public static int[] leftRotate(int[] arr, int shift) {
        reverse(arr, 0, shift-1);
        reverse(arr, shift, arr.length-1);
        reverse(arr, 0, arr.length -1);
        return arr;
    }

    // reverses a list
    public static int[] reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
