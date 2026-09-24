Experiment 6 — Exception Handling

Program 6.1 — PredefinedDemo.java (24 lines)
// Ex 6(a): catching the three most common exceptions
public class PredefinedDemo {
public static void main(String[] args) {
try {
int[] a = new int[3];
a[5] = 10;
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Array error : index " + e.getMessage());
}
try {
int x = 10 / 0;
} catch (ArithmeticException e) {
System.out.println("Math error : " + e.getMessage());
}
try {
String s = null;
System.out.println(s.length());
} catch (NullPointerException e) {
System.out.println("Null error : the object was never created");
} finally {
System.out.println("finally : always runs");
}
System.out.println("Program continued normally.");
}
}

***Output***
Array error : index 5
Math error : / by zero
Null error : the object was never created
finally : always runs
Program continued normally.



6(b) User-Defined Exception

Program 6.2 — UserDefinedDemo.java (19 lines)

// Ex 6(b): our own exception class

class InvalidAgeException extends Exception {
InvalidAgeException(String msg) { super(msg); }
}
public class UserDefinedDemo {
static void verify(int age) throws InvalidAgeException {
if (age < 18)
throw new InvalidAgeException("Age " + age + " is below 18");
System.out.println("Age " + age + " accepted");
}
public static void main(String[] args) {
try {
verify(21);
verify(15);
} catch (InvalidAgeException e) {
System.out.println("Rejected : " + e.getMessage());
}
}
}

**Output**

Age 21 accepted
Rejected : Age 15 is below 18


Case Study 6 — ATM Withdrawal

Solution — Atm.java (25 lines)

// Case Study 6: two user-defined exceptions

class InvalidAmountException extends Exception {
InvalidAmountException(String m) { super(m); }
}
class LowBalanceException extends Exception {
LowBalanceException(String m) { super(m); }
}
public class Atm {
static double balance = 5000;
static void withdraw(double amt)
throws InvalidAmountException, LowBalanceException {
if (amt % 100 != 0)
throw new InvalidAmountException(amt + " is not a multiple of 100");
if (amt > balance)
throw new LowBalanceException("Balance is only " + balance);
balance = balance - amt;
System.out.println("Dispensed " + amt + ", balance " + balance);
}
public static void main(String[] args) {
double[] tries = { 2000, 350, 9000, 1500 };
for (double a : tries) {
try { withdraw(a); }
catch (Exception e) { System.out.println("Refused : " + e.getMessage()); }
}
}
}

***Output***

Dispensed 2000.0, balance 3000.0
Refused : 350.0 is not a multiple of 100
Refused : Balance is only 3000.0
Dispensed 1500.0, balance 1500.0



***PRACTICE SESSION***

• Add a daily limit of Rs. 5000 with a third exception class.


PROGRAM : 

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class DailyLimitException extends Exception {
    DailyLimitException(String msg) {
        super(msg);
    }
}

class Bank {
    double balance = 10000;
    double dailyTotal = 0;

    void withdraw(double amount)
            throws InsufficientBalanceException, DailyLimitException {

        if (dailyTotal + amount > 5000)
            throw new DailyLimitException("Daily limit of Rs. 5000 exceeded");

        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient balance");

        balance -= amount;
        dailyTotal += amount;

        System.out.println("Withdrawn: Rs. " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();

        try {
            b.withdraw(4000);
            b.withdraw(2000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

***OUTPUT** 

Withdrawn: Rs. 4000.0
Daily limit of Rs. 5000 exceeded






























