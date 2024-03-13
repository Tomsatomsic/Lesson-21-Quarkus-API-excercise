package cz.spsmb.DTO;

public class PersonDTO {
    String text;
    String name;
    int age;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "text='" + text + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }}



