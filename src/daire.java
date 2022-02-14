import java.util.Scanner;
public class daire {
    public static void main (String[] args)
    {
        double pi,alan,cevre,acı,cap,merkez,dilim;
        Scanner inp  = new Scanner(System.in);
        pi =3.14 ;
        System.out.println("Pi Sayısı :" + pi);
        System.out.print("Dairenin Yarıçapı :");
        cap = inp.nextDouble();
        System.out.print("Merkez açısı :");
        merkez = inp.nextDouble();
        alan = (pi * (cap * cap));
        System.out.println("Dairenin Alanı :" + alan);
        cevre = (2*(pi*cap));
        System.out.println("Dairenin Çevresi :" + cevre);
        dilim = ((pi*(cap*cap)*merkez)/360);
        System.out.println("Dairenin Diliminin Alanı :" + dilim);



    }
}
