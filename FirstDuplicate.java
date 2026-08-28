public class FirstDuplicate {
    public static int firstDuplicate(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < i ; j++){
                if(arr[i]== arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr= {4, 2, 7, 2, 9, 4};
        int duplicate = firstDuplicate(arr);
        System.out.println(duplicate);
    }
}

