package Ejercicio4;

public class SmartWatch extends SmartDeviceMotion{
    protected boolean sumersible;

    public SmartWatch() {}

    public SmartWatch(boolean sumersible) {

        this.sumersible = sumersible;
    }

    public boolean isSumersible() {

        return this.sumersible;
    }

    public void isSumersible(boolean sumersible){

        this.sumersible = sumersible;
    }

    @Override
    public String toString() {
        return "SmartWatch " +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", system='" + system + '\'' +
                ", ram=" + ram +
                ", sumersible=" + sumersible;
    }
}
