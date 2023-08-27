import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);

        double Area,Volumen;
        double a;

        System.out.println("Digite el valor de a");
        a=x.nextDouble();

        // Operaciones
        Area=2*Math.pow(a,2)*Math.sqrt(3);
        Volumen=Math.sqrt(2)/3*Math.pow(a,3); 

        //Resultados
        System.out.println("El area del Octaedro es:"+Area+ " Unidades Cuadradas");
        System.out.println("El Volumen del Octaedro es:"+Volumen+ " Unidades Cubicas");





    }
}
