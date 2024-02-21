package Intro;

import edu.princeton.cs.algs4.StdOut;

class HelloGoodbye {

    private static String hello(String nameOne, String nameTwo) {
        String hello = "Hello " + nameOne + " and " + nameTwo + ".";
        return hello;
    }

    private static String goodbye(String nameOne, String nameTwo) {
        String goodbye = "Goodbye " + nameTwo + " and " + nameOne + ".";
        return goodbye;
    }
    public static void main(String[] args) {
        StdOut.println(hello(args[0], args[1]));
        StdOut.println(goodbye(args[1], args[0]));
    }
}