import java.util.Arrays;

public class ContainerRect {
    int n, conteo, i;
    int arrN[] = new int[20];
    Rectangulo arrRec[]=new Rectangulo[20];
    double arrDi[]=new double[20];
    double arrAr[]=new double[20];
    public ContainerRect(Rectangulo rec, double dist, double area, int i) {
        this.i=i;
        conteo=i+1;
        arrRec[i]=rec;
        arrDi[i]=dist;
        arrAr[i]=area;

    }
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    @Override
    public String toString() {
        return this.conteo+".- [ "+arrRec[i]+" ] "+"[ "+arrDi[i]+" ] "+"[ "+arrAr[i]+" ]";
    }

}