
import FibonacciSeries.*;

public class App {
    public static void main(String[] args) throws Exception {
        int n = 8;
        for (int i = 0; i < n; i++) {
            System.out.print(FibonacciSeries.fibSeries(i) + ", ");
        }

    }
}
