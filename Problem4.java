import java.util.Scanner;
class Problem4
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int n = key.nextInt();
    if(n % 2 == 0 && 10 < n && n < 100)
    {
      System.out.printf("%d antara 10 sampai 100 dan genap",n);
    }
    else if(n % 2 == 0)
    {
      System.out.printf("%d kurang dari 10 dan genap",n);
    }
    else if(n % 2 == 1 && n > 10 && n < 100)
    {
      System.out.printf("%d antara 10 sampai 100 dan ganjil",n);
    }
    else
    {
      System.out.printf("%d kurang dari 10 lebih besar dari 100 dan ganjil",n);
    }
  }
}
