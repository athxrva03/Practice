public class Average {
    public static double average(int[] arr){
        double l = arr.length;
        double avg = 0;
        for(int num : arr){
            avg += num;
        }
        avg = avg / l;
        return avg;
    }

    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40};
        double avg = average(arr);
        System.out.println(avg);
    }
}
