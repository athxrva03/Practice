public class UniqueElement {
    public static int uniqueElement(int[] arr) {
        int result = 0;
        for(int i : arr){
            result = result ^ i;
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr = {7, 3, 5, 3, 5};
        int unique = uniqueElement(arr);
        System.out.println(unique);
    }
}
