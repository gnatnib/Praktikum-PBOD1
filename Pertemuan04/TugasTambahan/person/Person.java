package TugasTambahan.person;

public class Person {
    protected String name;
    protected String address;
    protected int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getDetails() {
        System.out.println("====================================");
        System.out.println("Nama   : " + name);
        System.out.println("Alamat : " + address);
        System.out.println("Umur   : " + age);
        System.out.println("====================================");
    }
    
}