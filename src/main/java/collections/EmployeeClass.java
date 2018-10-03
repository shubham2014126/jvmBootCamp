package collections;

import java.util.*;

class Employee implements Comparable<Employee> {

    public String name;
    public double age;
    public double salary;

    public Employee(String name, double age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public int compareTo(Employee e){
        if(this.salary == e.salary){
            return 0;
        } else if(this.salary < e.salary){
            return -1;
        } else {
            return +1;
        }
    }

    //get the methods for accessing the private data
    public String getName() { return name;}
    public double getAge() { return age;}
    public double getSalary() { return salary;}
}

//class to compare employee object by salary

class SalaryCompare implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        if (e1.getSalary() < e2.getSalary()) return -1;
        if (e1.getSalary() > e2.getSalary()) return 1;
        else return 0;
    }

    class NameCompare implements Comparator<Employee> {
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    }
}
public class EmployeeClass {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Sachin", 24, 1500));
        list.add(new Employee("Swati", 22, 90000));
        list.add(new Employee("Ravi", 23, 34000));
        System.out.println("Sort by salary");
        SalaryCompare salaryCompare = new SalaryCompare();
        Collections.sort(list);
        for (Employee a : list)
            System.out.println(a.getName() + " " + a.getAge() + " " + a.getSalary());
    }
}
