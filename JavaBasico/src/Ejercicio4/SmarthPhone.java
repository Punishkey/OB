package Ejercicio4;

public class SmarthPhone extends SmartDeviceMotion{
    protected double inches;

    public SmarthPhone(){}

    public SmarthPhone(double inches){

        this.inches = inches;
    }

    public void setInches(double inches) {

        this.inches = inches;
    }

    public double getInches() {

        return this.inches;
    }

    @Override
    public String toString() {
        return "SmartPhone " +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", system='" + system + '\'' +
                ", ram=" + ram +
                ", inches=" + inches;
    }
}