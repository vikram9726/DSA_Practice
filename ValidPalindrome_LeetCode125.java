public class ValidPalindrome_LeetCode125 {
    public static void main(String[] args) {
        String s = "Banana ananab";
        s=s.replaceAll("[^a-zA-Z]", "").toLowerCase();  //Important remove spaces and lower case.

        int left=0;
        int right = s.length()-1;

        boolean Ispalindrome =true;

        while(left<right)
            {
                if(s.charAt(left)!=s.charAt(right))
                {
                    Ispalindrome=false;
                    break;
                }
                left++;
                right--;
            }

            if(Ispalindrome==true)
            {
                System.out.println("String is Palindrome.."+s);
            }
            else{
                System.out.println("String is not Palindrome.."+s);
            }
    }
}
