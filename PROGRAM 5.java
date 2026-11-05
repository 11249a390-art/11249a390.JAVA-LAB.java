Experiment 5 — Threading

5(a) Creating Threads
Program 5.1 — ThreadDemo.java (20 lines)
// Ex 5(a): the two ways of creating a thread
class First extends Thread {
public void run() {
for (int i = 1; i <= 3; i++)
System.out.println("Thread A : " + i);
}
}
class Second implements Runnable {
public void run() {
for (int i = 1; i <= 3; i++)
System.out.println("Thread B : " + i);
}
}
public class ThreadDemo {
public static void main(String[] args) {
First a = new First();
Thread b = new Thread(new Second());
a.start();
b.start();
}
}

***Output***

(the order may differ every run — that is normal)
Thread A : 1
Thread B : 1
Thread A : 2
Thread B : 2
Thread B : 3
Thread A : 3



5(b) Multithreading with Synchronisation

Program 5.2 — SyncDemo.java (19 lines)

// Ex 5(b): synchronized protects the shared counter

class Counter {
private int count = 0;
synchronized void increment() { count++; }
int get() { return count; }
}
public class SyncDemo {
public static void main(String[] args) throws InterruptedException {
Counter c = new Counter();
Runnable job = () -> {
for (int i = 0; i < 10000; i++)
c.increment();
};
Thread t1 = new Thread(job);
Thread t2 = new Thread(job);
t1.start(); t2.start();
t1.join(); t2.join();
System.out.println("Final count = " + c.get());
}
}

***Output***

With synchronized : Final count = 20000 (always correct)
Now delete the word synchronized and run again:
Without synchronized : Final count = 17342 (wrong, and different each time)


Case Study 5 — Ticket Booking Counter

Solution — Booking.java (24 lines)

// Case Study 5: three counters selling from one pool of seats

class Seats {
private int available = 10;
synchronized void book(String counter) {
if (available > 0) {
available--;
System.out.println(counter + " booked seat. Left = " + available);
} else {
System.out.println(counter + " -> HOUSE FULL");
}
}
}
public class Booking {
public static void main(String[] args) {
Seats s = new Seats();
for (int i = 1; i <= 3; i++) {
String name = "Counter-" + i;
new Thread(() -> {
for (int j = 0; j < 4; j++)
s.book(name);
}).start();
}
}
}
Output (order varies, but the numbers never repeat and never go below zero)
Counter-1 booked seat. Left = 9
Counter-2 booked seat. Left = 8
Counter-3 booked seat. Left = 7
Counter-1 booked seat. Left = 6
...
Counter-2 booked seat. Left = 0
Counter-3 -> HOUSE FULL
Counter-1 -> HOUSE FULL


****PRACTICE SESSION ****

• Add Thread.sleep(50) inside book() and see the race condition appear much more often.

class Ticket {
    int seats = 1;

    void book(String name) {
        if (seats > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            seats--;
            System.out.println(name + " booked the ticket.");
        } else {
            System.out.println(name + " could not book.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Ticket t = new Ticket();

        Thread t1 = new Thread(() -> t.book("A"));
        Thread t2 = new Thread(() -> t.book("B"));

        t1.start();
        t2.start();
    }
}

**OUTPUT***

A booked the ticket.
B booked the ticket.
















