import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		 Rectangulo ArreRectan[]=new Rectangulo[20];
		 Coordenada ArreCord[]=new Coordenada[50];
		 int i;
		 double X,Y;
		 Coordenada C1=new Coordenada(7.7,2.2);
		 Coordenada C2=new Coordenada(1.5,0.3);
		 Rectangulo Rec1=new Rectangulo(C1,C2);
		 Coordenada C3=new Coordenada(9.4,-2.5);
		 Coordenada C4=new Coordenada(4.0,4.2);
		 Rectangulo Rec2=new Rectangulo(C3,C4);
		 ContainerRect Cont1=new ContainerRect(Rec1,Coordenada.distancia(C1,C2),Rec1.calculoArea(C1, C2),0);
		
		 System.out.println("Cuantas rectangulos desea mostrar?");
		 int n = Scanner.nextInt();
		 Cont1.setN(n);
		 for (i=0;i<n;i++){

		 System.out.print("Ingrese una esquina del 1er rectangulo: ");
		 X = Scanner.nextDouble();
		 Y = Scanner.nextDouble();
		 System.out.println();
		 ArreCord[i*4]=new Coordenada(X,Y);

		 System.out.print("Ingrese la esquina opuesta del 1er rectangulo: ");
		 X = Scanner.nextDouble();
		 Y = Scanner.nextDouble();
		 System.out.println();
		 ArreCord[(i*4)+1]=new Coordenada(X,Y);

		 ArreRectan[(i*2)]=new Rectangulo(ArreCord[i*4],ArreCord[(i*4)+1]);

		 System.out.print("Ingrese una esquina del 2do rectangulo:");
		 X = Scanner.nextDouble();
		 Y = Scanner.nextDouble();
		 System.out.println();
		 ArreCord[(i*4)+2]=new Coordenada(X,Y);

		 System.out.print("Ingrese la esquina opuesta del 2do rectangulo:");
		 X = Scanner.nextDouble();
		 Y = Scanner.nextDouble();
		 System.out.println();
		 ArreCord[(i*4)+3]=new Coordenada(X,Y);
		 ArreRectan[(i*2)+1]=new Rectangulo(ArreCord[(i*4)+2],ArreCord[(i*4)+3]);

		 System.out.println("Rectangulo A="+ArreRectan[i*2].toString());
		 System.out.println("Rectangulo B="+ArreRectan[(i*2)+1].toString());
		 Verificador V1=new Verificador(ArreRectan[i*2],ArreRectan[(i*2)+1]);
		 V1.Verific(ArreRectan[i*2], ArreRectan[(i*2)+1]);
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/**
		Coordenada p1;
		Double a1,a2,b1,b2;
		Double c1,c2,d1,d2;
		
	
        //System.out.println ("Ingrese una esquina del 1er rectangulo:");
        
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        //a1 = entradaEscaner.nextDouble (); //Invocamos un método sobre un objeto Scanner
        //a2 = entradaEscaner.nextDouble (); //Invocamos un método sobre un objeto Scanner

        //System.out.println ("Ingrese una esquina opuesta del 1er rectangulo:");
        //b1 = entradaEscaner.nextDouble (); //Invocamos un método sobre un objeto Scanner
        //b2 = entradaEscaner.nextDouble (); //Invocamos un método sobre un objeto Scanner
        
        //System.out.println ("Ingrese una esquina del 2do rectangulo:");
        //c1 = entradaEscaner.nextDouble (); //Invocamos un método sobre un objeto Scanner
        //c2 = entradaEscaner.nextDouble (); //Invocamos un método sobre un objeto Scanner
        //System.out.println ("Ingrese una esquina opuesta del 2do rectangulo:");

        //d1 = entradaEscaner.nextDouble (); //Invocamos un método sobre un objeto Scanner
        //d2 = entradaEscaner.nextDouble (); //Invocamos un método sobre un objeto Scanner
        
        
        
        System.out.println ("Ingrese una esquina del 1er rectangulo:");
		p1= new Coordenada( a1 = entradaEscaner.nextDouble (),a2 = entradaEscaner.nextDouble ());
		
		//Coordenada p1= new Coordenada();
		
		System.out.println ("Ingrese una esquina opuesta del 1er rectangulo:");
		Coordenada p2= new Coordenada( b1 = entradaEscaner.nextDouble (), b2 = entradaEscaner.nextDouble ());
		
		//p1.setX(-34.2);
		

		
		Rectangulo A =new Rectangulo(p1,p2);
		
		System.out.println ("Ingrese una esquina del 2do rectangulo:");
		System.out.println ("Ingrese una esquina opuesta del 2do rectangulo:");
		Rectangulo B =new Rectangulo(new Coordenada( c1 = entradaEscaner.nextDouble (),c2 = entradaEscaner.nextDouble ()),new Coordenada(d1 = entradaEscaner.nextDouble (),d2 = entradaEscaner.nextDouble ()));

      
		System.out.println("Rectangulo A="+A);
		System.out.println("Rectangulo B="+B);  

        //System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
		
		System.out.println("Punto1:"+p1);
		System.out.println("Punto2:"+p2);
		
		System.out.println(p1.distancia(p2));
		System.out.println(Coordenada.distancia(p1,p2));
		
		
	}
	**/

	}
	
}
