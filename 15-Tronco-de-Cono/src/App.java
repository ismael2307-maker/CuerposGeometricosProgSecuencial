import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);

        final double PI=3.1416;
        double AreaLateral,AreaTotal,Volumen;
        double g,AB,Ab,h,R,r;

        System.out.println("Digite el valor de la generatriz(g)");
        g=x.nextDouble();

        System.out.println("Digite el valor del Radio Mayor(R)");
        R=x.nextDouble();

        System.out.println("Digite el valor del radio menor(r)");
        r=x.nextDouble();

        System.out.println("Digite el valor de la altura(h)");
        h=x.nextDouble();

        //Operaciones.
        AreaLateral=PI*g*(R+r);

        AB=PI*Math.pow(R,2); //Formula de Abase mayor.
        Ab=PI*Math.pow(r,2); //Formula de Abase menor.
        AreaTotal=AreaLateral+AB+Ab;

        Volumen=PI*h*(Math.pow(R,2)+Math.pow(r,2)+R*r)/1/3;

        //Resultados.
        System.out.println("El Area Lateral del tronco de cono es de: "+AreaLateral+ " Unidades Cuadradas");
        System.out.println("El Area Total del tronco de cono es de: "+AreaTotal+ " Unidades Cuadradas");
        System.out.println("El Volumen del tronco de cono es de: "+Volumen+ " Unidades Cubicas");
        System.out.println("    ");

        //Nota:Estos valores(Abase mayor y Abase menor), es para poder calcular El area total Segun la formula de la imagen(aunque no apareza como obtenerlos)
        System.out.println("El valor de ABase Mayor es: "+AB+ " Unidades Cuadradas");
        System.out.println("El valor de Abase menor es: "+Ab+ " Unidades Cuadradas");
        System.out.println("    ");
         

        x.close();
    }
}
