package pl.zzpj2020.solid.ocp.usa.solution;

public class Georgia implements State {
    private static final int MAX_SPEED = 45;
    private static final String STATE_CODE = "GA";
    private static final double FINE = 10.00;

    @Override
    public int getSpeedLimit() {
        return this.MAX_SPEED;
    }

    @Override
    public String getStateCode() {
        return this.STATE_CODE;
    }

    @Override
    public double getFine() {
        return this.FINE;
    }
}
