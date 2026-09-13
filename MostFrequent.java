import java.util.HashMap;

public class MostFrequent{
    public static void main(String[] args){
        int[] arr = {2, 5, 2, 7, 5, 2, 7, 7, 7};
        int res = mostFreq(arr);
        System.out.println(res);
    }

    public static int mostFreq(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = Integer.MIN_VALUE;
        int num =-1;
        for(int i : map.keySet()){
            if(max < map.get(i)){
            max = map.get(i);
            num = i;
            }
        }
        return num;
    }
}