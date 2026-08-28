public class SecondLargestElement {
    public static int secondLargest(int[] arr){
        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;

        for(int i : arr){
            if(f < i){
                s = f;
                f = i;
            }else if(s < i && i != f){
                s = i;
            }
        }

        return s;
    }

    public static void main(String[] args){
        int[] arr = {10,10, 10, 10};
        int s = secondLargest(arr);
        System.out.println(s);
    }
}



