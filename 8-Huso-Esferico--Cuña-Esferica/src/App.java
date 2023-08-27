import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner x=new Scanner(System.in);

       final double PI=3.1416;
       double R,Angulo,Area,Vol;

       System.out.println("Digite el Radio Mayor(R)");
       R=x.nextDouble();

       System.out.println("Digite el angulo(Angulo)");
       Angulo=x.nextDouble();

       //Operaciones
       Area=PI*Math.pow(R,2)*Angulo/90; //Formula simplificada
       Vol=PI*Math.pow(R,3)*Angulo/270; //Formula Simplificada;

       //Resultados
       System.out.println("El Area del Huso Esferico es: "+Area+ " Unidades Cuadradas");
       System.out.println("El Volumen de la Cuña Esferica es: "+Vol+ " Unidades Cubicas");
       
     x.close();
    }
}
