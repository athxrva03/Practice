public class ArmstrongNumber{
    public boolean isArmstrong(int n) {
        int numOfDig = String.valueOf(n).length();
        int num = n;
        int sum = 0;
        while (num > 0){
            int d = num % 10;
            sum = sum + (int) Math.pow(d,numOfDig);
            num /= 10;
        }
        return n==sum ? true : false;
    }

    public static void main(String[] args){
        int a = 153;
        int b = 121;

        ArmstrongNumber objA = new ArmstrongNumber();
        ArmstrongNumber objB = new ArmstrongNumber();

        boolean isA = objA.isArmstrong(a);
        boolean isB = objB.isArmstrong(b);

        System.out.println("isA: " + isA + "\nisB: " + isB);
    }
}