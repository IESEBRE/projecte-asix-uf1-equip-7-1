package com.iesebre;

import java.util.Random;
import java.util.Scanner;

public class Animal {
    //Constructor
    void Animal() {
    }

    boolean talking() {
        Scanner teclat = new Scanner(System.in);
        char opcions = 0;
        //PART DEL PROJECTE AMB ANIMALS

        System.out.println("A. Quin tipus de animal ets?");
        System.out.println("B. A que t'agrada jugar?");
        System.out.println("C. Quin és el teu caracter favorit?");
        System.out.println("D. Introdueix dues lletres entre la A i la Z:");
        System.out.println("E. Creador de onomatopeies:");
        System.out.println("F. Com et dius?");
        System.out.println("G. Mostrar els resultats:");
        System.out.println("S. Prem aquesta si vols sorti.");
        System.out.println("Per on vols començar?");
        opcions = teclat.next().charAt(0);

        char lletraex9;
        char lletra1ex9;
        char casG = 0;
        char casM = 0;
        char casS = 0;

        String lletraex10;

        char lletraex11 = 0;
        int iex11 = 'A';
        char ll1;
        char ll2;

        int lletra1ex12;
        int lletra2ex12;
        int total = 0;

        int n = 0;

        char a;
        char b;
        char c;
        char d;
        char e;
        char f;
        char variable1;
        char variable2;
        char variable3;
        String gms = null;

        String nom = null;

        /*Després de provar-ho de diferentes formes finalment la que millor m'ha funcionat a l'hora d'ajuntar
          he desidit ficar totes les variables fora i fer-ho amb un if else if, se que no és la millor manera l'hora
          d'execució i memòria, però en aquest cas és la que m'ha funcionat*/
        while (opcions != 'S') {


            if (opcions == 'A') {


                System.out.println("Quin tipus d'animal ets?");
                lletraex9 = teclat.next().charAt(0);

                    /*Per començar fiquem els casos facils que seria en cas de que la nostra persona selecciones gos, mono,
                    aixo ho fem amb un switch*/

                switch (lletraex9) {
                    case 'G':
                        System.out.println("Gos");
                        break;
                    case 'M':
                        System.out.println("Mono");
                        break;
                    case 'S':
                        System.out.println("Serp");
                        break;
                    default:
                    /*En cas de que no sigue aquestes, farem que per cada un
                    de les diferens Variables G,S,M vaigui suman i restan cada cop
                    i per saber quan tarda la lletra escollida arribar a la G,S,M per dalt i per baix
                    i seleccioni el cami més curt
                    */
                        lletra1ex9 = lletraex9;

                        while (lletraex9 != 'G') {
                            lletraex9++;
                            lletra1ex9--;
                            if (lletraex9 > lletra1ex9)
                                casG = lletra1ex9;
                            else casG = lletraex9;
                        }
                        while (lletraex9 != 'M') {
                            lletraex9++;
                            lletra1ex9--;
                            if (lletraex9 > lletra1ex9)
                                casM = lletra1ex9;
                            else casM = lletraex9;
                        }
                        while (lletraex9 != 'S') {
                            lletraex9++;
                            lletra1ex9--;
                            if (lletraex9 > lletra1ex9)
                                casS = lletra1ex9;
                            else casS = lletraex9;
                        }
                        /*després de fer això, tindrem el 3 camins més curts per arribar a cada lletra
                        per a tindre el cami més curt de tots comprem els diferents camins més curts
                        entre ells, i el més curt de tots serà l'animal de la nostra persona.
                         */
                        if (casS >= casG && casS >= casM) {
                            System.out.println("Aquest caracter no existeix, per tant siras: Serp");
                            gms = "Serp";
                        } else if (casG >= casS && casG >= casM) {
                            System.out.println("Aquest caracter no existeix, per tant siras: Gos");
                            gms = "Gos";
                        } else if (casM >= casG && casM >= casS) {
                            System.out.println("Aquest caracter no existeix, per tant siras: Mono");
                            gms = "Mono";
                        }

                }
                // I com farem en tots els casos tornem a plantejar les preguntes inicials
                System.out.println("");
                System.out.println("A. Quin tipus de animal ets?");
                System.out.println("B. A que t'agrada jugar?");
                System.out.println("C. Quin és el teu caracter favorit?");
                System.out.println("D. Introduex dues lletres entre la A i la Z:");
                System.out.println("E. Creador de onomatopeies:");
                System.out.println("F. Com et dius?");
                System.out.println("G. Mostrar els resultats:");
                System.out.println("S. Prem aquesta si vols sorti.");
                System.out.println("Quina vols contestar ara?");
                opcions = teclat.next().charAt(0);

            } else if (opcions == 'B') {

                String lletra10;
                System.out.println("A. 1,2,3 PICA PARET");
                System.out.println("B. ESCONDITE");
                System.out.println("C. PILLA PILLA");
                System.out.println("D. BOUS");
                System.out.println("E. SALTA A LA COMBA");
                System.out.println("F. CARRERES DE SACS");
                System.out.println("G. GALLINETA SEGA");
                System.out.println("H. EL MOCADOR");
                System.out.println("I. LES CADIRES");
                System.out.println("I. GAT I RATOLI");
                System.out.println("");
                System.out.println("A que tagrada jugar?");
                // per fer aquest mostrem les diferents opcions que hi ha fer escollir i mostrem el resultat amb un switch
                lletra10 = teclat.next();
                switch (lletra10) {
                    case "A":
                        System.out.println("1,2,3 PICA PARET");
                        break;
                    case "B":
                        System.out.println("ESCONDITE");
                        break;
                    case "C":
                        System.out.println("PILLA PILLA");
                        break;
                    case "D":
                        System.out.println("BOUS");
                        break;
                    case "E":
                        System.out.println("SALTA A LA COMBA");
                        break;
                    case "F":
                        System.out.println("CARRERES DE SACS");
                        break;
                    case "G":
                        System.out.println("GALLINETA SEGA");
                        break;
                    case "H":
                        System.out.println("EL MOCADOR");
                        break;
                    case "I":
                        System.out.println("LES CADIRES");
                        break;
                    case "J":
                        System.out.println("GAT I RATOLI");
                        break;
                }
                System.out.println("");
                System.out.println("A. Quin tipus de animal ets?");
                System.out.println("B. A que t'agrada jugar?");
                System.out.println("C. Quin és el teu caracter favorit?");
                System.out.println("D. Introduex dues lletres entre la A i la Z:");
                System.out.println("E. Creador de onomatopeies:");
                System.out.println("F. Com et dius?");
                System.out.println("G. Mostrar els resultats:");
                System.out.println("S. Prem aquesta si vols sorti.");
                System.out.println("Quina vols contestar ara?");
                opcions = teclat.next().charAt(0);


            } else if (opcions == 'C') {

            /*demanem una lletra i desde la lletra que ens dona fins la lletra A anem restant
            les lletres una a una i mostrarels fins arribar a la A
             */

                System.out.println("Quin es el teu caracter favorit?");
                lletraex11 = teclat.next().charAt(0);

                while (lletraex11 != iex11 - 1) {

                    System.out.println((char) iex11);
                    iex11++;
                }
                System.out.println("");
                System.out.println("A. Quin tipus de animal ets?");
                System.out.println("B. A que t'agrada jugar?");
                System.out.println("C. Quin és el teu caracter favorit?");
                System.out.println("D. Introduex dues lletres entre la A i la Z:");
                System.out.println("E. Creador de onomatopeies:");
                System.out.println("F. Com et dius?");
                System.out.println("G. Mostrar els resultats:");
                System.out.println("S. Prem aquesta si vols sorti.");
                System.out.println("Quina vols contestar ara?");
                opcions = teclat.next().charAt(0);


            } else if (opcions == 'D') {

               /* Demanem dues lletres restem el valor 65 per tal de deixar-les sobre 0
               llavors mirem totes les lletres que es trobem dintre aquest marge, quan ho tenim
               els torem a sumar 65 per tal de mostrarles dintre l'abecedari en majuscules i mirem els
               que son divisibles de 2 per tal de saber si som parells
                */
                System.out.println("Introdueix dues lletres que és trobin entre A i Z:");
                ll1 = teclat.next().charAt(0);
                ll2 = teclat.next().charAt(0);


                lletra1ex12 = (ll1 - 65);
                lletra2ex12 = (ll2 - 65);

                for (int i = lletra1ex12; i < lletra2ex12; ++i) {
                    for (int j = lletra2ex12; j > lletra1ex12; --j) {
                        total = i + j;
                        total = (total + 65);
                        if (total % 2 == 0)
                            System.out.print((char) total + " ");
                    }
                    System.out.println();
                }
                System.out.println("");
                System.out.println("A. Quin tipus de animal ets?");
                System.out.println("B. A que t'agrada jugar?");
                System.out.println("C. Quin és el teu caracter favorit?");
                System.out.println("D. Introduex dues lletres entre la A i la Z:");
                System.out.println("E. Creador de onomatopeies:");
                System.out.println("F. Com et dius?");
                System.out.println("G. Mostrar els resultats:");
                System.out.println("S. Prem aquesta si vols sorti.");
                System.out.println("Quina vols contestar ara?");
                opcions = teclat.next().charAt(0);


            } else if (opcions == 'E') {
                Random r = new Random();
               /*Per fer aquest, busquem una comanda que en aquest cas es Random i li diem que treballe
               aquest cas en lletres majuscules, crearem un total de 10 onomatopeies, i guardarem les que
                siguin correctes.
                */
                int i = 0;


                System.out.println("Anem a crear onomatopeies introduint una lletra cadascu, comença tu:");
                /*Farem dos casos un el qual l'ordinador posarà dos variables i un altre en el qual sols
                en posara una, d'aquesta manera tindrem difrentes opcions de creació.
                 */
                while (i != 5) {
                    a = teclat.next().charAt(0);
                    b = (char) (r.nextInt('Z' - 'A') + 'A');
                    System.out.println(b);
                    c = teclat.next().charAt(0);
                    if (b == 'A') {
                        System.out.println("Aquesta onomatopeia es valida");
                        n++;
                        System.out.println("Numero de onomatopeies correctes: " + n);
                    } else if (b == 'E') {
                        System.out.println("Aquesta onomatopeia es valida");
                        n++;
                        System.out.println("Numero de onomatopeies correctes: " + n);
                    } else if (b == 'I') {
                        System.out.println("Aquesta onomatopeia es valida");
                        n++;
                        System.out.println("Numero de onomatopeies correctes: " + n);
                    } else if (b == 'O') {
                        System.out.println("Aquesta onomatopeia es valida");
                        n++;
                        System.out.println("Numero de onomatopeies correctes: " + n);
                    } else if (b == 'U') {
                        System.out.println("Aquesta onomatopeia es valida");
                        n++;
                        System.out.println("Numero de onomatopeies correctes: " + n);
                    } else System.out.println("Aquesta onomatopeia no es correcta");


                    d = (char) (r.nextInt('Z' - 'A') + 'A');
                    System.out.println(d);
                    e = teclat.next().charAt(0);
                    f = (char) (r.nextInt('Z' - 'A') + 'A');
                    System.out.println(d);

                    if (e == 'A') {
                        System.out.println("Aquesta onomatopeia es valida");
                        n++;
                        System.out.println("Numero de onomatopeies correctes: " + n);
                    } else if (e == 'E') {
                        System.out.println("Aquesta onomatopeia es valida");
                        n++;
                        System.out.println("Numero de onomatopeies correctes: " + n);
                    } else if (e == 'I') {
                        System.out.println("Aquesta onomatopeia es valida");
                        n++;
                        System.out.println("Numero de onomatopeies correctes: " + n);
                    } else if (e == 'O') {
                        System.out.println("Aquesta onomatopeia es valida");
                        n++;
                        System.out.println("Numero de onomatopeies correctes: " + n);
                    } else if (e == 'U') {
                        System.out.println("Aquesta onomatopeia es valida");
                        n++;
                        System.out.println("Numero de onomatopeies correctes: " + n);
                    } else System.out.println("Aquesta onomatopeia no es correcta");

                    i++;

                }
                System.out.println("");
                System.out.println("A. Quin tipus de animal ets?");
                System.out.println("B. A que t'agrada jugar?");
                System.out.println("C. Quin és el teu caracter favorit?");
                System.out.println("D. Introduex dues lletres entre la A i la Z:");
                System.out.println("E. Creador de onomatopeies:");
                System.out.println("F. Com et dius?");
                System.out.println("G. Mostrar els resultats:");
                System.out.println("S. Prem aquesta si vols sorti.");
                System.out.println("Quina vols contestar ara?");
                opcions = teclat.next().charAt(0);


            } else if (opcions == 'F') {

                //Aquí simplement li demanem el nom hi el guardem.

                System.out.println("Com et dius?");
                nom = teclat.next();
                System.out.println(nom + ". Gràcies, m'agrada aquest nom");
                System.out.println("");
                System.out.println("A. Quin tipus de animal ets?");
                System.out.println("B. A que t'agrada jugar?");
                System.out.println("C. Quin és el teu caracter favorit?");
                System.out.println("D. Introduex dues lletres entre la A i la Z:");
                System.out.println("E. Creador de onomatopeies:");
                System.out.println("F. Com et dius?");
                System.out.println("G. Mostrar els resultats:");
                System.out.println("S. Prem aquesta si vols sorti.");
                System.out.println("Quina vols contestar ara?");
                opcions = teclat.next().charAt(0);


            } else if (opcions == 'G') {

                //I aqui mostrem tots els resoltats gaurdats anteriorments, el nom numero de onomatopeies tipus de animal i lletra preferida
                System.out.println("Hola " + nom + " anem a veure els teus resultats:");
                System.out.println("El teu animal és: " + gms);
                System.out.println("El teu caracter favorit és: " + lletraex11);
                System.out.println("Finalment, has creat un total de " + n + " onomatopeies");
                System.out.println("");
                System.out.println("A. Quin tipus de animal ets?");
                System.out.println("B. A que t'agrada jugar?");
                System.out.println("C. Quin és el teu caracter favorit?");
                System.out.println("D. Introduex dues lletres entre la A i la Z:");
                System.out.println("E. Creador de onomatopeies:");
                System.out.println("F. Com et dius?");
                System.out.println("G. Mostrar els resultats:");
                System.out.println("S. Prem aquesta si vols sorti.");
                System.out.println("Quina vols contestar ara?");
                opcions = teclat.next().charAt(0);
            }
        }
        return false;
    }
}
