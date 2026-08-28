public class SwapTwoNum {
    public static int[] swap(int[]  arr , int l , int r ){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] nArr = swap(arr , 0 ,2);
        for(int num : nArr){
            System.out.println(num);
        }
    }
}
