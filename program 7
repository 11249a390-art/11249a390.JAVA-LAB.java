// Ex 7: writing to a text file

import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
public static void main(String[] args) {
try (FileWriter fw = new FileWriter("student.txt")) {
fw.write("101,Aravind,78\n");
fw.write("102,Divya,91\n");
fw.write("103,Karthik,45\n");
System.out.println("File written successfully.");
} catch (IOException e) {
System.out.println("Error : " + e.getMessage());
   }
 }
 }

output :
101,Aravind,78
102,Divya,91
103,Karthik,45



Program 7.2 — ReadFile.java (20 lines)

// Ex 7: reading the same file back and processing it
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFile {
public static void main(String[] args) {
try (BufferedReader br =
new BufferedReader(new FileReader("student.txt"))) {
String line;
System.out.println("ROLL NAME MARKS");
while ((line = br.readLine()) != null) {
String[] f = line.split(",");
System.out.printf("%-6s%-10s%s%n", f[0], f[1], f[2]);
}
} catch (IOException e) {
System.out.println("Error : " + e.getMessage());
}
}
}

output :

ROLL NAME MARKS
101 Aravind 78
102 Divya 91
103 Karthik 45

Case Study 7 — Result Report from a File

import java.io.*;
public class ResultReport {
public static void main(String[] args) {
int pass = 0, fail = 0, total = 0, n = 0;
try (BufferedReader br = new BufferedReader(new FileReader("student.txt"));
PrintWriter pw = new PrintWriter("result.txt")) {
String line;
while ((line = br.readLine()) != null) {
String[] f = line.split(",");
int m = Integer.parseInt(f[2]);
total = total + m;
n++;
if (m >= 50) { pass++; pw.println(f[1] + " PASS"); }
else { fail++; pw.println(f[1] + " FAIL"); }
}
pw.println("Passed : " + pass);
pw.println("Failed : " + fail);
pw.printf ("Average : %.2f%n", (double) total / n);
System.out.println("result.txt created. Passed " + pass + ", failed " + fail);
} catch (IOException e) {
System.out.println("File error : " + e.getMessage());
}
}
}

OUTPUT :
Aravind PASS
Divya PASS
Karthik FAIL
Passed : 2
Failed : 1
Average : 71.33


**PRACTICE SESSION **
• Print the name of the topper as well.
import java.io.*;

public class ResultReport {
    public static void main(String[] args) {
        int pass = 0, fail = 0, total = 0, n = 0;
        int maxMarks = -1;
        String topper = "";

        try (BufferedReader br = new BufferedReader(new FileReader("student.txt"));
             PrintWriter pw = new PrintWriter("result.txt")) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] f = line.split(",");
                int m = Integer.parseInt(f[2]);

                total = total + m;
                n++;

                // Find the topper
                if (m > maxMarks) {
                    maxMarks = m;
                    topper = f[1];
                }

                if (m >= 50) {
                    pass++;
                    pw.println(f[1] + " PASS");
                } else {
                    fail++;
                    pw.println(f[1] + " FAIL");
                }
            }

            pw.println("Passed : " + pass);
            pw.println("Failed : " + fail);

            if (n > 0) {
                pw.printf("Average : %.2f%n", (double) total / n);
                pw.println("Topper : " + topper);
                pw.println("Highest Marks : " + maxMarks);
            } else {
                pw.println("No student records found.");
            }

            System.out.println("result.txt created. Passed "
                    + pass + ", failed " + fail);

        } catch (IOException e) {
            System.out.println("File error : " + e.getMessage());
        }
    }
}


Input file: student.txt
text
101,Aravind,78
102,Divya,91
103,Karthik,45



Output file: result.txt
text
Aravind PASS
Divya PASS
Karthik FAIL
Passed : 2
Failed : 1
Average : 71.33
Topper : Divya
Highest Marks : 91








