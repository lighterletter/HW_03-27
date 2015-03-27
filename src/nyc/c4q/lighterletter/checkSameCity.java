package nyc.c4q.lighterletter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by c4q-john on 3/25/15.
 * Accesscode 2.1 HW for mach 27th 2015.
 *
 * You are provided with a Person class.
 * This class has private fields name,
 * phoneNumber and city, along with
 * their getter and setter methods.

 * Write a function called checkSameCity
 * which accepts as input two Person
 * instances and checks if they live in
 * the same city. The function should
 * return a boolean value

 * A Person has recently had a child,
 * whose name is 'Abc'. Write a function
 * called registerChild which accepts as
 * input a Person instance(Parent) and
 * returns a new Person instance for the
 * child, which has the same phoneNumber
 * and city as the parent.
 *
 */
public class checkSameCity {


    public static boolean checkSameCity(Person input1, Person input2) {
        if (input1.getCity().equals(input2.getCity())){
            return true;
        } else {
            return false;
        }

    }
    public static Person registerChild(Person parent){

        Person child = new Person();

        child.setName("abc");
        child.setCity(parent.getCity());
        child.setPhoneNumber(parent.getPhoneNumber());


        return child;
    }

    public static void main(String[] array) {
        Person p1 = new Person("Olivia");
        p1.setCity("Barcelona");
        p1.setPhoneNumber("847 0984");

        Person p2 = new Person("Vigo");
        p2.setCity("Madrid");
        p2.setPhoneNumber("746 3847");

        System.out.println(checkSameCity(p1, p2));

        Person abc = registerChild(p1);

        System.out.println(abc.getName() +"\n"
                + abc.getCity() +"\n"
                + abc.getPhoneNumber());



    }
}