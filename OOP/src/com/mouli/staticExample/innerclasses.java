package com.mouli.staticExample;

public class innerclasses {
    static class Test{
        String name;
        public Test(String name){
            this.name=name;
        }

    }
    public static void main(String[] args) {
        Test a=new Test("mouli");
        Test b=new Test("vinay");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
