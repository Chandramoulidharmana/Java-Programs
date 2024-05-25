package com.mouli;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {

        student mouli=new student(15,"Chandra mouli",37.5f);
//        mouli.rno=10;
//        mouli.name="Chandra Mouli";
//        mouli.marks=37.5f;

        System.out.println(mouli.rno);
        System.out.println(mouli.name);
        System.out.println(mouli.marks);

        student random=new student(mouli);
        System.out.println(random.name);

        student one=new student();
        student two=one;
        one.name="Something Something";
        System.out.println(two.name);

    }
}
class student{
    int rno;
    String name;
    float marks;

    student() // Construcor
    {
        this.name="chandra mouli";
        this.rno=10;
        this.marks=37.6f;
    }
    void greeting(){
        System.out.println("my name is"+ this.name);
    }
    student(int rno,String name,float marks){
       this.rno=rno;
        this.name=name;
       this.marks=marks;
    }
    student(student other){
        this.name=other.name;
        this.rno=other.rno;
        this.marks=other.marks;
    }



}
