package Practise;

public class Person {

    private String gender;
    private int age;
    private String name;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String gender, int age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + gender + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
