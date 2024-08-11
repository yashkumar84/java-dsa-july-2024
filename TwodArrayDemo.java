import java.util.Scanner;

public class TwodArrayDemo{

    static int findMax(int[][] arr){
        int max = arr[0][0];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j] > max)max = arr[i][j];
            }
        }
        return max;
    }

    static int findMin(int[][] arr){
        int min = arr[0][0];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j] < min)min = arr[i][j];
            }
        }
        return min;
    }
    static void print(int[][] arr){
        System.out.print("[");
        for(int i = 0;i<arr.length;i++){
            System.out.print("[");
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("]");
           
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int[][] arr =  new int[3][3];
        // int[][] arr = {{1,2}, {3,4},{6,7}};
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        print(arr);
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));


    }
}