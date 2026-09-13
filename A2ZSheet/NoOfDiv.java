import java.util.HashSet;

public class NoOfDiv {
    public int[] divisors(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        for(int i = 2 ; i*i <= n ; i++){
            if(n % i == 0){
                set.add(i);
            }
        }
        set.add(n);
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args){
        int n = 10;
        NoOfDiv obj = new NoOfDiv();
        int[] arr = obj.divisors(n);
        for(int i : arr){
            System.out.println(i);
        }

    }
}
