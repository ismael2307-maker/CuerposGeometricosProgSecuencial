import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
         double AreaLateral,AreaTotal,Volumen,Ac,l;
         double ap,h,PB,Pb,Ab1,Ab2;

         System.out.println("Digite el valor de las caras laterales del tronco de piramide");
         l=x.nextDouble();

         System.out.println("Digite el valor del apotema(ap)");
         ap=x.nextDouble();

         System.out.println("Digite el valor de la altutra(h)");
         h=x.nextDouble();

         System.out.println("Digite el valor de PB");
         PB=x.nextDouble();

         System.out.println("Digite el valor de Pb");
         Pb=x.nextDouble();

         //Operaciones
         Ac=(PB+Pb)*ap/2;
         AreaLateral=l*Ac;
         AreaTotal=AreaLateral+Math.pow(PB,2)+Math.pow(Pb,2);
         Ab1=Math.pow(PB,2);
         Ab2=Math.pow(Pb,2);
         Volumen=h*(Ab1+Ab2+Math.sqrt(Ab1*Ab2))/3;

         //Resultados
         System.out.println("El Area Lateral es: "+AreaLateral+ " Unidades Cuadradas");
         System.out.println("El Area Total es: "+AreaTotal+ " Unidades Cuadradas");
         System.out.println("El Volumen  es: "+Volumen+ " Unidades Cubicas");
         System.out.println(Ab1);
         System.out.println(Ab2);

        
    }
}
