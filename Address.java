package stream;

public class Address {
    private String villageName;
    private int pinCode;
    private String district;

    public Address(String villageName, int pinCode, String district) {
        this.villageName = villageName;
        this.pinCode = pinCode;
        this.district = district;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
