package magicnumberdp;

import java.util.Scanner;

public class MagicNumberDP {

  public static void main(String[] args) {
    int n = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the total number of elements in the list");
    n = sc.nextInt();
    int[] list = new int[n];
    for (int i = 0; i < n; i++) {
      list[i] = sc.nextInt();
    }
    System.out.println("Enter the magin number");
    int mgn = sc.nextInt();
    System.out.println(helper(list, mgn));
  }

  public static boolean helper(int[] list, int mgn) {
    int len = list.length;
    int ind = 0;
    int sum = 0;
    if (mgn == 0) {
      if (len == 0) {
        return true;
      }
    } else if (len == 0) {
      return false;
    } else {
      int tot = 0;
      for (int i = 0; i < len; i++) {
        tot = tot + list[i];
      }
      if (tot < mgn) {
        return false;
      }
    }
    return recur(list, mgn, len, ind, sum);
  }

  public static boolean recur(int[] list, int mgn, int len, int ind, int sum) {
    if (len == ind) {
      if (sum == mgn) {
        return true;
      } else {
        return false;
      }
    }

    int temp = list[ind];
    ind = ind + 1;
    boolean res1 = recur(list, mgn, len, ind, sum + temp);
    if (!res1) {
      return recur(list, mgn, len, ind, sum - temp);
    }
    return true;
  }
}
