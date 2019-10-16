package FibCycle;

import java.util.Arrays;
import java.util.Scanner;

public class Fib {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);

    int[] fib = new int[30];

    fib[0] = 0;
    fib[1] = 1;
    fib[2] = 1;
    fib[3] = 2;
    fib[4] = 3;
    fib[5] = 5;

    for (int i = 6; i < 30; i++) {
      fib[i] = fib[i - 1] + fib[i - 2];
    }
    System.out.println(Arrays.toString(fib));

  }

}
