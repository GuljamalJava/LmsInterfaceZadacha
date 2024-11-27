import edicationcenter.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

import static java.time.LocalDate.now;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//
// todo  EducationCenter деген абстракт класс тузунуз. Полелери: name, locatedCountry, LocalDate foundationYear;
//       Абстракт класска School , University, College деген саб класстарды тузунуз.
//       Study деген интерфейс тузуп, ичине void getStudentsEducationCenter(), void getStudentsStudyingYear()  деген 2 метод тузунуз.
//       Student деген класс тузунуз. Полелери: name, surname, Gender gender,  LocalDate dateOfStart()(студент кайсыл жылы окуп баштаганы), EducationCenter educationCenter;
//       Main класста студенттердин массивин тузуп ичине 10 студент салыныз. Студенттер ар кандай окуу жайда окусун.
//       Main класста 1 метод тузунуз.
//  1 - метод бардык студенттер жонундо маалыматты, кайсыл студент кайсы окуу жайда окуганы тууралу маалыматты жана окуганыны канча жыл болгону тууралу маалыматты чыгарып берсин.

        EdicationCenter School = new School(LocalDate.of(1960,9,1),"Bishkek","SOSH: 54");
        EdicationCenter College = new College(LocalDate.of(1980,9,3),"Bishkek","Korean College in KR");
        EdicationCenter Univer = new University(LocalDate.of(1995,9,1),"Bishkek","Manas");


        Student student1= new Student(LocalDate.of(2021,9,1), Univer,Gender.MALE,"Baiel","Karybaev");
        Student student2= new Student(LocalDate.of(2022,9,1), Univer,Gender.MALE,"Kanchoro","Maraimov");
        Student student3= new Student(LocalDate.of(2023,9,1), College,Gender.MALE,"Amir","Altymyshov");
        Student student4= new Student(LocalDate.of(2024,10,1), Univer,Gender.MALE,"Aybek","Duisho uulu");
        Student student5= new Student(LocalDate.of(2015,9,1), School,Gender.MALE,"Ernist","Jaichiev");
        Student student6= new Student(LocalDate.of(2013,9,1), Univer,Gender.MALE,"Nursultan","Juraev");
        Student student7= new Student(LocalDate.of(2022,9,1), Univer,Gender.FEMALE,"Bermet ","Jumagulova");
        Student student8= new Student(LocalDate.of(2023,9,1), Univer,Gender.FEMALE,"Aynura","Nusubalieva");
        Student student9= new Student(LocalDate.of(2021,9,1),College ,Gender.FEMALE,"Aruuke","Emirsinova");
        Student student10= new Student(LocalDate.of(2010,9,1), Univer,Gender.FEMALE,"Guljamal","Janybekova");
        Student  [] students = new Student[]{student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
        Main main = new Main();
        main.getInfo(students);

        }

 public void getInfo(Student [] students){
     for (Student student : students) {
         System.out.println("Student:  "+student.getName()  +"  "  + student.getSurname());
         System.out.println("Studying Place:  "+ student.getEdicationCenter().getName());
         int years = student.getStudentsStudyingYear();
         System.out.println("Studying years: " + years);
     }

    }




}
