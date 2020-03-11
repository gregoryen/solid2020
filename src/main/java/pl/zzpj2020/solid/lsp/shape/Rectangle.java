package pl.zzpj2020.solid.lsp.shape;

public class Rectangle extends Figure{

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double countCircuit() {
        return this.width * 2 + this.length * 2;
    }

    @Override
    public double countSurface() {
        return this.width * this.length;
    }
}
