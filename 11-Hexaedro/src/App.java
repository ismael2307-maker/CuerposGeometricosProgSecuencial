import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x = new Scanner(System.in);

        double Area,Vol,Diagonal,a;

        System.out.println("Digite el valor de a");
        a=x.nextDouble();

        //Operaciones.
        Area=6*Math.pow(a,2);
        Vol=Math.pow(a,3);
        Diagonal=a*Math.sqrt(3);

        //Resultados
        System.out.println("El area del Hexaedro es: "+Area+" Unidades Cuadradas");
        System.out.println("El Volumen del Hexaedro es: "+Vol+" Unidades Cubicas");
        System.out.println("La Diagonal del Hexaedro es: "+Diagonal+" Unidades");

      x.close();
    }
}
