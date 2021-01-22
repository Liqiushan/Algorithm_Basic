// 冒泡排序
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        if(arr == null || arr.length < 2) {
            return;
        }
        // 0 ~ N-1
        // 0 ~ N-2
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] < arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }
// 交换位置
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
