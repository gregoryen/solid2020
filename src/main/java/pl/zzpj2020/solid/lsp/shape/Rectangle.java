package pl.zzpj2020.solid.lsp.shape;

public class Rectangle extends Figure {

    private double b;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double countCircuit() {
        return super.getA() * this.b;
    }

    @Override
    public double countSurface() {
        return super.getA() * 2 + this.b * 2;
    }
}
