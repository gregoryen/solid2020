package pl.zzpj2020.solid.lsp.shape;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double countSurface() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double countCircuit() {
        return radius * 2 * Math.PI;
    }
}
