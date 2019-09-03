import java.util.Scanner;
class Problem3
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int n = key.nextInt();
    if(n % 2 == 0 && n > 10)
    {
      System.out.printf("%d lebih besar dari 10 dan genap",n);
    }
    else if(n % 2 == 0 && n < 10)
    {
      System.out.printf("%d kurang dari 10 dan genap",n);
    }
    else if(n % 2 == 1 && n > 10)
    {
      System.out.printf("%d lebih besar dari 10 dan ganjil",n);
    }
    else
    {
      System.out.printf("%d kurang dari 10 dan ganjil",n);
    }

  }
}
