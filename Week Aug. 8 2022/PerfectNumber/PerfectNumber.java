import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PerfectNumber {

    public boolean isPerfectNumber(int value) {
        Set<Integer> factors = new HashSet<>();
        //even
        if (value % 2 == 0) {
            factors.add(1);
            for (int i = 2; i <= value/2; i++) {
                if (value%i == 0) {
                    factors.add(i);
                }
            }
        }
        //odd
        else {
            factors.add(1);
            for (int i = 3; i < Math.floor(value/3); i+=2) {
                if (value%i == 0) {
                    factors.add(i);
                }
            }
        }

        //Find sums
        List<Integer> arrFactors = new ArrayList<>(factors);
        for (int i = 0; i < arrFactors.size()-1; i++) {
            int sum = arrFactors.get(i);
            for (int j = i+1; j <= arrFactors.size()-1; j++) {
                sum += arrFactors.get(j);
                if (sum == value) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        PerfectNumber pN = new PerfectNumber();
        boolean result = pN.isPerfectNumber(8128); //Expected result: true
        System.out.println("Perfect number?: " + result);
    }
}