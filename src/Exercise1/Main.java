package Exercise1;

public class Main {
    public static void main(String[] args) {
        Family family =new Family();
        family.add(new People(324,"Dương",24,"Doctor"));
        family.add(new People(6912,"Phương Anh",27,"Sale"));
        family.display();
        family.edit("Dương",new People( 223,"Linh Chi",25,"Singer"));
        family.delete("Phương Anh");
        System.out.println(family.findByName("Dương"));

    }
}
