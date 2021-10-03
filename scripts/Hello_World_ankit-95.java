/*
 * I have choosen Java bcz I have handson insdustry level experience in Advanced
 * Java with Spring Boot and Hibernate.
 * 
 * Today I am goona submit Tower of Hanoi Problem asked in FAANG Interview.
 * 
 * Problem Statement :
 * 
 * This Problem requires you to move disks from Stand A to Stand C where Stand B
 * is a helper. Stand A contains some disks as which are required to be moved to
 * Destination C.
 * 
 * Tower of Hanoi is a mathematical puzzle where we have three rods and n disks.
 * The objective of the puzzle is to move the entire stack to another rod,
 * obeying the following simple rules: 1. Only one disk can be moved at a time.
 * 2. Each move consists of taking the upper disk from one of the stacks and
 * placing it on top of another stack i.e. a disk can only be moved if it is the
 * uppermost disk on a stack. 3. No disk may be placed on top of a smaller disk.
 * 
 */

class Hello_World_ankit95 {

    public static void towerOfHanoiPrint(int n, char source, char destination, char helper) {
        if (n == 1) {
            System.out.println("Move the 1st disk from " + source + " to Destination " + destination);
            return;
        }
        towerOfHanoiPrint(n - 1, source, helper, destination);
        System.out.println("Move the " + n + "th disk from " + source + " to Destination " + destination);
        towerOfHanoiPrint(n - 1, helper, destination, source);
    }

    public static long toh(int N, char from, char to, char aux) {
        long count = 0;
        if (N > 0) {
            count = toh(N - 1, from, aux, to);
            // System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            count++;
            count += toh(N - 1, aux, to, from);
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.print("Steps required : \n");
        towerOfHanoiPrint(3, 'A', 'C', 'B');

        System.out.print("Count of Steps : ");
        System.out.println(toh(3, 'A', 'C', 'B'));
    }
}