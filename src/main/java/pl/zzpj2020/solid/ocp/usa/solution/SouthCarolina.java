package pl.zzpj2020.solid.ocp.usa.solution;

public class SouthCarolina implements State {

    private static final int MAX_SPEED = 40;
    private static final String STATE_CODE = "SC";
    private static final double FINE = 12.00;

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
