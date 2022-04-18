package Exercise1;

public class People {
    private int id;
    private String name;
    private int tuoi;
private String job;
    public People(int id, String name, int tuoi,String job) {
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
        this.job = job;
    }
    public People(){
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
    public String getjob() {
        return job;
    }

    public void setjob(String job) {
        this.job = job;
    }
    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
