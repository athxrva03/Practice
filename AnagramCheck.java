import java.util.HashMap;

public class AnagramCheck {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        for (char ch : map1.keySet()) {
            if (map2.get(ch) != map1.get(ch)) {
                return false;
            }
        }
        return true;
    }
}
