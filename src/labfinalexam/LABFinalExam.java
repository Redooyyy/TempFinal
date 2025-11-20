/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labfinalexam;

import labfinalexam.Question1.Circle;
import labfinalexam.Question1.Cylinder;
import labfinalexam.Question1.Shape;

import labfinalexam.Question2.Book;
import labfinalexam.Question3.Methods;
import labfinalexam.Question3.Parent;
import labfinalexam.Question3.Teenagers;


public class LABFinalExam {

    public static void main(String[] args) {

        //question 1
        Shape circle = new Circle("circle1",5);
        ((Circle) circle).displayDetails();
        Shape cyl = new Cylinder("cylinder1","Black",5,3);
        ((Cylinder) cyl).displayDetails();

        //question 2
        Book book1 = new Book("Programming with Java","2000");
        book1.setName("MyBook"); // won't change
        book1.bookInfo();

        Book book2 = new Book();
        book2.setName("My Programming boook");
        book2.setYear("30000"); //won't be assign
        book2.bookInfo();
        book2.setName("KKKKKKKK"); //won't be changes
        book2.bookInfo();

        //question 3
        Methods parent = new Parent("Forhad",25,"Software Enginner");

        try {
            Teenagers teen = (Teenagers)new Methods("Alok",25);
            teen.indroduce();
        } catch (ClassCastException e){
            System.out.println("Unexpected Error");
        }

        parent.indroduce();

    }
    
}
