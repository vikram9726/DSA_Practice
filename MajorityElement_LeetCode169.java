public class MajorityElement_LeetCode169 {

    public static void main(String[] args) {

        //Algorithm Name :: Boyer–Moore Voting Algorithm :: Select majority using num>n/2 occurences..

        int[] nums = {3,2,3,3,2,2,2,3,2,2};

        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {     //Selecting Candidate 
                candidate = num;
            }

            if (num == candidate)      //If num exists Vote counts
                count++;
            else
                count--;                
        }

        System.out.println("Majority Element :: " + candidate);
    }
}
