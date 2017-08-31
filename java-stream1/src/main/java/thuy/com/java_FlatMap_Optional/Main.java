package thuy.com.java_FlatMap_Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class User{
    private String name;
    private int age=20;
    private List<String> phone;

    public User(String name, int age, List<String> phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<User> userList = Arrays.asList(
                new User("thuy",20,Arrays.asList("5")),
                new User("ba",20,Arrays.asList("3","8")),
                new User("quang",30,Arrays.asList("1","9","2")));


        Optional<String> optional = userList.stream()
                .map(user -> user.getPhone().stream())
                .flatMap(Stringphone -> Stringphone.filter(nophone -> nophone.equals("3")))
                .findAny();
        optional.ifPresent(System.out::println);

    }
}
