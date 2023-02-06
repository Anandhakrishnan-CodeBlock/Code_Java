package Encapsulation;

class Language{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Language language = new Language();
        language.setName("Java");
        language.setAge(27);
        System.out.println(language.getName());
        System.out.println(language.getAge());
    }
}
/**
 * Encapsulation help to secure(hide) the field in a class
 * By defining private fields inside the class we can archive encapsulation
 */