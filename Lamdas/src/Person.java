import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;


public class Person {
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    long age;


    public Person (Sex _sd,long _age){
        this.gender = _sd;
        this.age = _age;
    }
    public enum Sex {
        MALE, FEMALE
    }



    public long getAge() {
        return age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static void main(String[] args) {
        List<Person> roster = new ArrayList();
        roster.add(new Person(Sex.FEMALE,2));
        roster.add(new Person(Sex.MALE,3));

        Person[] rosterAsArray = roster.toArray(new Person[roster.size()]);

        class PersonAgeComparator implements Comparator<Person> {
            public int compare(Person a, Person b) {
                return a.getBirthday().compareTo(b.getBirthday());
            }
        }
    }
}