package io.zipcoder.polymorphism;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {
    @Test
    public void petNullConstructorTest(){
        Pet p = new Pet();
        Assert.assertEquals("",p.getName());
    }

    @Test
    public void petConstructorTest(){
        Pet p = new Pet("Max");
        Assert.assertEquals("Max",p.getName());
    }

    @Test
    public void petSetNameTest(){
        Pet p = new Pet();
        p.setName("Fido");
        Assert.assertEquals("Fido",p.getName());
    }

    @Test
    public void petGetNameTest(){
        Pet p = new Pet("Kiki");
        Assert.assertEquals("Kiki",p.getName());
    }

    @Test
    public void petSpeakTest(){
        Pet p = new Pet("Momo");
        p.speak();
    }

    @Test
    public void dogConstructorTest(){
        Dog d = new Dog("Ammy");
        Assert.assertEquals("Ammy",d.getName());
    }

    @Test
    public void dogSpeakTest(){
        Dog d = new Dog("Ammy");
        d.speak();
    }


    @Test
    public void catConstructorTest(){
        Cat c = new Cat("Miso");
        Assert.assertEquals("Miso",c.getName());
    }

    @Test
    public void catSpeakTest(){
        Cat c = new Cat("Miso");
        c.speak();
    }


    @Test
    public void parrotConstructorTest(){
        Parrot p = new Parrot("Alex");
        Assert.assertEquals("Alex",p.getName());
    }

    @Test
    public void parrotSpeakTest(){
        Parrot p = new Parrot("Alex");
        p.speak();
    }


    @Test
    public void ferretConstructorTest(){
        Ferret f = new Ferret("Nick");
        Assert.assertEquals("Nick",f.getName());
    }

    @Test
    public void ferretSpeakTest(){
        Ferret f = new Ferret("Nick");
        f.speak();
    }
}
