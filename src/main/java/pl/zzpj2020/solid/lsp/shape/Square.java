package pl.zzpj2020.solid.lsp.shape;

public class Square extends Figure {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    double countSurface() {
        return this.length * this.length;
    }

    @Override
    double countCircuit() {
        return 4 * this.length;
    }
}
