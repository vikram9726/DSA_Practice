public class PalindromeNumber_LeetCode9 
{
    public static void main(String[] args) 
    {
       int number=1221;
       int original = number;
       int reverse=0;
        

       while(number>0)  {
        int digit = number%10;
        reverse=reverse*10+digit;
        number= number/10;
       }
      
       System.out.println(reverse);

       if(original==reverse)
       {
        System.out.println("Yes! It is palindrone :: "+reverse );
       }
       else{
        System.out.println("No! It is not palindrone :: "+reverse );
       }
       




        

    }



}
