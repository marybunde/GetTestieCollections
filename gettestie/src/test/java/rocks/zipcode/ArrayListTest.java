package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {

private ArrayList<Person>arrList;

    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;



@Before
 public void setUp(){
    this.arrList = new ArrayList<Person>();
    person1 = new Person("Mary",1988);
    person2 = new Person("Agnes",1987);
    person3 = new Person("Anne",1986);
    person4 = new Person("Anita", 1990);
}
@Test
    public void arrayListTest(){
    //Assert.assertEquals(4,arrList.size());
}
    @Test
    public void ArrListTest_Remove(){
    arrList.remove(person2);
    Assert.assertEquals(false, arrList.contains(person2));

    }

}
