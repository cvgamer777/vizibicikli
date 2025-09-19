// Vizibicikli kölcsönző
// 1. feladat


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Kolcsonzes> kolcsonzesek;

    public static void main(String[] args) throws FileNotFoundException {
        //4. feladat

        kolcsonzesek = new ArrayList<>();

        File fbe = new File("files/kolcsonzesek.txt");
        Scanner sbe = new Scanner(fbe);
        sbe.nextLine();

        while (sbe.hasNextLine()) {
            String fileLine = sbe.nextLine();
            kolcsonzesek.add(new Kolcsonzes(fileLine));
        }

        //6. feladat

        Scanner in = new Scanner(System.in);
        System.out.println("Kerek egy nevet: " + in);

    }
}