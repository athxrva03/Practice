public class LargestIdx {
    public static int largestIdx(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 50, 20, 40 };
        int lEven = largestIdx(arr);
        System.out.println(lEven);
    }
}
