import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionUnique {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 3, 4 };
        int[] arr2 = { 2, 2, 3, 5 };

        IntersectionUnique obj = new IntersectionUnique();
        ArrayList<Integer> ls = obj.intersectionUnique(arr1, arr2);
        for (Object o : ls) {
            System.out.println(o);
        }
    }

    public ArrayList<Integer> intersectionUnique(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }
        for (int i : arr2) {
            if (set1.contains(i)) {        
                if(!set2.contains(i)){
                list.add(i);
                }
            }
            set2.add(i);
        }
        return list;
    }
}