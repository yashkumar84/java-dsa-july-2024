public class RemoveDuplicate {
    public static int removeDuplicates(int[] arr) {
        int writer = 0;
        for (int reader = 1; reader < arr.length; reader++) {
            if (arr[writer] != arr[reader]) {
                arr[++writer] = arr[reader];
            }
        }
        return writer + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        int k = removeDuplicates(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

//[0,1,0,1,1,1,1,1,0,0,0,0];
//[0,0,0,1,1,0,0,0,2,2,1,0,2,2,1]
