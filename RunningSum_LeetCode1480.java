public class RunningSum_LeetCode1480 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,3,6,5,1,2};
        int[] out = new int[arr1.length];
        int sum=0;

        for(int i=0;i<arr1.length;i++)
        {
            sum=arr1[i]+sum;    // :: Adding element and puting it in another array
            out[i]=sum; 
        }
/*
for(int i = 1; i < arr1.length; i++)      ::Efficient Way
        {
            arr1[i] = arr1[i] + arr1[i-1];
        }

        for(int num : arr1)
        {
            System.out.print(num + " ");
        }
 */

        System.out.print("Output ::");
        for(int i=0;i<arr1.length;i++)
        {
           System.out.print(out[i]+ " ");
        }
    }
    
}
