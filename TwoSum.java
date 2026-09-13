import java.util.HashMap;

public class TwoSum {
    public static boolean twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            int com = target - i;
            if (map.containsKey(com)) {
                return true;
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        boolean isAvai = twoSum(arr, target);
        System.out.println(isAvai);
    }

}
