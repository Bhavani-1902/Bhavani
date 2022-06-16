package com.company;
interface bikes{
    void NS200();
}

public class inter1 implements bikes {
    public void NS200(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        inter1 obj1=new inter1();
        obj1.NS200();
    }
}

