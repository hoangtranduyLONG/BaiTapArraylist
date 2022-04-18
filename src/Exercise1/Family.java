package Exercise1;

import java.util.ArrayList;

public class Family {
    ArrayList<People> people;

    public Family() {
        this.people = new ArrayList<>();
    }

    public Family(ArrayList<People> people) {
        this.people = people;
    }

    public void add(People people) {
        this.people.add(people);
    }


    public void display() {
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

    }

    public int findByName(String name) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).equals(people)) {
                return i;
            }

        }
        return -1;
    }

    public void edit(String Name, People people) {
        int indexOfStudent = findByName(Name);
        if (indexOfStudent == -1) {
            System.out.println("Không :)))");
        } else {
            this.people.set(indexOfStudent, people);
        }
    }

    public void delete(String name) {
        int indexOfStudent = findByName(name);
        if (indexOfStudent == -1) {
            System.out.println("Không  :)))");
        } else {
            people.remove(indexOfStudent);
        }
    }
}