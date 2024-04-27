package RecordsDemo;

public class RecordsDemo {

    public static void main(String[] args) {
        Student s1 = new Student("John",20,"A");
        Student s2 = new Student("Paul",25,"B");

        System.out.println(s1.toString());
        System.out.println(s2.name());
    }
}
