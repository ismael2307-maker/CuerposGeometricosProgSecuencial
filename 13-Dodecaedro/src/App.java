import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
       
        double Area, volumen,a;

        System.out.println("Digite el valor de la arista(a)");
        a=x.nextDouble();
        
        //Operaciones
        Area=3*Math.pow(a, 2)*Math.sqrt(25+10*Math.sqrt(5));
        volumen=(15+7*Math.sqrt(5))*Math.pow(a, 3)/4;

        //Resultados
        System.out.println("El area es: "+Area+ " Unidades Cuadradas");
        System.out.println("El Volumen es: "+volumen+ " Unidades Cubicas");
     x.close();
    }
}
