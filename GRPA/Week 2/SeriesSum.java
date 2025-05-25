import java.util.*;

public class SeriesSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    int sum = 0;

    for (int i = 1; i <= n; i++) {
      int subSum = 0;

      for (int j = 1; j <= i; j++) {
        subSum += j * j;
      }

      sum += subSum;
    }

    System.out.println(sum);
  }
}
