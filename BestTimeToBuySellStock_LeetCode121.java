public class BestTimeToBuySellStock_LeetCode121 {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 7, 5, 1, 4, 9 };

        int min_p = arr1[0];
        int max_p = 0;

        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < min_p) // Tracking min_price every iteration
            {
                min_p = arr1[i];
            }

            int profit = arr1[i] - min_p; // if iteration get large value it assign in profit

            if (profit > max_p) // Assigning Larger Profit
            {
                max_p = profit;
            }

        }

        System.out.println("Maximum Profit ::" + max_p);

    }

}
