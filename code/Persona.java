package com.iesebre;

import java.util.Scanner;

public class Person {

    // Constructor
    void Person() {
    }

    boolean talking() {
        boolean finishC = false;
        Scanner scanner = new Scanner(System.in);

        int opcions;

        // Escollir amb qui volem conversar
        System.out.println("Selecciona un nombre: ");
        System.out.println("1. Quin tipus de persona ets? ");
        System.out.println("2. Quin esport t'agrada? ");
        System.out.println("3. Quin és el teu número favorit entre 0 i ...? ");
        System.out.println("4. Llista tots els nombres parells resultants de la multiplicació. ");
        System.out.println("5. Juguem a pedra paper i tisora? ");
        System.out.println("6. Escriu el teu nom. ");
        System.out.println("7. Recorda'm la conversa. ");
        System.out.println("8. Surt de l'aplicació. ");
        opcions = scanner.nextInt();
        while (opcions != 8)

            if (opcions == 1) {


                System.out.print("Escriu un numero entre 0 i 100. ");

                int persona = scanner.nextInt();
                boolean fi = false;
                while (!fi) {
                    if (persona % 2 == 0 && persona % 3 == 0) {
                        System.out.println("No binari");
                        fi = true;
                    } else if (persona % 3 == 0) {
                        System.out.println("Dona");
                        fi = true;
                    } else if (persona % 2 == 0) {
                        System.out.println("Home");
                        fi = true;
                    } else {
                        persona = persona + 2;
                        if (persona > 100)
                            persona = persona - 4;
                    }
                }
                System.out.println("Selecciona un nombre: ");
                System.out.println("1. Quin tipus de persona ets? ");
                System.out.println("2. Quin esport t'agrada? ");
                System.out.println("3. Quin és el teu número favorit entre 0 i ...? ");
                System.out.println("4. Llista tots els nombres parells resultants de la multiplicació. ");
                System.out.println("5. Juguem a pedra paper i tisora? ");
                System.out.println("6. Escriu el teu nom. ");
                System.out.println("7. Recorda'm la conversa. ");
                System.out.println("8. Surt de l'aplicació. ");
                opcions = scanner.nextInt();


            } else if (opcions == 2) {

                //Exercici2

                System.out.println();
                System.out.print("Disme un numero del 1 al 10. ");

                int a = scanner.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("Basquet");
                        break;
                    case 2:
                        System.out.println("Futbol");
                        break;
                    case 3:
                        System.out.println("Badminton");
                        break;
                    case 4:
                        System.out.println("Tenis");
                        break;
                    case 5:
                        System.out.println("Padel");
                        break;
                    case 6:
                        System.out.println("Ping-pong");
                        break;
                    case 7:
                        System.out.println("Balonmano");
                        break;
                    case 8:
                        System.out.println("Judo");
                        break;
                    case 9:
                        System.out.println("Boxeo");
                        break;
                    case 10:
                        System.out.println("Golf");
                        break;
                }
                System.out.println("Selecciona un nombre: ");
                System.out.println("1. Quin tipus de persona ets? ");
                System.out.println("2. Quin esport t'agrada? ");
                System.out.println("3. Quin és el teu número favorit entre 0 i ...? ");
                System.out.println("4. Llista tots els nombres parells resultants de la multiplicació. ");
                System.out.println("5. Juguem a pedra paper i tisora? ");
                System.out.println("6. Escriu el teu nom. ");
                System.out.println("7. Recorda'm la conversa. ");
                System.out.println("8. Surt de l'aplicació. ");
                opcions = scanner.nextInt();

            } else if (opcions == 3) {

                //Exercici3

                System.out.println();
                System.out.print("Disme un numero enter positiu. ");

                int num = scanner.nextInt();
                int ii = 0;
                int resultat = num / 2;

                while (resultat != ii) {
                    System.out.println(ii);
                    ++ii;
                }
                System.out.println(resultat);
                System.out.println("Selecciona un nombre: ");
                System.out.println("1. Quin tipus de persona ets? ");
                System.out.println("2. Quin esport t'agrada? ");
                System.out.println("3. Quin és el teu número favorit entre 0 i ...? ");
                System.out.println("4. Llista tots els nombres parells resultants de la multiplicació. ");
                System.out.println("5. Juguem a pedra paper i tisora? ");
                System.out.println("6. Escriu el teu nom. ");
                System.out.println("7. Recorda'm la conversa. ");
                System.out.println("8. Surt de l'aplicació. ");
                opcions = scanner.nextInt();

            } else if (opcions == 4) {    //Exercici4

                System.out.println();
                System.out.println("Dis-me dos nombres per a multiplicar. ");

                int aa = scanner.nextInt();
                int bb = scanner.nextInt();
                for (int i = aa; i <= bb; i++) {
                    System.out.println();
                    for (int j = bb; j >= 1; j--) {
                        if ((i * j) % 2 == 0) System.out.print(i * j + "  ");
                    }
                }
                System.out.println("Selecciona un nombre: ");
                System.out.println("1. Quin tipus de persona ets? ");
                System.out.println("2. Quin esport t'agrada? ");
                System.out.println("3. Quin és el teu número favorit entre 0 i ...? ");
                System.out.println("4. Llista tots els nombres parells resultants de la multiplicació. ");
                System.out.println("5. Juguem a pedra paper i tisora? ");
                System.out.println("6. Escriu el teu nom. ");
                System.out.println("7. Recorda'm la conversa. ");
                System.out.println("8. Surt de l'aplicació. ");
                opcions = scanner.nextInt();
            } else if (opcions == 5) {
                System.out.println("Aquesta opció encara no esta disponible, ho sento");
                System.out.println("Selecciona un nombre: ");
                System.out.println("1. Quin tipus de persona ets? ");
                System.out.println("2. Quin esport t'agrada? ");
                System.out.println("3. Quin és el teu número favorit entre 0 i ...? ");
                System.out.println("4. Llista tots els nombres parells resultants de la multiplicació. ");
                System.out.println("5. Juguem a pedra paper i tisora? ");
                System.out.println("6. Escriu el teu nom. ");
                System.out.println("7. Recorda'm la conversa. ");
                System.out.println("8. Surt de l'aplicació. ");
                opcions = scanner.nextInt();


                //Exercici6
            } else if (opcions == 6) {
                System.out.println();
                System.out.print("Dis-me un nom bonic. ");
                String nom = scanner.next();
                System.out.println("Gràcies, m'agrada aquest nom.");
                System.out.println("Selecciona un nombre: ");
                System.out.println("1. Quin tipus de persona ets? ");
                System.out.println("2. Quin esport t'agrada? ");
                System.out.println("3. Quin és el teu número favorit entre 0 i ...? ");
                System.out.println("4. Llista tots els nombres parells resultants de la multiplicació. ");
                System.out.println("5. Juguem a pedra paper i tisora? ");
                System.out.println("6. Escriu el teu nom. ");
                System.out.println("7. Recorda'm la conversa. ");
                System.out.println("8. Surt de l'aplicació. ");
                opcions = scanner.nextInt();


            } else if (opcions == 7) {
                System.out.println("Aquesta opció encara no esta disponible, ho sento");
                System.out.println("Selecciona un nombre: ");
                System.out.println("1. Quin tipus de persona ets? ");
                System.out.println("2. Quin esport t'agrada? ");
                System.out.println("3. Quin és el teu número favorit entre 0 i ...? ");
                System.out.println("4. Llista tots els nombres parells resultants de la multiplicació. ");
                System.out.println("5. Juguem a pedra paper i tisora? ");
                System.out.println("6. Escriu el teu nom. ");
                System.out.println("7. Recorda'm la conversa. ");
                System.out.println("8. Surt de l'aplicació. ");
                opcions = scanner.nextInt();
            }
        return finishC;
    }
}
