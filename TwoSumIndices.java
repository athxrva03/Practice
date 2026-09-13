import java.util.HashMap;

public class TwoSumIndices {
    public int[] twoSumIndexes(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int com = target - arr[i];
            if (map.containsKey(com)) {
                return new int[] { map.get(com), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;
        TwoSumIndices obj = new TwoSumIndices();
        int[] res = obj.twoSumIndexes(arr, target);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
