 class ContainsDuplicate_LeetCode217 {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,1,9,6,7};
        int Duplicate =0;
        boolean IsDuplicate = false;

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    Duplicate=arr[i];
                    IsDuplicate=true;
                    break;
                }
            }
        }

        if(IsDuplicate==true)
        {
            System.out.println("Duplicate Contains ::"+Duplicate);
        }
        else{
            System.out.println("Doesnt Contain Duplicate");
        }





    }
    
}
