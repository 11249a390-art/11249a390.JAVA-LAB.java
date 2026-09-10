Ex 1(a): class, object and methods

***PROGRAM *** :

class Student {
int roll;
String name;
int marks;
void set(int r, String n, int m) {
roll = r; name = n; marks = m;
}
void show() {
System.out.println(roll + " " + name + " " + marks);
}
}
public class StudentDemo {
public static void main(String[] args) {
Student s1 = new Student();
Student s2 = new Student();
s1.set(101, "Aravind", 78);
s2.set(102, "Divya", 91);
System.out.println("ROLL NAME MARKS");
s1.show();
s2.show();
}
}

***OUTPUT*** 

ROLL NAME MARKS
101 Aravind 78
102 Divya 91



// Ex 1(b): array + for loop + if-else + operators

***PROGRAM*** 

public class MarksArray {
public static void main(String[] args) {
int[] m = { 78, 91, 45, 66, 88 };
int total = 0;
for (int i = 0; i < m.length; i++) {
total = total + m[i];
if (m[i] >= 50)
System.out.println(m[i] + " Pass");
else
System.out.println(m[i] + " Fail");
}
double avg = total / (double) m.length;
System.out.println("Total = " + total);
System.out.println("Average = " + avg);
}
}

***OUTPUT***

78 Pass
91 Pass
45 Fail
66 Pass
88 Pass
Total = 368
Average = 73.6


1(c) String Handling

Program 1.3 — StringDemo.java

// Ex 1(c): common String methods

***PROGRAM***

public class StringDemo {
public static void main(String[] args) {
String s = "SCSVMV University";
System.out.println("Length : " + s.length());
System.out.println("Upper case : " + s.toUpperCase());
System.out.println("First six : " + s.substring(0, 6));
System.out.println("Position of U: " + s.indexOf('U'));
System.out.println("Replace S->X: " + s.replace('S', 'X'));
System.out.println("Original : " + s);
String a = "madam";
String b = new StringBuilder(a).reverse().toString();
if (a.equals(b))
System.out.println(a + " is a palindrome");
else
System.out.println(a + " is not a palindrome");
}
}

***OUTPUT***

Length : 17
Upper case : SCSVMV UNIVERSITY
First six : SCSVMV
Position of U: 7
Replace S->X: XCXVMV Univerxity
Original : SCSVMV University
madam is a palindrome


***Case Study 1 — Hostel Mess Bill****

Solution — MessBill.java

 Case Study 1: mess bill using an array of objects

***PROGRAM***

class Boarder {
String name;
int days;
Boarder(String n, int d) { name = n; days = d; }
double bill() { return days * 85.0; }
}
public class MessBill {
public static void main(String[] args) {
Boarder[] list = { new Boarder("Aravind", 28),
new Boarder("Divya", 30),
new Boarder("Karthik", 25) };
double total = 0;
System.out.println("NAME DAYS BILL");
for (Boarder b : list) {
System.out.printf("%-10s %4d %8.2f%n", b.name, b.days, b.bill());
total = total + b.bill();
}
System.out.printf("Total collection = Rs. %.2f%n", total);
}
}



***OUTPUT****

NAME DAYS BILL
Aravind 28 2380.00
Divya 30 2550.00
Karthik 25 2125.00
Total collection = Rs. 7055.00


***PRACTICE QUESTION *** 
• Find and print the student with the highest bill.

***PROGRAM**

import java.util.Scanner;

public class StudentBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String highestName = "";
        double highestBill = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.next();

            System.out.print("Enter bill: ");
            double bill = sc.nextDouble();

            if (bill > highestBill) {
                highestBill = bill;
                highestName = name;
            }
        }

        System.out.println("\nStudent with highest bill:");
        System.out.println("Name: " + highestName);
        System.out.println("Bill: " + highestBill);

        sc.close();
    }
}



***OUTPUT***
 
Enter number of students: 3
Enter student name: Aravind
Enter bill: 4500
Enter student name: Divya
Enter bill: 6200
Enter student name: Rahul
Enter bill: 5100

Student with highest bill:
Name: Divya
Bill: 6200.0













