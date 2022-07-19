package bai13.service.ulity;

import java.util.Scanner;

public class ScannerFactory {
    private static Scanner scanner;

    public static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
