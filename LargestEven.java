public class LargestEven {
    public static int largestEven(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num % 2 == 0) {
                if (max < num) {
                    max = num;
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {7, 12, 5, 18, 9, 4};
        int lEven = largestEven(arr);
        System.out.println(lEven);
    }
}
