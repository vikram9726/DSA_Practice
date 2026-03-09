public class SearchInsertPosition_LeetCode35 {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 3, 4, 7 };
        int target = 8;

        int right = arr1.length - 1; // Two Pointer
        int left = 0;

        while (left <= right) {
            int mid = (right + left) / 2;           //Create Mid

            if (arr1[mid] == target) {              //Case1 :: if target found;
                System.out.println(mid);
                break;
            } else if (arr1[mid] < target) {        //Case2 :: if target right side of mid, search space :: (left = mid+1 -- right=aar.len -1) ;
                left = mid + 1;
            } else {
                right = mid - 1;                    //Case3 :: if target left side of mid, search space :: (left =0 --- right = mid-1);
            }
        }
        System.out.println(left);                   //Case4 :: if target is not on search space :: left>right ; print last index

    }
}
