package sevenx.data;

public class Car extends Vehicle{
    private int  wheels=4;
    private int horsePower;
    private String transmissionType;
    private int bootSpace;

    public int getNumberOfWheels() {
        return wheels;
    }
    public int getPower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getTransmissionType() {
        return transmissionType;
    }
    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getBootSpace() {
        return bootSpace;
    }
    public void setBootSpace(int bootSpace) {
        this.bootSpace = bootSpace;
    }
}
