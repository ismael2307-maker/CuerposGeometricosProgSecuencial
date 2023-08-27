import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        
        final double PI=3.1416;
        double Al,At,r,g,h,Vol;

        System.out.println("Digite el radio menor(r)");
        r=x.nextDouble();

        System.out.println("Digite el Generatriz(g)");
        g=x.nextDouble();

        System.out.println("Digite la altura(h)");
        h=x.nextDouble();
       
        //Formulas de:Area Lateral(Al), Area Total(At) y Volumen(Vol).
        Al=PI*r*g;
        At=Al+(PI*Math.pow(r, 2));
        Vol=PI*Math.pow(r, 2)*h/3;

        //Resultados
        System.out.println("El area lateral es: "+Al+ " Unidades Cuadradas");
        System.out.println("El area total es: "+At+ " Unidades Cuadradas");
        System.out.println("El volumen es: "+Vol+ " Unidades Cubicas");
 
      x.close();
    }
}
