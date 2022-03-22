package com.harman.annotationproj;

public class Base2 {
    void display() {
        System.out.println("This is parent class");
    }
}
@SuppressWarnings("no errors")
class Child2 extends Base2{
    @Override
    void display() {
        super.display();
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.display();

        @SuppressWarnings("unused")
                int y;

    }
}

