package com.iesebre;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Alien {
    // Constructor
    void Alien() {
    }

    boolean talking() {
        Scanner teclat = new Scanner(System.in);

        DecimalFormat UnDecimal = new DecimalFormat("0.0");
        int PreguntaInicial = 0;
        String Nom = null;
        String TipusExtraterrestre = null;
        String FormaDesplacarse = null;
        float NumeroPreferit = 0;
        boolean PartidaGuanyada = false;
        while (PreguntaInicial != 8) {
            System.out.println();
            System.out.println("Quina pregunta li vols fer a l'extraterrestre?");
            System.out.println("1. Quin tipus d'extraterrestre ets?");
            System.out.println("2. Com et desplaces?");
            System.out.println("3. Quin és es teu numero preferit entre 0 i ...");
            System.out.println("4. Pregunta dificil");
            System.out.println("5. Juguem a enfonsar el vaixell?");
            System.out.println("6. Posa-li un nom");
            System.out.println("7. Pots recordar-me la conversa?");
            System.out.println("8. Sortir");
            System.out.print("Quina pregunta vols respondre? ");
            PreguntaInicial = teclat.nextInt();


            switch (PreguntaInicial) {
                case 1:
                    //Introduir un float entre 0 i 10 (P17float),fer l'arrodoniment a enter (P17int) i fer la resta per a que ens quedi la part decimal
                    System.out.println("Quin tipus d'extraterrestre ets?");
                    System.out.print("Introdueix un valor: ");
                    float P17float = teclat.nextFloat();
                    int P17int = (int) P17float;

                    //Un cop introduit el valor, es resta amb la part entera i només queda la part deciamal i amb la part decimal començem amb els IFs.
                    if (P17float - P17int == 0.5) {
                        System.out.println("Número arrodonit: " + P17int + " Soc un extraterrestre sucubo");
                        TipusExtraterrestre = "soc un extraterrestre sucubo";
                    } else if (P17float - P17int > 0.5) {
                        System.out.println("Número arrodonit: " + P17int + " Soc un extraterrestre de pau");
                        TipusExtraterrestre = "soc un extraterrestre de pau";
                    } else if (P17float - P17int < 0.5) {
                        System.out.println("Número arrodonit: " + P17int + " Soc un extraterrestre assassi, ves amb compte");
                        TipusExtraterrestre = "soc un extraterrestre assassi";
                    }
                    break;
                case 2:
                    //Introduir un float entre 0 i 1.
                    System.out.println("Com et desplaces?");
                    System.out.print("Introdueix un nombre amb un decimal entre 0 i 1: ");
                    float P18 = teclat.nextFloat();
                    //En funció de quin nombre han introduit, surt la sortida de coincideix amb el float.
                    if (P18 == 0.1f) {
                        System.out.println("Amb cotxe");
                        FormaDesplacarse = "amb cotxe";
                    } else if (P18 == 0.2f) {
                        System.out.println("Amb moto");
                        FormaDesplacarse = "amb moto";
                    } else if (P18 == 0.3f) {
                        System.out.println("Amb vaixell");
                        FormaDesplacarse = "amb vaixell";
                    } else if (P18 == 0.4f) {
                        System.out.println("Amb patinet");
                        FormaDesplacarse = "amb patinet";
                    } else if (P18 == 0.5f) {
                        System.out.println("Amb taxi");
                        FormaDesplacarse = "amb taxi";
                    } else if (P18 == 0.6f) {
                        System.out.println("Amb bicicleta");
                        FormaDesplacarse = "amb bicicleta";
                    } else if (P18 == 0.7f) {
                        System.out.println("Amb autobus");
                        FormaDesplacarse = "amb autobus";
                    } else if (P18 == 0.8f) {
                        System.out.println("Amb tren");
                        FormaDesplacarse = "amb tren";
                    } else if (P18 == 0.9f) {
                        System.out.println("Amb metro");
                        FormaDesplacarse = "amb metro";
                    } else if (P18 == 1) {
                        System.out.println("Amb un OVNI");
                        FormaDesplacarse = "amb OVNI";
                    }
                    break;
                case 3:
                    System.out.println("Quin és el teu número favorit?");
                    //Introduir un nombre i establir que el format dels decimals tingui sol un digit.
                    float P19 = teclat.nextFloat();
                    NumeroPreferit = (P19 / 2);

                    // Amb la funció for, ha de començar des de 0 i ha de parar quan arribi a la meitat del nombre introduit, sumant cada cop 0,1.
                    for (float i = 0.0f; i <= NumeroPreferit; i += 0.1) {
                        System.out.println(UnDecimal.format(i));
                    }
                    break;

                case 4:
                    System.out.println("Ho sento, es una pregunta massa dificil, porva'n una altra.");
                    //Dos floats en una mateixa linia
                    //float A = teclat.nextFloat();
                    //float B = teclat.nextFloat();
                    //float Numero = ((A + B) / 2);
                    break;


                case 5:
                    double NumeroAleatoridouble = Math.random() * 4;
                    BigDecimal UnDecimal2 = new BigDecimal(NumeroAleatoridouble);
                    BigDecimal Tallat = UnDecimal2.setScale(1, RoundingMode.DOWN);
                    NumeroAleatoridouble = Tallat.doubleValue();
                    float NumeroAleatorifloat = (float) NumeroAleatoridouble;
                    //Aqui declarem la P17float sense valor, els intents per a que els vagi contant i un boleà que sigui el final del joc.
                    float P21float;
                    int intents = 10;
                    boolean Final = false;

                    //Executem un do while que vagi demanant entrar un float i va dient si es troba lluny o no del NumeroAleatorifloat fins que arribi a 10 intents o fins que s'introdueixi el número aleatori, que el boleà passarà a ser True.
                    // També s'ha d'anar sumant intents, ja que si arriba a 10, s'ha d'acabar el joc.
                    System.out.println("Introduiex nombres de 0 a 4 amb un decimal fins tocar el barquet");
                    do {
                        P21float = teclat.nextFloat();
                        intents--;
                        float Diferencia = P21float - NumeroAleatorifloat;
                        System.out.println("Intents restants: " + intents);
                        //Fer que la diferència sempre sigui positiva
                        if (Diferencia < 0) {
                            Diferencia = -(Diferencia);
                        }
                        //Definir en funció de Diferencia el missatge que ha de donar.
                        if (Diferencia == 0) {
                            System.out.println("!!!TOCAT!!!");
                            System.out.println("HAS GUANYAT");
                            Final = true;
                            PartidaGuanyada = true;
                        } else if (Diferencia > 0 && Diferencia <= 0.3f) {
                            System.out.println("Estas aprop");
                        } else if (Diferencia > 0.3f && Diferencia <= 1) {
                            System.out.println("Estas lluny");
                        } else if (Diferencia > 1) {
                            System.out.println("Estas molt lluny");
                        }
                        //Quan es realitzin 10 intents finalitzar el joc.
                        if (intents == 0) {
                            System.out.println("Has esgootat els 10 intents");
                            System.out.println("HAS PERDUT");
                            Final = true;
                        }

                    } while (!Final);
                    System.out.println("Fi del joc");
                    break;


                case 6:
                    System.out.print("Tria un nom: ");
                    Nom = teclat.next();
                    System.out.print(Nom);
                    System.out.println(", quin nom mes bonic!");
                    break;

                case 7:
                    System.out.print("M'has poat el nom de ");
                    System.out.print(Nom);
                    System.out.print(" i soc un ");
                    System.out.print(TipusExtraterrestre);
                    System.out.println(". ");
                    System.out.print("Hem solc desplacar ");
                    System.out.print(FormaDesplacarse);
                    System.out.print(" i el meu numero favorit es el ");
                    System.out.println(NumeroPreferit + ". ");
                    System.out.print("També hem fet una partida al joc d'enfonsar el vaixell i ");
                    if (PartidaGuanyada = true) {
                        System.out.println("has tingut molta sort, ja veurem a la proxima.");
                    } else {
                        System.out.println("com soc un alien ningu em pot guanyar, tu tampoc.");
                    }
                    System.out.println("Aixo es tot el que recordo.");
                    break;
                case 8:
                    System.out.println("Au adeu, hasta la proxima.");
            }
        }
        return PartidaGuanyada;
    }
}
