import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner x=new Scanner(System.in);

        //Declaracion de variables
        final double PI=3.1416;
        double Area,Vol,r;

        System.out.println("Digite el Radio(r)");
        r=x.nextDouble();

        //Formulas para calcular area y volumen
        Area=4*PI*Math.pow(r,2);
        Vol=PI*Math.pow(r, 3)*4/3;

        //Resultados

        System.out.println("El area de la esfera es: "+Area+ " Unidades Cuadradas");
        System.out.println("El Volumen de la esfera es: "+Vol+ " Unidades Cubicas");

     x.close();
    }
}
