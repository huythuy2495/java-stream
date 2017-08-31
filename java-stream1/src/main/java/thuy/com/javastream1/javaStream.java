package thuy.com.javastream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class javaStream {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("thuy","ba","quang","long");

        for(String name:names){
            if(!name.equals("thuy")){
                System.out.println(name);
            }
        }



        names.stream()
                .filter(name -> !name.equals("thuy"))
                .forEach(System.out::println);
                //.forEach(name-> System.out.println(name));

        names.stream()
                .filter(javaStream::isnotname)
                .forEach(System.out::println);

    }
    private static  boolean isnotname(String name){
        return !name.equals("thuy");
    }
}
