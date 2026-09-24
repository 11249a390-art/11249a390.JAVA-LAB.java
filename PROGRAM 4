Experiment 4 — Inheritance


Program 4.1 — InheritDemo.java (22 lines)

// Ex 4: multilevel inheritance, super and overriding

class Person {
String name;
Person(String n) { name = n; }
void show() { System.out.println("Name : " + name); }
}
class Employee extends Person {
double salary;
Employee(String n, double s) { super(n); salary = s; }

void show() { super.show(); System.out.println("Salary : " + salary); }
}
class Manager extends Employee {
String dept;
Manager(String n, double s, String d) { super(n, s); dept = d; }
void show() { super.show(); System.out.println("Dept : " + dept); }
}
public class InheritDemo {
public static void main(String[] args) {
Person p = new Manager("Meena", 75000, "CSE");
p.show();
}
}


***OUTPUT***

Name : Meena
Salary : 75000.0
Dept : CSE


Program 4.2 — Hierarchical inheritance (19 lines) 

// Ex 4: one parent, three children, one array

class Staff {
String name;
Staff(String n) { name = n; }
String role() { return "Staff"; }
}
class Teacher extends Staff {
Teacher(String n) { super(n); }
String role() { return "Teacher"; }
}
class Driver extends Staff {
Driver(String n) { super(n); }
String role() { return "Driver"; }
}
public class RoleDemo {
public static void main(String[] args) {
Staff[] all = { new Teacher("Kumar"), new Driver("Selvam"), new Staff("Raj") };
for (Staff s : all)
System.out.println(s.name + " -> " + s.role());
}
}

***Output***

Kumar -> Teacher
Selvam -> Driver
Raj -> Staff


Case Study 4 — Salary Slip for Different Employee Types


Solution — SalarySlip.java (24 lines)

// Case Study 4: abstract parent + three pay rules

abstract class Emp {
String name;
double basic;
Emp(String n, double b) { name = n; basic = b; }
abstract double pay(); // every child MUST write this
}
class Manager extends Emp {
Manager(String n, double b) { super(n, b); }
double pay() { return basic + 0.40 * basic; }
}
class Engineer extends Emp {
Engineer(String n, double b) { super(n, b); }
double pay() { return basic + 0.20 * basic; }
}
class Intern extends Emp {
Intern(String n, double b) { super(n, b); }
double pay() { return basic; }
}
public class SalarySlip {
public static void main(String[] args) {
Emp[] e = { new Manager("Meena", 50000), new Engineer("Ravi", 40000),
new Intern("Anu", 12000) };
for (Emp x : e)
System.out.printf("%-8s %10.2f%n", x.name, x.pay());
}
}

***Output***

Meena 70000.00
Ravi 48000.00
Anu 12000.00



• Try to create new Emp("X", 100) and record the compiler error you get.


class Emp {
    Emp(String name) {
        System.out.println("Employee: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Emp e = new Emp("X", 100);
    }
}


***Compiler error***

constructor Emp in class Emp cannot be applied to given types;
required: String
found: String, int
reason: actual and formal argument lists differ in length































