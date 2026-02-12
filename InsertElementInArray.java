import java.util.Scanner;

public class InsertElementInArray{
    public static void main(String args[]){
        int[] arr = new int[5];

        System.out.println("Enter the elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements you've enetered :");
        for(int i : arr){
            System.out.print(i+" ");
        }System.out.println();

        System.out.print("Enter the value you want to add: ");
        int value = sc.nextInt();
        System.out.print("Enter the position you want to add: ");
        int position = sc.nextInt();

        for(int i=arr.length-1; i>=position+1; i--){
            arr[i] = arr[i-1];
        }
        arr[position] = value;
        for(int i : arr){
            System.out.print(i+" ");
        } 
    }
}