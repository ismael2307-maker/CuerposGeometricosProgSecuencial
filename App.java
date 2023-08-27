import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);

        final double PI=3.1416;
        double Al,At,Vt,Pbase,r,h;

        System.out.println("Digite el radio(r)");
        r=x.nextDouble();
        
        System.out.println("Digite la altura(h)");
        h=x.nextDouble();
    
        //Formulas de: Pbase(Pbase), Area Lateral(Al), Area Total(At) y Volumen(Vt).
        Pbase=2*PI*(r);
        Al=Pbase*h;
        At=2*PI*(r)*(h+r);
        Vt=PI*Math.pow(r, 2)*(h);

        System.out.println("El Area Lateral es:"+Al+ " Unidades Cuadradas");
        System.out.println("El Area total es:"+At+ " Unidades Cuadradas");
        System.out.println("El Volumen Total es:"+Vt+ " Unidades Cubicas");

        x.close();
    }
    
}