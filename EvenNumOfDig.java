// 1295. Find Numbers with Even Number of Digits
class EvenNumOfDig {
    public static void main(String[] args) {
        int[] nums = new int[]{12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0, even;
        for(int i = 0; i< nums.length; i++){
            even = countnumber(nums[i]);
            if(even % 2 == 0){
                count++;
        }
        }
        return count;
    }
        public static int countnumber( int nums){
            int even = 0;
            while (nums > 0){
                    even++;
                    nums = nums/10;
                }
                return even;
            }

}
