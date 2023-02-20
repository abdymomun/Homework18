import java.util.Arrays;

public class HotelRoom implements Family {
    @Override
    public String PS() {
        return "Атасы Повар болуп иштейт ";
    }

    Person[] people;

    public HotelRoom(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return " Мейман кана  " + comunusluga()+
                "Жашаган адамдар  " + Arrays.toString(people) +
                ""+PS();
    }

    @Override
    public String comunusluga() {
        return "Кунуно 100 $ толойт ";
    }
}


