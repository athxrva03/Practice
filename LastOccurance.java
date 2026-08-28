public class LastOccurance {
    public static int lastIndex(int[] arr , int target){
        for(int i = arr.length-1 ; i >= 0 ; i--){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {2, 5, 3, 5, 7, 5};
        int target =  5;
        int idx = lastIndex(arr,target);
        System.out.println(idx);
    }
}
