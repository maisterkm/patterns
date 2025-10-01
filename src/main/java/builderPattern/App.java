package builderPattern;

public class App {

    public static void main(String[] args) {
        Person person = new Person.Builder("Kevin", "kevin@gmail.com")
                .setUniversity("MIT")
                .setAddress("Wall Street")
                .setAge(23)
                .build();
        System.out.println(person);
    }
}
