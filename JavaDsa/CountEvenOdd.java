public class CountEvenOdd {
    static int[] countEvenOdd(int[] arr) {
        int[] ans = new int[2];
        for (int i : arr) {
            if (i % 2 == 0) {
                ans[0]++;
            } else {
                ans[1]++;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int ans[] = countEvenOdd(arr);
        System.out.println(ans[0] + " " + ans[1]);
    }

}
