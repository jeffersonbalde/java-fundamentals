package inheritance;

public class Person {
    private String name;
    private String age;
    private String gender;

    public Person() {
        System.out.println("person constructor");
    }

    public Person(String name) {
        System.out.println("2nd person constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}