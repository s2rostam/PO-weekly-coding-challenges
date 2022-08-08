import java.util.ArrayList;
import java.util.List;

public class RootQuadratic {
    public int findRoot(int a, int b, int c) {
        return (int) (Math.round(-b + Math.sqrt(Math.pow(-b, 2) - 4 * a * c)/(2*a)));
    }
    
    public static void main(String[] args) {
        List<Integer> results = new ArrayList<>();
        RootQuadratic rQ = new RootQuadratic();
        
        results.add(rQ.findRoot(1, 2, -3));
        results.add(rQ.findRoot(2, -7, 3));
        results.add(rQ.findRoot(1, -12, -28));

        System.out.println(results.toString());
    }
}