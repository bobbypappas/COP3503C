// Bobby Pappas
// COP 3503, Fall 2020
// NID: 3930049

import java.util.*;

public class RunLikeHell
{
  public static int maxGain(int [] blocks)
  {
    int a = blocks[0];
    int b = 0;
    int c = 0;

    for (int i = 1; i <= blocks.length - 1; i++)
    {
      c = a;
      a = Math.max(b + blocks[i], a);
      b = c;
    }

    return Math.max(Math.max(a, b), c);
  }

  public static double difficultyRating()
  {
      return 3.2;
  }

  public static double hoursSpent()
  {
      return 5.2;
  }

  public static void main(String[] args)
  {
      int [] blocks = new int[] {1, 15, 3, 6, 17, 2, 1, 20};

      System.out.println(maxGain(blocks));
  }
}
