import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 1, 5, 4};
        
        FirstNonRepeating obj = new FirstNonRepeating();
        int num = obj.firstNonRepeating(arr);
        System.out.println(num);
    }

    public int firstNonRepeating(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0)+1);
        }

        for(int values : arr){
            if(map.get(values) == 1){
                return values;
            }
        }
        return -1;
    }
}
