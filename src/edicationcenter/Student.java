package edicationcenter;

import java.time.LocalDate;
import java.time.Period;

public class Student implements Study {
    private String name;
    private String surname;
    private Gender gender;
    private LocalDate dateOfStart;
    private EdicationCenter edicationCenter;

    public Student(LocalDate dateOfStart, EdicationCenter edicationCenter, Gender gender, String name, String surname) {
        this.dateOfStart = dateOfStart;
        this.edicationCenter = edicationCenter;
        this.gender = gender;
        this.name = name;
        this.surname = surname;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EdicationCenter getEdicationCenter() {
        return edicationCenter;
    }

    public void setEdicationCenter(EdicationCenter edicationCenter) {
        this.edicationCenter = edicationCenter;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public  void getStudentsEducationCenter() {
        System.out.println(name + " " + surname + "studying place: " + edicationCenter.getName());
    }

    @Override
    public int getStudentsStudyingYear() {
       int years = Period.between(dateOfStart, LocalDate.now()).getYears();
        System.out.println(name + " " + surname+ ".");
        return  years;
    }

    @Override
    public String toString() {
        return "Student{" +
                "dateOfStart=" + dateOfStart +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", edicationCenter=" + edicationCenter +
                '}';
    }
}