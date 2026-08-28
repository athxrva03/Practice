public class ReverseArray{
    public static int[] reverse(int[] arr){
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] nArr = reverse(arr);
        for(int num : nArr){
            System.out.println(num);
        }
    }
}