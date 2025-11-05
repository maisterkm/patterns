package creationalPatterns.builderPattern2;

public class UserWebDTO implements UserDTO {

    private String name;

    private String address;

    private String age;

    public UserWebDTO(final String name, final String address, final String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }
}
