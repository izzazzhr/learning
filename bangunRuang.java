import java.util.Scanner;

public class bangunRuang {

    public static void main(String [] args){
        Scanner input = new Scanner (System.in);

        System.out.println("------- Hitung Balok -------");
        System.out.print("Input panjang -->.");
        double panjang = input.nextDouble();
        System.out.print("Input lebar -->");
        double lebar = input.nextDouble();
        System.out.print("Input tinggi -->");
        double tinggi = input.nextDouble();
        double volume = panjang * lebar * tinggi;
        double luasP = (2 * panjang * lebar) + ( 2 * panjang * tinggi ) + ( 2 * lebar * tinggi );
        System.out.println("Volume balok adalah = " + volume);
        System.out.println("Luas permukaan balok adalah = " +luasP);

        System.out.println("----- Hitung Bola -----");
        System.out.print("Input jari-jari -->");
        double jari = input.nextDouble();
        double luasPerBola = 4 * Math.PI * Math.pow(jari,2);
        double volBola = 4 * (Math.PI * Math.pow(jari,3)) / 3;
        System.out.printf("Luas permukaan bola adalah = %.2f \n",luasPerBola);
        System.out.printf("Volume bola adalah =  %.2f \n" , volBola);


        System.out.println("----- Hitung Tabung -----");
        System.out.print("Input jari - jari -->");
        double r = input.nextDouble();
        System.out.print("Input tinggi -->");
        double t = input.nextDouble();
        double volTabung = Math.PI * Math.pow(r,2) * t;
        System.out.printf("Volume tabung adalah = %.2f \n",volTabung);

        System.out.println("----- Hitung Limas segiempat -----");
        System.out.print("Input panjang -->");
        double p = input.nextDouble();
        System.out.print("Input lebar -->");
        double l = input.nextDouble();
        System.out.println("Input tinggi -->");
        double ting = input.nextDouble();
        double volLim = ( p * l * ting ) / 3;
        System.out.printf("Volume limas segiempat adalah = %.2f \n", volLim);

        System.out.println("----- Hitung Prisma segitiga -----");
        System.out.println("Input panjang -->");
        double pPrisma = input.nextDouble();
        System.out.println("Input lebar -->");
        double lPrisma = input.nextDouble();
        System.out.println("Input tinggi -->");
        double tPrisma = input.nextDouble();
        double  volPrisma = (pPrisma * lPrisma * tPrisma) / 2;
        System.out.println("Volume Prisma Segitiga adalah " +volPrisma);



    }


}
