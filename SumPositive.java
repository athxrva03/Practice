public class SumPositive {
    public static int sumPositive(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            if (n > 0) {
                sum += n;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[] arr = {-2, 5, -7, 10, 3};
        int sumP = sumPositive(arr);
        System.out.println(sumP);
    }
}
