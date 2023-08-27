import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);

        final double PI=3.1416;
        double AreaC,Area,VolC,Vol,R,r,h;

        System.out.println("Digite el Radio Mayor(R)");
        R=x.nextDouble();

        System.out.println("Digite el Radio Menor(r)");
        r=x.nextDouble();

        System.out.println("Digite la altura(h)");
        h=x.nextDouble();

        //operaciones
        AreaC=2*PI*R*h; //En funcion del Radio de la esfera.
        Area=PI*(Math.pow(r,2)+Math.pow(h,2)); //En funcion del radio menor.
        VolC=PI*Math.pow(h,2)*(3*R-h)/3; //En funcion del Radio de la esfera.
        Vol=PI*h/6*(3*Math.pow(r,2)+Math.pow(h,2)); //En funcion del radio menor.

        //Resultados
        System.out.println("El Area del Casquete en funcion del Radio de la esfera es: "+AreaC+ " Unidades Cuadradas");
        System.out.println("El Area del Casquete en funcion del radio menor es: "+Area+ " Unidades Cuadradas");

        System.out.println("El Volumen del Casquete en funcion del Radio de la esfera es: "+VolC+ " Unidades Cubicas");
        System.out.println("El Volumen del Casquete en funcion del radio menor es: "+Vol+ " Unidades Cubicas");

      x.close();
    }
}
