import java.util.Arrays;

public class Apartment implements Family {
Person[]people;
    public Apartment(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return " Батир   " + comunusluga()+
                " Жашаган адамдар " + Arrays.toString(people) +
                "" +PS();

    }


    @Override
    public String comunusluga() {
        return "Айына 500 $ Толойт ";
    }

    @Override
    public String PS() {
        return "атасы Полицейский болуп иштейт ";
    }
}

