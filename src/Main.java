public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(" Карл ", 45 , "атасы ");
        Person person2 = new Person(" Мервин ", 43, "апасы ");
        Person person3 = new Person(" Кевин ", 17, "баласы ");
        Person person4 = new Person(" Диана ", 15, "кызы ");
        Person person5 = new Person(" Жеймс  ", 7, "кичине баласы");
        Person person6 = new Person(" Кевин ", 30, " атасы ");
        Person person7 = new Person(" Кристиана ", 28, "апасы ");
        Person person8 = new Person(" Джодж ", 4 , " баласы ");
        Person person9 = new Person(" Брюс ", 34 , " атасы  ");
        Person person10 = new Person("Кира   ", 32, "апасы ");

        Person[] people = {person1, person2, person3, person4, person5};
        Person[] peoples = {person6, person7, person8};
        Person[] peoplese = {person9, person10};

        House house = new House(people);
        System.out.println(house.toString());
       Apartment apartment = new Apartment(peoples);
        System.out.println(apartment.toString());
       HotelRoom hotelRoom = new HotelRoom(peoplese);
        System.out.println(hotelRoom.toString());
    }
}