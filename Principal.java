
public class Principal {

	public static void main(String[] args) {
		Coordenada p1;
		p1= new Coordenada(0, 0);
		//Coordenada p1= new Coordenada();
		Coordenada p2= new Coordenada(10,-2);
		p1.setX(-34);
		
		Rectangulo A =new Rectangulo(p1,p2);
		Rectangulo B =new Rectangulo(new Coordenada(10,-5),new Coordenada(-4,12));
		System.out.println("Rectangulo A="+A);
		System.out.println("Rectangulo B="+B);
		
		
		System.out.println(p1);
		System.out.println("Punto2:"+p2);
		
		System.out.println(p1.distancia(p2));
		System.out.println(Coordenada.distancia(p1,p2));
	}

}
