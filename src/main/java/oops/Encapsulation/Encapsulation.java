package oops.Encapsulation;

//Encapsulation means wrapping data (variables) and methods into a single unit (class) and restricting direct access to the data.
class Student {

    // Private variables
    private String name;
    private int age;

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        // Setting values
        s.setName("Tanu");
        s.setAge(24);

        // Getting values
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
