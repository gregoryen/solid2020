package pl.zzpj2020.solid.lsp.shape;

public class Circle extends Figure {
    private double pi;

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public double countSurface() {
        return super.getA() * Math.pow(pi,2);
    }

    @Override
    public double countCircuit() {
        return super.getA() * 2 * this.pi;
    }
}
