package com.harman.annotationproj;

public class Base1 {
    void display() {
        System.out.println("This is parent class");
    }
}
@SuppressWarnings("no errors")
class Child1 extends Base1{
    @Override
    void display() {
        super.display();
    }
@SuppressWarnings("no issues")
    public static void main(String[] args) {
        Child c=new Child();
        c.display();
    }
}
