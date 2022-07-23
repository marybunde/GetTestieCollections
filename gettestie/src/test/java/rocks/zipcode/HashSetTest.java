package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

public class HashSetTest {
    private HashSet<String>set;

    @Before
    public void setSet(){
        this.set = new HashSet<String >();
        set.add("King");
        set.add("Kayla");
        set.add("Imani");
        set.add("Beezy");


    }
    @Test
    public void hashSet1(){
        Assert.assertEquals(4,set.size());
    }
    @Test
    public void hashSetTest_Remove(){
        set.remove("Kayla");
        Assert.assertEquals(3,set.size());
        Assert.assertEquals(false,set.contains("Kayla"));

    }
    @Test
    public void hashSetTest_Duplicate(){
        set.add("Kayla");
        set.add("Kayla");
        set.add("Kayla");
        set.add("Kayla");
        String[] setToArr = set.toArray(new String[set.size()]);
        Assert.assertEquals(false,set.contains(setToArr));
    }


}

