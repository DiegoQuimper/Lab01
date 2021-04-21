import java.util.Scanner;

public class Coordenada {
	
	   private double x;
	    private double y;
	    public Coordenada() {
	        Scanner cs= new Scanner(System.in);
	        System.out.print("Digite un punto de las esquinas del rectangulo: ");
	        this.x= cs.nextDouble();
	        System.out.print("Digite un punto de las esquinas del rectangulo: ");
	        this.y= cs.nextDouble();
	    }
	    public Coordenada(double x, double y) {
	        this.x=x;
	        this.y=y;
	    }
	    public Coordenada(Coordenada c) {
	        this.x=c.x;
	        this.y=c.y;
	    }
	    public double getX() {
	        return this.x;
	    }
	    public double getY() {
	        return y;
	    }
	    public void setY(double y) {
	        this.y = y;
	    }
	    public void setX(double x) {
	        this.x=x;
	    }
	    public double distancia (Coordenada c){
	        double dis=Math.sqrt(Math.pow(c.x - this.x, 2)+ Math.pow(c.y-this.y,2));
	        return dis;
	    }
	    public static double distancia (Coordenada c1, Coordenada c2){
	        double dis=Math.sqrt(Math.pow(c2.x - c1.x, 2)+ Math.pow(c2.y-c1.y,2));
	        return dis;
	    }
	    public String toString() {
	        return "["+this.x+", "+this.y+"]";
	    }
	}
	public class Rectangulo {
	    private Coordenada esquina1;
	    private Coordenada esquina2;
	    static double x1,y1,x2,y2,x3,y3,x4,y4;
	    static double x,y;
	    public Rectangulo(Coordenada c1, Coordenada c2) {
	        setEsquina1(c1);
	        setEsquina2(c2);
	    }

	    public Coordenada getEsquina1() {
	        return esquina1;
	    }
	    public void setEsquina1(Coordenada esquina1) {
	        this.esquina1 = esquina1;
	    }
	    public Coordenada getEsquina2() {
	        return esquina2;
	    }
	    public void setEsquina2(Coordenada esquina2) {
	        this.esquina2 = esquina2;
	    }
	    public static double calculoArea(Coordenada c1,Coordenada c2) {
	        x1=c1.getX();
	        y1=c1.getY();
	        x2=c2.getX();
	        y2=c2.getY();
	        double area;
	        double mayorx12, menorx12;
	        double mayory12, menory12;
	        if(x1>x2) {
	            mayorx12=x1;
	            menorx12=x2;
	        }else {
	            mayorx12=x2;
	            menorx12=x1;
	        }
	        if(y1>y2) {
	            mayory12=y1;
	            menory12=y2;
	        }else {
	            mayory12=y2;
	            menory12=y1;
	        }
	        x=mayorx12-menorx12;
	        y=mayory12-menory12;
	        area=x*y;
	        return area;

	    }


	    @Override
	    public String toString() {
	        return "("+this.esquina1+", "+ this.esquina2 + ")";
	    }

}
