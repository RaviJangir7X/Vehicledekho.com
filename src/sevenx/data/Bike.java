package sevenx.data;

public class Bike extends Vehicle{
    private int wheels=2;
    private int cc;
    private String brakeType;
    public int getNumberOfWheels() {
        return wheels;
    }
    public int getPower() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getBrakeType() {
        return brakeType;
    }
    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }
}
