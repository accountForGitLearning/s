package com.test;

import com.test.printers.APrinter;
import com.test.printers.BPrinter;
import com.test.printers.Printer;

public class Main {

    public static void main(String[] args) {
        Printer printer = new BPrinter();
        printer.print();
    }
}
