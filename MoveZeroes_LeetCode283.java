public class MoveZeroes_LeetCode283 {

    public static void main(String[] args) {

        int[] nums = {1,0,3,0,5,6};
        int j = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                int temp = nums[i];   //IMP:: Move zero to last using (swap nums[i] !=0 t0 nums[j])
                nums[i] = nums[j];
                nums[j] = temp;
                j++;                   //After swap j++ so remaining vacant index shows zero
            }
        }

        for(int num : nums)
        {
            System.out.print(num + " ");
        }
    }
}