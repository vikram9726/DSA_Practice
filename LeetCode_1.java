class LeetCode_1
{
    public static void main(String[] args)
    {
        int[] arr1 = new int[]{2,5,9,6,7};
        int target= 15;
        int i_index=0;
        int j_index=0;

        for(int i=0;i<arr1.length-1;i++)
        {
            for(int j=i+1;j<arr1.length;j++)
            {
                if(arr1[i]+arr1[j]==target)
                {
                    i_index=i;
                    j_index=j;
                }
            }
        }

        System.out.println("Output::"+i_index+" "+j_index);
        
    }
}