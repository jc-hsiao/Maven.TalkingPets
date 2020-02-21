package io.zipcoder.polymorphism;

public class Dog extends Pet{
    public Dog(String name){
        super.setName(name);
    }

    @Override
    public void speak(){
        System.out.println("Bark! I am "+super.getName()+" the "+getClass().getSimpleName());
    }
}
