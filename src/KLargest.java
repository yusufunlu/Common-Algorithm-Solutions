import java.util.Arrays;

/**
 * yusufu 14.11.2021 .
 */
public class KLargest {


    public static int solution(int[] arr, int k) {
        int larges[]  = new int[k];

        Arrays.sort(arr);
        return arr[k];
    }

    public static int solution2(int[] arr, int k) {
        int larges[]  = new int[k];

        for(int i=0; i<k-1; i++) {
            for(int j= 0; j<arr.length-1; j++) {
                if(larges[i]<arr[j]) {
                    larges[i] = arr[j];
                }
            }
        }

        return larges[k];
    }

    public static void klargest(int[] arr, int k) {
        int temp = 0;
        System.out.println("Started:" );
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i<k; i++) {

            for(int j = i; j<arr.length-1; j++) {
                if( arr[j+1]> arr[i]) {

                    temp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }

        }
    }


    public static void select2(int[] arr, int k) {
        int temp = 0;
        System.out.println("Started:" + Arrays.toString(arr));
        int num = arr.length;
        for (int i = 0; i < ( num - 1 ); i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }

    }

    public static void main(String[] args) {

        int arr[] = new int[] { 1, 23, 12, 9, 30, 2, 50 };
        int k = 2;

        int result = solution(arr,k);
        if(result == 30) {
            System.out.println("match");
        } else {
            System.out.println("not match");
        }
        //solution2(arr2,k);
        //klargest(arr2,k);
        //select2(arr3,k);
    }

}
