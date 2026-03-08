import java.util.Arrays;

class ValidAnagram_LeetCode242
{
    public static void main(String[] args)
    {
        String s = "anagram";
        String t = "nagaram";

        char[] arr1 = s.toCharArray();    //IMP:: String to Array Conversion
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);   //Sorting
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2))     //Comparing
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}