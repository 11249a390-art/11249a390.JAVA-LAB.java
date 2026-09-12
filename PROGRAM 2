EXPERIMENT 2 : Package Creation

***PROGRAM  2.1 :MathUtil.java ***
// File: MathUtil.java (the package member)
package com.scsvmv.util;
public class MathUtil {
public static int square(int n) { return n * n; }
public static int cube(int n) { return n * n * n; }
}


*** OUTPUT ***
25
125


***PROGRAM 2.2 : UseMath.java*** 

// File: UseMath.java (uses the package)
import com.scsvmv.util.MathUtil;
public class UseMath {
public static void main(String[] args) {
System.out.println("Square of 7 = " + MathUtil.square(7));
System.out.println("Cube of 3 = " + MathUtil.cube(3));
}
}

***OUTPUT*** :

Square of 7 = 49
Cube of 3 = 27


Case Study 2 — Two-Package Fee Calculator

***PROGRAM *** : 
// File 1: Student.java
package com.scsvmv.fee.model;
public class Student {
public String name;
public String course;
public Student(String n, String c) { name = n; course = c; }
}
// File 2: FeeRule.java
package com.scsvmv.fee.service;
public class FeeRule {
public static double fee(String course) {
if (course.equals("BE")) return 75000;
if (course.equals("ME")) return 60000;
return 40000;
}
}
// File 3: FeeApp.java (15 lines)
import com.scsvmv.fee.model.Student;
import com.scsvmv.fee.service.FeeRule;
public class FeeApp {
public static void main(String[] args) {
Student[] s = { new Student("Meena", "BE"),
new Student("Ravi", "ME"),
new Student("Anu", "BSc") };
double total = 0;
for (Student x : s) {
double f = FeeRule.fee(x.course);
System.out.printf("%-8s %-5s %10.2f%n", x.name, x.course, f);
total = total + f;
}
System.out.printf("Total fee = %.2f%n", total);
 }
}


***OUTPUT***

Meena    BE       75000.00
Ravi     ME       60000.00
Anu      BSc      40000.00
Total fee = 175000.00

***PRACTICE SESSION*** :

• Add a third package com.scsvmv.fee.report that prints the table, and let FeeApp only call it.

***PROGRAM *** :
File 1: Student.java

package com.scsvmv.fee.model;

public class Student {
    public String name;
    public String course;

    public Student(String n, String c) {
        name = n;
        course = c;
    }
}

File 2: FeeRule.java

package com.scsvmv.fee.service;

public class FeeRule {
    public static double fee(String course) {
        if (course.equals("BE")) return 75000;
        if (course.equals("ME")) return 60000;
        return 40000;
    }
}

File 3: FeeReport.java
Path/package: com/scsvmv/fee/report/FeeReport.java

package com.scsvmv.fee.report;

import com.scsvmv.fee.model.Student;
import com.scsvmv.fee.service.FeeRule;

public class FeeReport {

    public static void print(Student[] students) {
        double total = 0;

        System.out.printf("%-8s %-5s %10s%n", "Name", "Course", "Fee");
        System.out.println("--------------------------------");

        for (Student x : students) {
            double f = FeeRule.fee(x.course);
            System.out.printf("%-8s %-5s %10.2f%n",
                    x.name, x.course, f);
            total = total + f;
        }

        System.out.printf("Total fee = %.2f%n", total);
    }
}

File 4: FeeApp.java

import com.scsvmv.fee.model.Student;
import com.scsvmv.fee.report.FeeReport;

public class FeeApp {

    public static void main(String[] args) {
        Student[] s = {
            new Student("Meena", "BE"),
            new Student("Ravi", "ME"),
            new Student("Anu", "BSc")
        };

        FeeReport.print(s);
    }
}

***OUTPUT***

Name     Course         Fee
--------------------------------
Meena    BE        75000.00
Ravi     ME        60000.00
Anu      BSc       40000.00
Total fee = 175000.00




