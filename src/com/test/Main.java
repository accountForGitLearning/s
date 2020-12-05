package com.test;


import com.test.printers.EPrinter;
import com.test.printers.Printer;

public class Main {

    public static void main(String[] args) {
        Printer printer = new EPrinter();
        printer.print();
    }
}
