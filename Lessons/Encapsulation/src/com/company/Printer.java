package com.company;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    //Getters
    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    //Setters
    public void setTonerLevel(int tonerLevel) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
    }

    public int print(int pages) {
        if (duplexPrinter) {
            System.out.println("Printing in duplex mode");
            return (pages / 2) + (pages % 2);
        }
        this.pagesPrinted += pages;
        return pages;
    }
}
