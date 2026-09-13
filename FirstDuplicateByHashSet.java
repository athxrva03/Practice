import java.util.HashSet;

public class FirstDuplicateByHashSet 
{
    public static int firstDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.contains(i)){
                return i;
            }else{
                set.add(i);
            }
        }
        return -1;
    }
    
}
