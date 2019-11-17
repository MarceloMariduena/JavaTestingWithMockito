package com.example.restapi2;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import static org.mockito.Mockito.*;

public class PersonTest {

    @Mock
    CacheManager cache;

    @Mock
    DiskManager disk;

    @Mock
    Person ourPerson;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void testPersonNotInDiskNorCache(){
        verify(cache.getPerson(123));

//        Person ourPerson1 = new Person(cache, disk);
//
//        boolean check = ourPerson1.equals(ourPerson1);
//        Assert.assertTrue(check);
//        verify(cache).getPerson(123);
    }

//    @Test
//    public void test1(){
//        // create mock
//        Person test = mock(Person.class);
//
//
//    }

//    @Test
//    public void testPersonNotFoundlol(){
//        //person not in cache nor disk will return null.
//        ourPerson1 = new Person(cache, disk);
//        ourPerson1.setPerson(123, "Ricky", "Bobby");
//        cache.addPerson(ourPerson1);
//
//
//        //there should not be 2 returns.
//
//    }
//
//    @Test
//    public void testPersonFoundInCache(){
//        //person in cache is returned.
//
//        //person in cache is returned by name.
//
//        //using verify() to confirm that getPerson() call were made.
//
//    }
//
//    @Test
//    public void testPersonFoundInDisk(){
//        //person is not in cache but is in disk.
//
//        //verify() that person was not looked from cache.
//
//    }

}
