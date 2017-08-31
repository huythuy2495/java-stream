package thuy.com.java_map_collect;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class User{
    private String name;
    private int age=20;

    public User(String name) {
        this.name = name;
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
                '}';
    }
}

public class main {

    private static boolean isnotname(String name){
        return !name.equals("thuy");
    }

    public static void main(String[] args) {
        List<String> names= Arrays.asList("thuy","long","ba","quang");
//        names.stream()
//                .filter(main::isnotname)
//                .map(User::new)
//                .forEach(System.out::println);

        List<User> userList = names.stream()
                .filter(main::isnotname)
                .map(User::new)
                .collect(Collectors.toList());
       int tong= userList.stream()
                .mapToInt(User::getAge)
                .sum();
        System.out.println(tong);


    }

}
