import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        double pb,ap,Ap,h,Al,At,Ab,Vt ;

        System.out.println("Digite el Apotema Base(ap)");
        ap=x.nextDouble();

        System.out.println("Digite el apotema Piramide(Ap)");
        Ap=x.nextDouble();

        System.out.println("Digite la altura(h)");
        h=x.nextDouble();

        //Formulas para calcular:Pbase(pb), Area Lateral(Al), Abase(Ab) y Volumen(Vt).
        pb=4*ap;
        Al=pb*Ap/2;
        Ab=ap*ap;
        At=Al+Ab;
        Vt=Ab*h/3;
        System.out.println("El area lateral es: "+Al+" Unidades Cuadradas");
        System.out.println("El area total es: "+At+" Unidades Cuadradas");
        System.out.println("El Volumen es: "+Vt+" Unidades Cubicas");

        x.close();
    }
}
