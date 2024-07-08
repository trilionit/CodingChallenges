/*
 * Given a number n, print n-th Fibonacci Number.
 * The Fibonacci numbers are the numbers in the following integer sequence: 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
 */
package CodingChallenges.Algorithms.FibonacciSeries;

public class FibonacciSeries {
  static int[] fibCache;
  public static int fibSeries(int n){
    if(n <= 1){
      // System.out.println(n);
      return n;
    }
    int n1 = 0;
    int n2 = 1;
    int temp = 1;
    for(int i = 2; i <= n; i++){
      // System.out.print(n1 + ", ");
      temp = n1 + n2;
      n1 = n2;
      n2 = temp;
      
    }
    return temp;
  }


  public static int fibRecursion(int n){
    int res = dp(n);
    return res;
  }

  private static int dp(int n){
    if(n <= 1){
      return n;
    }

    if(fibCache[n] != 0){
      return fibCache[n];
    }

    fibCache[n] = (fibRecursion(n -1) + fibRecursion(n-2));
    return fibCache[n];
  }


  public static void main(String[] args) {
    int n = 2;
    fibCache = new int[n +1];
  
    // fib.fibRecursion(n);
    
    // System.out.println();
    
   // System.out.println("\n-----");

    for(int i = 0; i <= n; i++){
      System.out.print(fibRecursion(n) + ", ");
    }
  }
}
