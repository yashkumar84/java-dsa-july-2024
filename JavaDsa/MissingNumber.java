public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int i : nums) {
            arrSum += i;
        }

        return actualSum - arrSum;

    }

    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };
        int ans = missingNumber(arr);
        System.out.println(ans);

    }

}
