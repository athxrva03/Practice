public class IsPrime {
    public boolean isPrime(int n) {
        for(int i = 2 ; i*i <= n; i++){
            if(n % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 33;
        IsPrime obj = new IsPrime();
        boolean isp = obj.isPrime(n);
        System.out.println(isp);
    }
}
