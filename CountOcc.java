public class CountOcc {
    public static int occerance(int[] arr , int target){
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {2, 5, 2, 7, 2, 9};
        int target = 2;

        int occ = occerance(arr,target);
        System.out.println(occ);
    }
}
