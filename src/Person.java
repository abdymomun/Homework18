public class  Person  {
Person [] people;

    public Person(Person[] people) {
        this.people = people;
    }

    private String name;
    private int age;
    private String who;

    public Person(String name, int age, String who) {
        this.name = name;
        this.age = age;
        this.who = who;
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

    public void setAge(int age) {
        this.age = age;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    @Override
    public String toString() {
        return
                " аты  " + name +
                "  жашы " + age +
                " ," + who +
                "";
    }
    public String comunusluga () {
        return "4000 толойт ";
    }


}

