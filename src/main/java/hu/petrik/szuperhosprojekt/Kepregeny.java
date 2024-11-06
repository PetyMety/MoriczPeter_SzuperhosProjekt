package hu.petrik.szuperhosprojekt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        for (String line : lines) {
            String[] parts = line.split(" ");
            String nev = parts[0];
            int kiteszt = Integer.parseInt(parts[1]);

            Szuperhos szuperhos;
            if (nev.equals("Vasember")) {
                szuperhos = new Vasember();
            } else {
                szuperhos = new Batman();
            }

            for (int i = 0; i < kiteszt; i++) {
                ((Milliardos) szuperhos).kutyutKeszit();
            }

            szuperhosLista.add(szuperhos);
        }
    }

    public static void szuperhosok() {
        for (Szuperhos szuperhos : szuperhosLista) {
            System.out.println(szuperhos);
        }
    }
}
