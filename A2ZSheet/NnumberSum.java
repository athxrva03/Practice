public class NnumberSum{
    public static int sum(int n) {
        int sum = 0;
        if(n == 0){
            return 0;
        }
        sum = sum(n-1) + n;
        return sum;
    }

    public static void main(String[] args) {
        int s = sum(4);
        System.out.println(s);
    }
}