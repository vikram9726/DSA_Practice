public class ReverseString_LeetCode344 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
       // System.out.println(s[1]);

       int left=0;
       int right = s.length -1;

        System.out.println("Original String ::");
       for (char c : s) {
        System.out.print(c);

       }

        while(left<right)
        {
            char temp = s[left];
            s[left]=s[right];
            s[right]=temp;
            
            left++;
            right--;
        }

        
        System.out.println("\nReversed String ::");
        for (char c : s) {
        System.out.print(c);
       }


    }
    
}
