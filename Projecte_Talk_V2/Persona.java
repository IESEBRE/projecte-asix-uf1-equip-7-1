package com.iesebre;

import java.util.Scanner;

public class Person {

    // Constructor
    void Person() {
    }

    boolean talking() {
        boolean finishC = false;
        Scanner scanner = new Scanner(System.in);
        String conversaPersona = new String();
        String exercici1 = null;
        String exercici2 = null;
        String exercici3 = null;
        String exercici4 = null;
        String exercici5 = null;
        String exercici6 = null;
        int PreguntaInicial = 0;
        boolean[] Verificacio = new boolean[7];

        while (PreguntaInicial != 8) {
            // Escollir amb qui volem conversar
            System.out.println("Selecciona un nombre: ");
            System.out.println("1. Quin tipus de persona ets? ");
            System.out.println("2. Quin esport t'agrada? ");
            System.out.println("3. Quin és el teu número favorit entre 0 i ...? ");
            System.out.println("4. Llista tots els nombres parells resultants de la multiplicació. ");
            System.out.println("5. Juguem a pedra paper i tisora? ");
            System.out.println("6. Escriu el teu nom. ");
            System.out.println("7. Recorda'm la conversa. ");
            System.out.println("8. Sortir");
            PreguntaInicial = scanner.nextInt();

            if (PreguntaInicial != 8) {
                while (PreguntaInicial < 1 || PreguntaInicial > 7) {


                    System.out.println("Valor incorrecte. Torna a provar-ho");
                    PreguntaInicial = scanner.nextInt();
                }
            }

            switch (PreguntaInicial) {
                case 1:

                    //Exercici1

                    System.out.print("Escriu un numero entre 0 i 100. ");
                    int persona = scanner.nextInt();

                    while (persona < 0 || persona > 100) {

                        System.out.println("Valor incorrecte. Torna a provar-ho");
                        persona = scanner.nextInt();
                    }

                    Verificacio[1] = true;
                    boolean fi = false;

                    while (!fi) {
                        if (persona % 2 == 0 && persona % 3 == 0) {
                            System.out.println("No binari");
                            exercici1 = "no binari";
                            conversaPersona = "No binari\n";
                            fi = true;
                        } else if (persona % 3 == 0) {
                            System.out.println("Dona");
                            exercici1 = "dona";
                            conversaPersona = "Dona\n";
                            fi = true;
                        } else if (persona % 2 == 0) {
                            System.out.println("Home");
                            exercici1 = "home";
                            conversaPersona = "Home\n";
                            fi = true;
                        } else {
                            persona = persona + 2;
                            if (persona > 100)
                                persona = persona - 4;
                        }
                    }

                    conversaPersona = "Soc " + exercici1 + "\n\n";
                    break;
                case 2:
                    //Exercici2
                    if (!Verificacio[1]) {
                        System.out.println("Contesta les altres preguntes");
                        break;
                    }

                    System.out.println();
                    System.out.print("Disme un numero del 1 al 10. ");
                    int a = scanner.nextInt();

                    while (a < 1 || a > 10) {

                        System.out.println("Valor incorrecte. Torna a provar-ho");
                        a = scanner.nextInt();
                    }

                    Verificacio[2] = true;

                    switch (a) {
                        case 1:
                            System.out.println("Hoquei");
                            exercici2 = "Hoquei";
                            break;
                        case 2:
                            System.out.println("Basquet");
                            exercici2 = "Basquet";
                            break;
                        case 3:
                            System.out.println("Handbol");
                            exercici2 = "Handbol";
                            break;
                        case 4:
                            System.out.println("Ptinatge");
                            exercici2 = "Patinatge";
                            break;
                        case 5:
                            System.out.println("Rugbi");
                            exercici2 = "Rugbi";
                            break;
                        case 6:
                            System.out.println("Ritmica");
                            exercici2 = "Ritmica";
                            break;
                        case 7:
                            System.out.println("Natacio");
                            exercici2 = "Natacio";
                            break;
                        case 8:
                            System.out.println("Judo");
                            exercici2 = "Judo";
                            break;
                        case 9:
                            System.out.println("Atletisme");
                            exercici2 = "Atletisme";
                            break;
                        case 10:
                            System.out.println("Ciclisme");
                            exercici2 = "Ciclisme";
                            break;
                    }
                    conversaPersona = conversaPersona + "El meu esport preferit es " + exercici2 + "\n\n";
                    break;
                case 3:
                    //Exercici3
                    if (!Verificacio[2]) {
                        System.out.println("Contesta les altres preguntes");
                        break;
                    }
                    System.out.println();
                    System.out.print("Disme un numero enter positiu. ");

                    int num = scanner.nextInt();

                    while (num <= 0) {


                        System.out.println("Valor incorrecte. Torna a provar-ho");
                        num = scanner.nextInt();


                    }

                    Verificacio[3] = true;
                    int ii = 0;
                    int resultat = num / 2;

                    while (resultat != ii) {
                        System.out.println(ii);
                        ++ii;
                    }
                    System.out.println(resultat);
                    exercici3 = String.valueOf(resultat);

                    conversaPersona = conversaPersona + "He triat el " + exercici3 + "\n\n";
                    break;
                case 4:
                    //Exercici4
                    if (!Verificacio[3]) {
                        System.out.println("Contesta les altres preguntes");
                        break;
                    }
                    System.out.println();
                    System.out.println("Dis-me dos nombres per a multiplicar. ");
                    conversaPersona = conversaPersona + "El resultat es ";
                    int aa = scanner.nextInt();
                    while (aa <= -1000000 || aa >= 1000000) {


                        System.out.println("Valor incorrecte. Torna a provar-ho");
                        aa = scanner.nextInt();


                    }
                    int bb = scanner.nextInt();
                    while (bb <= -1000000 || bb >= 1000000) {


                        System.out.println("Valor incorrecte. Torna a provar-ho");
                        bb = scanner.nextInt();


                    }
                    Verificacio[4] = true;
                    for (int i = aa; i <= bb; i++) {
                        System.out.println();
                        for (int j = bb; j >= 1; j--) {
                            if ((i * j) % 2 == 0) System.out.print(i * j + "  ");
                            exercici4 = String.valueOf(i * j + " ");
                            conversaPersona = conversaPersona + exercici4;

                        }
                    }
                    System.out.println();
                    conversaPersona = conversaPersona + "\n\n";
                    break;
                case 5:

                    //Exercici5
                    if (!Verificacio[4]) {
                        System.out.println("Contesta les altres preguntes");
                        break;
                    }
                    Verificacio[5] = true;
                    System.out.println("Aquesta pregunta es molt difícil, intenta amb una altra.");
                    conversaPersona = conversaPersona + "El resultat de pedra, paper i tisora l'he perdut pel cami\n\n";
                    break;

                case 6:
                    //Exercici6
                    if (!Verificacio[5]) {
                        System.out.println("Contesta les altres preguntes");
                        break;
                    }
                    scanner.nextLine();
                    Verificacio[6] = true;
                    System.out.print("Dis-me un nom bonic. ");
                    String nom1 = scanner.nextLine();
                    while (nom1.isEmpty()) {

                        System.out.println("Valor incorrecte. Torna a provar-ho");
                        nom1 = scanner.nextLine();
                    }
                    System.out.println("Gràcies, m'agrada aquest nom.\n\n");
                    exercici6 = String.valueOf(nom1);
                    conversaPersona = conversaPersona + "Gràcies, " + nom1 + " m'agrada aquest nom " + exercici6 + "\n\n";
                    break;

                case 7:
                    //Exercici7

                    System.out.println("Ara et recordare la conversa:");
                    System.out.print("Sóc un/a ");
                    System.out.print(exercici1);
                    System.out.print(". El meu esport preferit es ");
                    System.out.println(exercici2);
                    System.out.print("El meu numero favorit es el ");
                    System.out.println(exercici3);
                    System.out.print("Tots els numeros parells resultants de la multiplicació son: ");
                    System.out.println(exercici4);
                    System.out.println("No hi ha resultat a pedra, paper i tisora");
                    System.out.print("El nom bonic es ");
                    System.out.println(exercici6);
                    break;
                case 8:
                    //Exercici8
                    System.out.println("Au adeu");
                    System.out.println(conversaPersona);

            }
        }
        return finishC;
    }
}
