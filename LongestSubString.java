import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class LongestSubString {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println( " The Longest Sub String of the given String is  " +FindLongestSubString(str));
    }
    private static int FindLongestSubString(String str) {
        int start = 0;
        int end =0;
        int maxLen =0;
        List<Character> list  = new ArrayList<>();
        while(end < str.length()){
            if(!list.contains(str.charAt(end))){
                list.add(str.charAt(end));
                end++;
                maxLen = Math.max(maxLen, list.size());
            }
            else{
                list.remove(Character.valueOf(str.charAt(start)));
                start ++;
            }
        }
        return maxLen;
    }
    }
