import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);

        double Area, Volumen;
        double a;
 
        System.out.println("Digite el valor de la arista(a)");
        a=x.nextDouble();

        //Operaciones
        Area=5*Math.pow(a,2)*Math.sqrt(3);
        Volumen=(3+Math.sqrt(5))*Math.pow(a, 3)*5/12;

        //Resultados
        System.out.println("El Area es: "+Area+ "Unidades Cuadradas");
        System.out.println("El Volumen es: "+Volumen+ "Unidades Cubicas");

       x.close();
    }
}
