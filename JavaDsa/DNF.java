public class DNF {

    static void sort012(int[] arr) {
        int n = arr.length;
        int zeroCount = 0;
        int oneCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                zeroCount++;
            else if (arr[i] == 1)
                oneCount++;
        }

        for (int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
        }

        for (int i = zeroCount; i < zeroCount + oneCount; i++) {
            arr[i] = 1;
        }

        for (int i = zeroCount + oneCount; i < n; i++)
            arr[i] = 2;

    }

    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 2, 1, 2, 0, 1, 0, 1, 0, 0, 0, 1, 2, 0, 0 };
        sort012(arr);
        printArr(arr);

    }

}
