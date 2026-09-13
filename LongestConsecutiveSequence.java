import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int max = 0;
        for (int i : set) {
            int count = 1;
            int curr = i;
            if (!set.contains(i - 1)) {
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
        int res = obj.longestConsecutive(arr);
        System.out.println(res);
    }
}