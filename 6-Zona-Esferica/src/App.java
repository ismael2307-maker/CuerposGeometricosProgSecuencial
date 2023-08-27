import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
       
        final double PI=3.1416;
        double R,h,r1,r2,Az,Vol;

        System.out.println("Digite el Radio Mayor(R)");
        R=x.nextDouble();

        System.out.println("Digite el Radio Menor 1(r1)");
        r1=x.nextDouble();

        System.out.println("Digite el Radio Menor 2(r2)");
        r2=x.nextDouble();

        System.out.println("Digite la Altura(h)");
        h=x.nextDouble();


        //Formulas de: area(Az) y Volumen(Vol).
        Az=2*PI*R*h;
        Vol=PI*h/6*(3*Math.pow(r1, 2)+3*Math.pow(r2,2)+Math.pow(h,2));

        //Resultados.
        System.out.println("El Area de la zona Esferica es: "+Az+ " Unidades Cuadradas");
        System.out.println("El Volumen de la zona Esferica es: "+Vol+ " Unidades Cubicas");

     x.close();
    }
}
