public class CheckExists {
    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40};
        int t = 30;
        boolean isPresent = contains(arr, t);
        System.out.println(isPresent);
    }
}
