package com.iesebre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean finish = false;
        do {
            Scanner scanner = new Scanner(System.in);
            // Escollir amb qui volem conversar
            System.out.println("Amb qui vols conversar?");
            System.out.println(" - Persona (P)");
            System.out.println(" - Animal (A)");
            System.out.println(" - Extraterrestre (E)");
            System.out.print("Opció: ");
            switch (scanner.nextLine()) {
                case "P":
                    Person person = new Person();
                    finish = person.talking();
                    break;
                case "A":
                    Animal animal = new Animal();
                    finish = animal.talking();
                    break;
                case "E":
                    Alien extraterrestre = new Alien();
                    finish = extraterrestre.talking();
                    break;
            }
        } while (!finish);
    }
}
