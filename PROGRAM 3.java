EXPERIMENT 3 : INTERFACES

Program 3.1 — ShapeDemo.java (21 lines)

// Ex 3(a): user-defined interface and two implementations 

interface Shape {
double area();
}
class Circle implements Shape {
double r;
Circle(double r) { this.r = r; }
public double area() { return 3.14159 * r * r; }
}
class Rect implements Shape {
double l, b;
Rect(double l, double b) { this.l = l; this.b = b; }
public double area() { return l * b; }
}
public class ShapeDemo {
public static void main(String[] args) {
Shape[] s = { new Circle(5), new Rect(4, 6) };
for (Shape x : s)
System.out.printf("%-8s area = %.2f%n",
x.getClass().getSimpleName(), x.area());
}
}

*** Output ***
Circle area = 78.54
Rect area = 24.00



3(b) Predefined Interface — Comparable

Program 3.2 — SortDemo.java (17 lines)

// Ex 3(b): using the predefined interface Comparable

import java.util.Arrays;
class Player implements Comparable<Player> {
String name;
int runs;
Player(String n, int r) { name = n; runs = r; }
public int compareTo(Player p) { return p.runs - runs; } // high to low
public String toString() { return name + "(" + runs + ")"; }
}
public class SortDemo {
public static void main(String[] args) {
Player[] p = { new Player("Ravi", 45), new Player("Anu", 92),
new Player("Kiran", 67) };
Arrays.sort(p);
System.out.println(Arrays.toString(p));
}
}


***Output***
[Anu(92), Kiran(67), Ravi(45)] 



Case Study 3 — Payment Methods
Solution — PaymentDemo.java (24 lines)

// Case Study 3: one interface, three payment methods

interface Payment {
double charge(double amount);
String name();
}
class Upi implements Payment {
public double charge(double a) { return 0; }
public String name() { return "UPI"; }
}
class Card implements Payment {
public double charge(double a) { return a * 0.02; }
public String name() { return "Card"; }
}
class Cash implements Payment {
public double charge(double a) { return 20; }
public String name() { return "Cash"; }
}
public class PaymentDemo {
public static void main(String[] args) {
double fee = 75000;
Payment[] modes = { new Upi(), new Card(), new Cash() };
for (Payment m : modes)
System.out.printf("%-5s charge %8.2f total %10.2f%n",
m.name(), m.charge(fee), fee + m.charge(fee));
}
}

***Output***
UPI charge 0.00 total 75000.00
Card charge 1500.00 total 76500.00
Cash charge 20.00 total 75020.00


***PRACTICE SESSION ***

Add a NetBanking class with a flat charge of Rs. 12 — notice that main needs only one extra word.

PROGRAM : 
class Payment {
    void charge() {
        System.out.println("Payment charge");
    }
}

class NetBanking extends Payment {
    @Override
    void charge() {
        System.out.println("NetBanking charge: Rs. 12");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p = new NetBanking();
        p.charge();
    }
}


**output** 

NetBanking charge: Rs. 12















