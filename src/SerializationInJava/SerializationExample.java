package SerializationInJava;

import java.io.*;

// Define a serializable class
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    transient private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}

public class SerializationExample {

    public static void main(String[] args) {
        // Serialize object
        Person person =
                new Person("John", 30, "john@example.com");
        try (FileOutputStream fos = new FileOutputStream("person.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(person);
            System.out.println("Serialization successful");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize object
        try (FileInputStream fis = new FileInputStream("person.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialization successful");
            System.out.println("Deserialized Person: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
