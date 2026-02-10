
public class ZerosToEnd{
    public static void main(String[] args) {
        int[] arr = {10, 0, 0, 20, 40, 50, 60};
        int[] newArr = new int[arr.length];
        reArrange(arr, newArr);
        printArray(newArr);   
    }
    public static void reArrange(int[] arr, int[] newArr){
        int pointer = 0;
        //Frst Traversal
        //traverse through input array and check if the element is not equal to zero
        //then add that element to newArr and increment pointer by 1
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                newArr[pointer] = arr[i];
                pointer++;
            }
        }
        //Second Traversal
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                newArr[pointer] = arr[i];
                pointer++;
            }
        }
        //Time complexity O(n)
        //Space Complexity O(n)
    }
    public static void printArray(int[] newArr){
        for(int i : newArr){
            System.out.print(i+" ");
        }
    }
}


//space complexity O(1)
// public static void reArrange(int[] arr){
//     int pointer = 0;
//     for(int i=0; i<arr.length; i++){
//         if(arr[i] != 0){
//             arr[pointer++] = arr[i];
//         }
//     }
//     while(pointer < arr.length){
//         arr[pointer++] = 0;
//     }
// }
