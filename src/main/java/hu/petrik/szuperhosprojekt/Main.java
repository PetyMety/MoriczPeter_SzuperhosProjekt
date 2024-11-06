package hu.petrik.szuperhosprojekt;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Kepregeny.szereplok("szuperhosok.txt");
            Kepregeny.szuperhosok();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
