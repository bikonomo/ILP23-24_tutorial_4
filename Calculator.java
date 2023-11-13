import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public static double pow(int a, int b) {
        return Math.pow(a, b);
    }

    public static int findMax(int[] arr){
        int max=0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int[] findFactors(int a) {
        List<Integer> factors = new ArrayList<>();
        for(int i = 1; i<a; i++) {
            if (a % i == 0) {
                factors.add(i);
            }
        }
        return factors.stream().mapToInt(i -> i).toArray();
    }
}
