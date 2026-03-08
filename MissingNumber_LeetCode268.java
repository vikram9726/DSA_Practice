public class MissingNumber_LeetCode268 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {0,1,3};   //2

        int n = arr1.length;
        int sum=0;
        for(int i=0;i<arr1.length;i++)
        {
            sum=arr1[i]+sum;   
        }

        int t_sum = n*(n+1)/2;   //IMP :: Total Sum Formula
        int m_num = t_sum - sum;

        System.out.println("Missing Num ::"+m_num);
    }
}
