import java.util.Scanner;
class Quiz01{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int penalty = -200;
    int insentif=0;
    int insentifLebih=0;
    int totalInsentif=0;
    System.out.print("Input Jumlah SKS... ");
    int sks =  input.nextInt();
    if(sks >=8){
      insentif = 200*8;
      insentifLebih = 100*(sks-8);
      System.out.printf("Insentif dasar = %d\n", 8);
      System.out.printf("Insentif lebih = %d\n", sks-8);
      totalInsentif = insentif + insentifLebih;
    }else if (sks < 8 && sks >0){
      System.out.printf("Insentif dasar = %d\n", 0);
      System.out.printf("Denda = %d\n",penalty);
      totalInsentif = penalty;
    }else{
      System.out.println("Anda tidak pernah mengajar");
    }
    System.out.printf("Total insentif = $%d \n",totalInsentif);
  }
}
