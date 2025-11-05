package com.hw1.model.dto;

public class Employee extends Person {
    private int salary;
    private String dept;
    Person p =new Person();

    public Employee() {
        super();
    }

    public Employee(String name,int age, double height, double weight, int salary, String dept) {

        super(age, height, weight);
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }
    @Override
    public String information() {
        return super.information() +
                ", 급여=" + salary +
                ", 부서=" + dept;
    }
}
