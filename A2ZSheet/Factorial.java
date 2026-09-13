public class Factorial {
    public static int factorial(int n) {
        int fac = 1;
        if(n == 0){
            return 1;
        }
        fac = factorial(n-1) * n;
        return fac;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
