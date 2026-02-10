public class WordsReverse{
    public static void main(String[] args) {
        String str = "Welcome to Blind 75";

        //String tokenization or spltting
        String[] newArr = str.split(" ");

        //Reverse traversal
        for(int i=newArr.length-1; i>=0; i--){
            System.out.print(newArr[i]+" ");
        } 
    }
}