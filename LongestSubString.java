import java.util.*;

public class LongestSubString{
    public static String findLongestSubString(String str){
        
        //Using HashSet to track unique characters
        HashSet<Character> set = new HashSet<>();
        String longestTillNow = "";
        String longestOverall = "";
        
        //String traversal(linear scanning of characters)
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            //Duplicate detection and state reset strategy
            if(set.contains(c)){
                set.clear();
                longestTillNow = "";
            }
            set.add(c);

            //String concatenation inside a for loop is O(n2)
            longestTillNow += c;
            if(longestTillNow.length() > longestOverall.length()){
                longestOverall = longestTillNow;
            }
        }
        return longestOverall;
    }

    public static void main(String[] args) {
        String str = "abcdab";
        String result = findLongestSubString(str);
        System.out.println("Longest sub string : "+ result);
    }
}

//points to remember:
// 1)Strings are immutable, they cannot be changed once they are created. 
// 2)if we are trying to modifying them by performing concatenation, java is going to create a new array in the memory
// 3)The new array is created by calculating itself how much size is required to accomodate the coming characters
// 4)Then the characters will be inserted into the new array created by java in the memory.
// 5)so that is how, String concatenation is O(n).

// 6)So the best option here is String buffer and String Builder which are mutables
// 7)There is a method here .append() which is O(1).

// IMPORTANT : String concatenation inside a for loop is O(n2)