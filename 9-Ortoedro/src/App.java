import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);

     double Area,Vol,Diagonal;
     double a,b,c;

     System.out.println("Digite el valor de a");
     a=x.nextDouble();

     System.out.println("Digite el valor de b");
     b=x.nextDouble();

     System.out.println("Digite el valor de c");
     c=x.nextDouble();

     //Operaciones
     Area=2*(a*b+a*c+b*c);
     Vol=a*b*c;
     Diagonal=Math.sqrt(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));

     //Resultados
     System.out.println("El area del Ortoedro es: "+Area+ " Unidades Cuadradas");
     System.out.println("El volumen del Ortoedro es: "+Vol+ " Unidades Cubicas");
     System.out.println("La diagonal del Ortoedro es: "+Diagonal+ " Unidades");

     x.close();
    }
}
