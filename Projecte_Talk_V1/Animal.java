package com.iesebre;

import java.util.Random;
import java.util.Scanner;


public class Animal {

    // Constructor
    void Animal() {
    }
    boolean talking() {
        boolean finishP = false;
        Scanner teclat = new Scanner(System.in);
        String conversaanimal = new String();
        boolean[] Verifiacio = new boolean[8];
        char PreguntaInicial = 0;

        //PART DEL PROJECTE AMB ANIMALS
        System.out.println("Okay ara que has triat animal anem a començar amb les preguntes:");
        while (PreguntaInicial != 'S') {
            System.out.println("A. Quin tipus de animal ets?");
            System.out.println("B. A que t'agrada jugar?");
            System.out.println("C. Quin és el teu caracter favorit?");
            System.out.println("D. Introduex dues lletres entre la A i la Z:");
            System.out.println("E. Creador de onomatopeies:");
            System.out.println("F. Com et dius?");
            System.out.println("G. Mostrar els resultats:");
            System.out.println("S. Sortir");

            PreguntaInicial = teclat.next().charAt(0);
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
            String nom = null;
            String gms = null;


        /*Després de provar-ho de diferentes formes finalment la que millor m'ha funcionat a l'hora d'ajuntar
          he desidit ficar totes les variables fora i fer-ho amb un if else if, se que no és la millor manera l'hora
          d'execució i memòria, però en aquest cas és la que m'ha funcionat*/
            switch (PreguntaInicial) {
                case 'A':
                    System.out.println("OPCIO A: Quin tipus d'animal ets?");
                    lletraex9 = teclat.next().charAt(0);
                    Verifiacio[1] = true;

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
                                System.out.println("Aquest caracter no existeix, per tant siras: Serp\n");
                                gms = "Serp\n";
                            } else if (casG >= casS && casG >= casM) {
                                System.out.println("Aquest caracter no existeix, per tant siras: Gos\n");
                                gms = "Gos\n";
                            } else if (casM >= casG && casM >= casS) {
                                System.out.println("Aquest caracter no existeix, per tant siras: Mono\n");
                                gms = "Mono\n";
                            }

                            conversaanimal = "El teu animal és: " + gms + "\n";
                    }
                    // I com farem en tots els casos tornem a plantejar les preguntes inicials
                    break;

                case 'B':
                    if (!Verifiacio[1]) {
                        System.out.println("\n Ep, comença per la A \n");
                        break;
                    }
                    String frase10 = null;
                    String lletra10;
                    System.out.println("OPCIO B:");
                    System.out.println("A. PILLA-PILLA");
                    System.out.println("B. PILOTA");
                    System.out.println("C. SALTAR");
                    System.out.println("D. CIRCUIT");
                    System.out.println("E. CORRER");
                    System.out.println("F. DINAMICA");
                    System.out.println("G. VOLS");
                    System.out.println("H. AMAGAR");
                    System.out.println("I. CERCAR");
                    System.out.println("I. ESTIRAR");
                    System.out.println("");
                    System.out.println("A que tagrada jugar?");
                    // per fer aquest mostrem les diferents opcions que hi ha fer escollir i mostrem el resultat amb un switch
                    lletra10 = teclat.next();
                    Verifiacio[2] = true;
                    switch (lletra10) {
                        case "A":
                            System.out.println("PILLA-PILLA\n");
                            frase10 = ("PILLA-PILLA");
                            break;
                        case "B":
                            System.out.println("PILOTA\n");
                            frase10 = ("PILOTA");
                            break;
                        case "C":
                            System.out.println("SALTAR\n");
                            frase10 = ("SALTAR");
                            break;
                        case "D":
                            System.out.println("CIRCUIT\n");
                            frase10 = ("CIRCUIT");
                            break;
                        case "E":
                            System.out.println("CORRER\n");
                            frase10 = ("CORRER");
                            break;
                        case "F":
                            System.out.println("DINAMICA\n");
                            frase10 = ("DINAMICA");
                            break;
                        case "G":
                            System.out.println("VOLS\n");
                            frase10 = ("VOLS");
                            break;
                        case "H":
                            System.out.println("AMAGAR\n");
                            frase10 = ("AMAGAR");
                            break;
                        case "I":
                            System.out.println("CERCAR\n");
                            frase10 = ("CERCAR");
                            break;
                        case "J":
                            System.out.println("ESTIRAR\n");
                            frase10 = ("ESTIRAR");
                            break;
                    }

                    conversaanimal = conversaanimal + "El teu joc preferit es: " + frase10 + "\n\n";
                    break;

            /*demanem una lletra i desde la lletra que ens dona fins la lletra A anem restant
            les lletres una a una i mostrarels fins arribar a la A
             */
                case 'C':
                    if (!Verifiacio[2]) {
                        System.out.println("\n Ep, fes la lletra anterior primer \n");
                        break;
                    }
                    System.out.println("OPCIO C: Quin és el teu caracter favorit?");
                    lletraex11 = teclat.next().charAt(0);
                    Verifiacio[3] = true;
                    conversaanimal = conversaanimal + "La lletra que tu has triat es: " + lletraex11 + " ,i el camí fins a ella és el següent:";
                    char frase11;
                    while (lletraex11 != iex11 - 1) {

                        System.out.println((char) iex11);
                        frase11 = ((char) iex11);
                        conversaanimal = conversaanimal + " " + frase11;
                        iex11++;
                    }
                    System.out.println("\n");
                    conversaanimal = conversaanimal + "!\n\n";
                    break;


                case 'D':
                    if (!Verifiacio[3]) {
                        System.out.println("\n Ep, fes la lletra anterior primer \n");
                        break;
                    }

               /* Demanem dues lletres restem el valor 65 per tal de deixar-les sobre 0
               llavors mirem totes les lletres que es trobem dintre aquest marge, quan ho tenim
               els torem a sumar 65 per tal de mostrarles dintre l'abecedari en majuscules i mirem els
               que son divisibles de 2 per tal de saber si som parells
                */
                    System.out.println("OPCIO D: Introdueix dues lletres que és trobin entre A i Z:");
                    ll1 = teclat.next().charAt(0);
                    ll2 = teclat.next().charAt(0);
                    Verifiacio[4] = true;


                    lletra1ex12 = (ll1 - 65);
                    lletra2ex12 = (ll2 - 65);
                    char lletresex12 = 0;
                    char frase12;
                    for (int i = lletra1ex12; i < lletra2ex12; ++i) {
                        for (int j = lletra2ex12; j > lletra1ex12; --j) {
                            total = i + j;
                            total = (total + 65);
                            if (total % 2 == 0)
                                lletresex12 = ((char) total);
                            System.out.print(lletresex12 + " ");
                            frase12 = (lletresex12);
                            conversaanimal = conversaanimal + " " + frase12;
                        }
                        conversaanimal = conversaanimal + "\n";
                        System.out.println();
                    }

                    System.out.println("\n");
                    conversaanimal = conversaanimal + "\n";
                    break;

                case 'E':
                    if (!Verifiacio[4]) {
                        System.out.println("\n Ep, fes la lletra anterior primer \n");
                        break;
                    }
                    Random r = new Random();
               /*Per fer aquest, busquem una comanda que en aquest cas es Random i li diem que treballe
               aquest cas en lletres majuscules, crearem un total de 10 onomatopeies, i guardarem les que
                siguin correctes.
                */
                    int i = 0;


                    System.out.println("OPCIO E: Anem a crear onomatopeies introduint una lletra cadascu, comença tu:");
                /*Farem dos casos un el qual l'ordinador posarà dos variables i un altre en el qual sols
                en posara una, d'aquesta manera tindrem difrentes opcions de creació.
                 */
                    conversaanimal = conversaanimal + "Aquestes són totes les onomatopies que hem creat, si son bones o dolentes i quantes bones hem fet finalment:" + "\n";
                    while (i != 5) {
                        a = teclat.next().charAt(0);
                        b = (char) (r.nextInt('Z' - 'A') + 'A');
                        System.out.println(b);
                        c = teclat.next().charAt(0);
                        conversaanimal = conversaanimal + " " + a + b + c + " ";
                        if (b == 'A') {
                            System.out.println("Aquesta onomatopeia es valida");
                            conversaanimal = conversaanimal + " " + "Correcta" + "\n";
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (b == 'E') {
                            System.out.println("Aquesta onomatopeia es valida");
                            conversaanimal = conversaanimal + " " + "Correcta" + "\n";
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (b == 'I') {
                            System.out.println("Aquesta onomatopeia es valida");
                            conversaanimal = conversaanimal + " " + "Correcta" + "\n";
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (b == 'O') {
                            System.out.println("Aquesta onomatopeia es valida");
                            conversaanimal = conversaanimal + " " + "Correcta" + "\n";
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (b == 'U') {
                            System.out.println("Aquesta onomatopeia es valida");
                            conversaanimal = conversaanimal + " " + "Correcta" + "\n";
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else {
                            System.out.println("Aquesta onomatopeia no es correcta");
                            conversaanimal = conversaanimal + " " + "Inorrecta" + "\n";
                        }


                        d = (char) (r.nextInt('Z' - 'A') + 'A');
                        System.out.println(d);
                        e = teclat.next().charAt(0);
                        f = (char) (r.nextInt('Z' - 'A') + 'A');
                        System.out.println(f);
                        conversaanimal = conversaanimal + " " + d + e + f + " ";

                        if (e == 'A') {
                            System.out.println("Aquesta onomatopeia es valida");
                            conversaanimal = conversaanimal + " " + "Correcta" + "\n";
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (e == 'E') {
                            System.out.println("Aquesta onomatopeia es valida");
                            conversaanimal = conversaanimal + " " + "Correcta" + "\n";
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (e == 'I') {
                            System.out.println("Aquesta onomatopeia es valida");
                            conversaanimal = conversaanimal + " " + "Correcta" + "\n";
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (e == 'O') {
                            System.out.println("Aquesta onomatopeia es valida");
                            conversaanimal = conversaanimal + " " + "Correcta" + "\n";
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else if (e == 'U') {
                            System.out.println("Aquesta onomatopeia es valida");
                            conversaanimal = conversaanimal + " " + "Correcta" + "\n";
                            n++;
                            System.out.println("Numero de onomatopeies correctes: " + n);
                        } else {
                            System.out.println("Aquesta onomatopeia no es correcta");
                            conversaanimal = conversaanimal + " " + "Inorrecta" + "\n";
                        }


                        i++;

                    }
                    Verifiacio[5] = true;

                    conversaanimal = conversaanimal + "\n" + "El número onomatopeies correctes són: " + n + "\n\n";
                    break;

                case 'F':
                    if (!Verifiacio[5]) {
                        System.out.println("\n Ep, fes la lletra anterior primer \n");
                        break;
                    }
                    //Aquí simplement li demanem el nom hi el guardem.

                    System.out.println("OPCIO F: Com et dius?");
                    nom = teclat.next();
                    System.out.println("Gracies " + nom + " m'agrada aquest nom!" + "\n\n");
                    Verifiacio[6] = true;
                    conversaanimal = conversaanimal + "Adeu " + nom + " a sigut un plaer jugar amb tu!\n";
                    break;
                case 'G':
                    if (!Verifiacio[6]) {
                        System.out.println("\n Ep, fes la lletra anterior primer \n");
                        break;
                    }
                    System.out.println(conversaanimal);
                    Verifiacio[7] = true;


                    break;


            }
        }
        return finishP;
    }
}

