import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);

       double Area,Vol,Altura;
       double a;

       System.out.println("Digite el valor de a");
       a=x.nextDouble();

       //Operaciones
       Area=Math.pow(a,2)*Math.sqrt(3);
       Vol=Math.sqrt(2)/12*Math.pow(a,3);
       Altura=a*Math.sqrt(6)/3;

       //Resultados
       System.out.println("El Area del Tetraedro es: "+Area+ "Unidades Cuadradas");
       System.out.println("El Volumen del Tetraedro es: "+Vol+ "Unidades Cubicas");
       System.out.println("La altura del Tetraedro es: "+Altura);

     x.close();
    }
}
