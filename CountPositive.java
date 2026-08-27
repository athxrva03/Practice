public class CountPositive {
    public static int countPositive(int[] arr) {
        int c = 0;
        for (int n : arr) {
            if (n > 0) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args){
        int[] arr = {-2, 5, -7, 10, 3};
        int sumP = countPositive(arr);
        System.out.println(sumP);
    }
}