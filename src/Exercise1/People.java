package Exercise1;

public class People {
    private int id;
    private String name;
    private int tuoi;
    private String job;
    private int  number;
    private String address;

    public People(int id, String name, int tuoi, String job, int number, String address) {
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
        this.job = job;
        this.number = number;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
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

    public People() {

    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tuoi=" + tuoi +
                ", job='" + job + '\'' +
                ", number=" + number +
                ", address='" + address + '\'' +
                '}';
    }
}
