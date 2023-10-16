public class Student {
    private final String name;
    private final String surname;
    private int id;

    public Student(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    
    public String getFullName(){
        return name + " "+ surname;
    }

    public int getId() {
        return id;
    }
}
