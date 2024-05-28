package ShallowVsDeepCopy;


class Address implements Cloneable {
    String city;
    String country;

    Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    // Deep copy
    protected Object clone() throws CloneNotSupportedException {
        return new Address(this.city, this.country);
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy
    protected Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) this.address.clone();
        return cloned;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Pune", "India");
        Person person1 = new Person("John", address);
        Person person2 = (Person) person1.clone();
        System.out.println(person1.name);
        System.out.println(person2.name);
        System.out.println(person1.address.city);
        System.out.println(person2.address.city);
        System.out.println("-------------------------------------");
        // Change the address of person2
        person2.name = "Paul";
        person2.address.city = "Mumbai";

        System.out.println(person1.name);
        System.out.println(person2.name);
        System.out.println(person1.address.city);
        System.out.println(person2.address.city);
    }
}
