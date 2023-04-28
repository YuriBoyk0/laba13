package ru.javacore.domain.example.com;

public class Tester {
    String name;
    String surname;
    int experienceInYears;
    String englishLevel;
    double salary;

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

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Tester(String name){
        this.name = name;
        this.surname = "Цупка";
        this.experienceInYears = 1;
        this.englishLevel = "A1";
        this.salary = 24.15;
    }
    public Tester(String name, String surname){
        this(name);
        this.surname = surname;
        this.experienceInYears = 1;
        this.englishLevel = "A1";
        this.salary = 14.532;
    }
    public Tester(String name, String surname, int experienceInYears){
        this(name, surname);
        this.experienceInYears = experienceInYears;
        this.englishLevel = "A1";
        this.salary = 5423.34;
    }
    public Tester(String name, String surname, int experienceInYears, String englishLevel){
        this(name, surname, experienceInYears);
        this.englishLevel = englishLevel;
        this.salary = 241.5325;
    }


    public static int sum(int a, int b){
        return a + b;
    }
    public static double sum(double a, double b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
}
