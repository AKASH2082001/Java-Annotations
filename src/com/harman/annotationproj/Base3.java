package com.harman.annotationproj;

public class Base3 {
    void display() {
        System.out.println("This is parent class");
    }
    @Deprecated
    void Test(){
        System.out.println("Testing...");
    }
}
class Child3 extends Base3{
    @Override
    void display() {
        super.display();

    }

    public @interface Myannotations{
        int age() default 18;
        String name();
    }
    @Myannotations(
            name = "RAM"
    )

    public static void main(String[] args) {
        Child3 c=new Child3();
        c.display();
        c.Test();
    }
}
