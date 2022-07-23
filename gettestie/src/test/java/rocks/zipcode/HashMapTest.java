package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {

   private HashMap<Integer, Person> maps;

    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    @Before
    public  void setUp(){
        this.maps = new HashMap<Integer, Person>();
        person1 = new Person("Sarah", 1987);
        maps.put(person1.getYearOfBirth(), person1);

        person2 = new Person("Phil", 2000);
        maps.put(person2.getYearOfBirth(), person2);

        person3 = new Person("Susan", 2011);
        maps.put(person3.getYearOfBirth(), person3);

    }
   @Test
    public void HashMapTest(){
       Assert.assertEquals(false,maps.isEmpty());
   }
   @Test
   public void HashMapTest1(){
        Assert.assertEquals(person3, maps.get(2011));
   }
}
