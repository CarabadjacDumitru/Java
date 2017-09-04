import com.sun.java.swing.plaf.windows.WindowsTreeUI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Temp {


    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "goodbye");

        /*
         Turn the strings into uppercase, keep only the ones that are shorter than 4 characters, of what is
        remaining, keep only the ones that contain “E”, and print the first result. Repeat the process, except
        checking for a “Q” instead of an “E”. When checking for the “Q”, try to avoid repeating all the
        code from when you checked for an “E”.
        */
        words.stream().forEach(System.out::println);
        System.out.println("-------------------------------");
        words.stream().map(s -> s.toUpperCase())
                        .filter(a -> a.length() > 4 )
                        .filter(b -> b.contains("E") == true)
                        .collect(Collectors.toList());
                        //.forEach(System.out::println);
        System.out.println("-------------------------------");
        words.stream().forEach(System.out::println);
        System.out.println("-------------------------------");
        words.stream().filter(s -> s.contains("b")).forEach(System.out::println);
        System.out.println("-------------------------------");
        words.stream().filter(s -> (s.length() % 2) == 0).forEach(System.out::println);
        System.out.println("-------------------------------");


    }
}