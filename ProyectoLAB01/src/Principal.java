import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
        int i=0;
        double distancia1, distancia2,area1,area2;
        System.out.println("        Rectangulo A            ");
        Coordenada p1;
        p1 = new Coordenada();
        Coordenada p2;
        p2 = new Coordenada();
        Rectangulo A = new Rectangulo(p1,p2);
        distancia1=Coordenada.distancia(p1, p2);
        area1=Rectangulo.calculoArea(p1, p2);


        System.out.println("        Rectangulo B            ");
        Coordenada p3;
        p3 = new Coordenada();
        Coordenada p4;
        p4 = new Coordenada();
        distancia2=Coordenada.distancia(p3, p4);
        Rectangulo B = new Rectangulo(p3, p4);
        area2=Rectangulo.calculoArea(p3, p4);
        System.out.println("Rectangulo A ="+A);
        System.out.println("Rectangulo B ="+B);
        Verificador v1;
        v1= new Verificador(p1,p2,p3,p4);
        if(Verificador.Sobrepos()==true) {
            System.out.println("El rectangulo A y B se sobreponen");
            System.out.println("Area de Sobreposición= "+Verificador.area);
        }
        if(Verificador.Junto()==true) {
            System.out.println("El rectangulo A y B se juntan");
        }
        if (Verificador.DisJunto()==true) {
            System.out.println("El rectangulo A y B son disjuntos");
        }
        ContainerRect co1;
        co1=new ContainerRect(A, distancia1,area1,i);
        i=i+1;
        ContainerRect co2;
        co2=new ContainerRect(B, distancia2,area2,i);
        System.out.println(co1);
        System.out.println(co2);
    }
	


}
	

