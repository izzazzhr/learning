import java.util.Scanner;
class Problem2
{
  public static void main(String[] args)
  {
    Scanner key = new Scanner(System.in);
    int n = key.nextInt();
    String benar;
    benar = (n % 2 == 0) ? "genap":"ganjil";
    System.out.printf("%d %s",n,benar);
  }
}
