// 125. Valid Palindrome
class palindrome{
    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        // String s = "I am Ramesh ";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();// we have to remove all symbols, and change our character into lower case!
        int start = 0;
        int end = s.length() -1 ;

        while(start <= end ){
            if(s.charAt(start) == s.charAt(end)){
                start ++;
                end --;
            }
            else{
                return false;
            }
        }
        return true;
    }
}