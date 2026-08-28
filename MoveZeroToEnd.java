public class MoveZeroToEnd {
    public static int[] moveZero(int[] arr){
        int j = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == 0){
                continue;
            }else{
                arr[j] = arr[i];
                j++;
            }
        }

        while(j < arr.length){
            arr[j] = 0;
            j++;
        }

        return arr;
    }

    public static void main(String[] args){
        int[] arr ={1, 0, 5, 0, 2};
        arr = moveZero(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
