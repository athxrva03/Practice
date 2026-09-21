public class Sorting {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                return;
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n-1; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 5, 2, 3 };
        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}