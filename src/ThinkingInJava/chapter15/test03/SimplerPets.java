package ThinkingInJava.chapter15.test03;

import ThinkingInJava.chapter14.test02.Person;
import ThinkingInJava.chapter14.text0.Pets;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: asus
 * Date: 16-1-30
 * Time: 下午2:42
 * To change this template use File | Settings | File Templates.
 */
public class SimplerPets {
    public static void main(String[] args) {
        Map<Person,List<? extends Pets>> petPeople = New.map();
    }
}

