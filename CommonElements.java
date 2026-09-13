import java.util.ArrayList;
import java.util.HashSet;

public class CommonElements {
    public ArrayList<Integer> commonElements(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }

        for (int i : arr2) {
            if (set.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 3, 5, 7, 9 };

        CommonElements obj = new CommonElements();
        ArrayList<Integer> ls = obj.commonElements(arr1, arr2);
        for (Object i : ls) {
            System.out.println(i);
        }
    }
}
