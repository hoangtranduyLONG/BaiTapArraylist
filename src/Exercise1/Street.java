package Exercise1;

public class Street {
private int  number;
private String address;

    public Street(int number, String address) {
        this.number = number;
        this.address = address;
    }
    public Street(){
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Street{" +
                "number=" + number +
                ", address='" + address + '\'' +
                '}';
    }
}
