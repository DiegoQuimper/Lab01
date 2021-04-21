
import java.util.Arrays;
public class Verificador {
	
//No funciona junto y disjunto	

	private Coordenada pu1;
	private Coordenada pu2;
	private Coordenada pu3;
	private Coordenada pu4;
	static double area=0;
	static double x1,y1,x2,y2,x3,y3,x4,y4;
	public Verificador(Coordenada c1, Coordenada c2, Coordenada c3, Coordenada c4) {
		setpu1(c1);
		setpu2(c2);
		setpu3(c3);
		setpu4(c4);	
		x1=c1.getX();
		y1=c1.getY();
		x2=c2.getX();
		y2=c2.getY();
		x3=c3.getX();
		y3=c3.getY();
		x4=c4.getX();
		y4=c4.getY();
	}

	public Coordenada getpu1() {
		return pu1;
	}

	public void setpu1(Coordenada pu1) {
		this.pu1 = pu1;
	}

	public Coordenada getpu2() {
		return pu2;
	}

	public void setpu2(Coordenada pu2) {
		this.pu2 = pu2;
	}

	public Coordenada getpu3() {
		return pu3;
	}

	public void setpu3(Coordenada pu3) {
		this.pu3 = pu3;
	}

	public Coordenada getpu4() {
		return pu4;
	}

	public void setpu4(Coordenada pu4) {
		this.pu4 = pu4;
	}

	public static boolean Sobrepos() {
		int con=0;
		double b=0,h = 0;
		
		if(x3<x1 && x1<x4) {
			con=con+1;
		}
		if(x1<x3 && x3<x2) {
			con=con+1;
		}
		if(y3<y1 && y1<y4) {
			con=con+1;
		}
		if(y1<y3 && y3<y2) {
			con=con+1;
		}
		if(y3<y1 && y1<y4) {
			con=con+1;
		}
		if(y1<y3 && y3<y2) {
			con=con+1;
		}
		
		
		if(x3<x1 && x1<x4||y3<y1 && y1<y4) {
			b=x2-x1-(x4-x3);
			h=y2-y1-(y4-y3);
		}
		if(x4<x1 && x1<x3||y4<y1 && y1<y3) {
			b=x1-x2-(x3-x4);
			h=y1-y2-(y3-y4);
		}
		if(x1<x3 && x3<x2||y1<y3 && y3<y2 ) {
			b=x4-x3-(x2-x1);
			h=y4-y3-(y2-y1);
		}
		if(x2<x3 && x3<x1||y2<y3 && y3<y1 ) {
			b=x3-x4-(x1-x2);
			h=y3-y4-(y1-y2);
		}
		area=b*h;
		if (area<0) {
			area=area*-1;
		}
		if(con>0) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean Junto() {
		int con=0;
		double mayorx12, menorx12, mayorx34,menorx34;
		double mayory12, menory12, mayory34,menory34;
		if(x1>x2) {
			mayorx12=x1;
			menorx12=x2;
		}else {
			mayorx12=x2;
			menorx12=x1;
		}
		if(x3>x4) {
			mayorx34=x3;
			menorx34=x4;
		}else {
			mayorx34=x4;
			menorx34=x3;
		}
		if(y1>y2) {
			mayory12=y1;
			menory12=y2;
		}else {
			mayory12=y2;
			menory12=y1;
		}
		if(x3>x4) {
			mayory34=y3;
			menory34=y4;
		}else {
			mayory34=y4;
			menory34=y3;
		}
		if(menorx34>menorx12 && menorx12>mayorx34 || menorx34<menorx12 && mayorx34<mayorx12) {
			con=0;
		}
		if(menorx12>menorx34 && menorx34>mayorx12 || menorx12<menorx34 && mayorx12<mayorx34) {
			con=0;
		}
		if(menory34>menory12 && menory12>mayory34 || menory34<menory12 && mayory34<mayory12) {
			con=0;
		}
		if(menory12>menory34 && menory34>mayory12 || menory12<menory34 && mayory12<mayory34) {
			con=0;
		}
		if(y2==y3) {
			con=con+1;
		}
		if(y1==y4) {
			con=con+1;
		}
		if(x2==x3) {
			con=con+1;
		}
		if(x1==x4) {
			con=con+1;
		}

		
		if(con>0) {
				return true;
		}else {
				return false;
		}
		
	}
	public static boolean DisJunto() {
		int con=0;
		double mayorx12, menorx12, mayorx34,menorx34;
		double mayory12, menory12, mayory34,menory34;
		if(x1>x2) {
			mayorx12=x1;
			menorx12=x2;
		}else {
			mayorx12=x2;
			menorx12=x1;
		}
		if(x3>x4) {
			mayorx34=x3;
			menorx34=x4;
		}else {
			mayorx34=x4;
			menorx34=x3;
		}
		if(y1>y2) {
			mayory12=y1;
			menory12=y2;
		}else {
			mayory12=y2;
			menory12=y1;
		}
		if(x3>x4) {
			mayory34=y3;
			menory34=y4;
		}else {
			mayory34=y4;
			menory34=y3;
		}
		if(y2==y3) {
			con=0;
		}
		if(y1==y4) {
			con=0;
		}
		if(x2==x3) {
			con=0;
		}
		if(x1==x4) {
			con=0;
		}
		
		if(menorx34>menorx12 && menorx12>mayorx34 || menorx34<menorx12 && mayorx34<mayorx12) {
			con=con+1;
		}
		if(menorx12>menorx34 && menorx34>mayorx12 || menorx12<menorx34 && mayorx12<mayorx34) {
			con=con+1;
		}
		if(menory34>menory12 && menory12>mayory34 || menory34<menory12 && mayory34<mayory12) {
			con=con+1;
		}
		if(menory12>menory34 && menory34>mayory12 || menory12<menory34 && mayory12<mayory34) {
			con=con+1;
		}
		if(x3<x1 && x1<x4) {
			con=0;
		}
		if(x1<x3 && x3<x2) {
			con=0;
		}
		if(y3<y1 && y1<y4) {
			con=0;
		}
		if(y1<y3 && y3<y2) {
			con=0;
		}
		if(y3<y1 && y1<y4) {
			con=0;
		}
		if(y1<y3 && y3<y2) {
			con=0;
		}
		
		if(con>0) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
		 


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

