package pl.zzpj2020.solid.lsp.shape;

public class Figure {
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double countSurface(){
        return a * a;
    }

    public double countCircuit(){
        return 4 * a;
    }


}
