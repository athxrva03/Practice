public class FirstOcc {
    public static int firstIdx(int[] arr , int target){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {5, 8, 3, 8, 10};
        int target = 8;

        int occ = firstIdx(arr,target);
        System.out.println(occ);
    }
}
