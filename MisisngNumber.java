public class MisisngNumber {
    public static int missingNum(int[] arr , int n ){
        int actualSum = 0;
        int totalSum = n * (n + 1) / 2;
        for(int i : arr){
            actualSum+=i;
        }
        int num = totalSum - actualSum;
        return num;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        int missNum = missingNum(arr, n);
        System.out.println(missNum);
    }
}
