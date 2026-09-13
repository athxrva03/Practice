public class IsPalindrome {
    public static boolean isPalindrome(int[] arr) {
        int l = 0 ;
        int r = arr.length-1;
        while(l < r){
            if(arr[l] != arr[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean isPalim = isPalindrome(arr);
        System.out.println(isPalim);
    }
}
