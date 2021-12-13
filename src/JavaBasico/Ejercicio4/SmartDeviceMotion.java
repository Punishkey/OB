package JavaBasico.Ejercicio4;

public class SmartDeviceMotion {
    protected String maker;
    protected String model;
    protected String system;
    protected int ram;


    public SmartDeviceMotion() {}

    public SmartDeviceMotion(String maker, String model, String system, int ram) {
        this.maker = maker;
        this.model = model;
        this.system = system;
        this.ram = ram;
    }

    public String getmaker() {

        return this.maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;

    }

    public String getModel() {

        return this.model;
    }

    public void setModel(String model) {
        this.model = model;

    }

    public String getSystem() {

        return this.system;
    }

    public void setSystem(String system) {
        this.system = system;

    }

    public int getRam() {

        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;

    }

    @Override
    public String toString() {
        return "SmartDeviceMotion " +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", system='" + system + '\'' +
                ", ram=" + ram;
    }
}
