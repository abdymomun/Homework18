import java.util.Arrays;

public class House implements Family{
    Person[]people;
private String name;
private int age;

    public House(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public House(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return " Уй було  " +comunusluga()+
                "Жашаган адамдар " + Arrays.toString(people) +
                ""+PS();
    }

    @Override
    public String comunusluga() {
        return " комуналбный услугага 200 $ толойт  ";
    }

    @Override
    public String PS() {
        return "Атасы Прогграмист болуп иштейт ";
    }

}

