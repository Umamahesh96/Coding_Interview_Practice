
public class NegativeElements {

    public static void main(String[] args) {
        int[] arr = {-1, -20, 30, 40, 50, -8};
        int[] newArr = new int[arr.length];   //creating new array = auxillary array
        reArrange(arr, newArr);
        printArray(newArr);
    }

    public static void reArrange(int[] arr, int[] newArr) {
        int pointer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                newArr[pointer] = arr[i];
                pointer++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArr[pointer] = arr[i];
                pointer++;
            }
        }
    }

    public static void printArray(int[] newArr) {
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }
}
