import java.util.HashSet;

public class DuplicatePresent {
    public static boolean idDupliPresent(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.contains(i))
            {
                return true;
            }
            else
            {
                set.add(i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9};
        boolean isPresent = idDupliPresent(arr);
        System.out.println(isPresent);
    }
}
