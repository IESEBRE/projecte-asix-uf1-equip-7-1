package com.iesebre;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Alien {

    void Alien() {
    }

    boolean talking() {
        boolean FinishH = false;
        Scanner teclat = new Scanner(System.in);
        String ConversaAlien = new String();

        DecimalFormat UnDecimal = new DecimalFormat("0.0");
        int PreguntaInicial = 0;
        String Nom = null;
        String TipusExtraterrestre = null;
        String FormaDesplacarse = null;

        float NumeroPreferit = 0;
        boolean PartidaGuanyada = false;
        boolean[] Verificacio = new boolean[7];
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
            System.out.println();

            if (PreguntaInicial<1 || PreguntaInicial>8){
                System.out.println("Valor incorrecte. Torna-ho a provar.");
            }

            switch (PreguntaInicial) {
                case 1:
                    //Introduir un float entre 0 i 10 (P17float),fer l'arrodoniment a enter (P17int) i fer la resta per a que ens quedi la part decimal
                    System.out.println("Quin tipus d'extraterrestre ets?");
                    System.out.print("Introdueix un valor del 0 al 10: ");
                    boolean Correcte1 = false;
                    float P17float = teclat.nextFloat();
                    Verificacio[1] = true;
                    int P17int = (int) P17float;

                    while (P17float < 0 || P17float > 10) {
                        System.out.println("Ha de ser un nombre entre 0 i 10");
                        P17float = teclat.nextFloat();
                        P17int = (int) P17float;
                    }

                    //Un cop introduit el valor, es resta amb la part entera i només queda la part deciamal i amb la part decimal començem amb els IFs.
                    if (P17float - P17int == 0.5) {
                        System.out.println("Número arrodonit: " + P17int + "   Soc un Alien, no m'has vist");
                        TipusExtraterrestre = "soc un Alien, no m'has vist";
                        ConversaAlien = "Soc un Alien, no m'has vist\n\n";
                    } else if (P17float - P17int > 0.5) {
                        System.out.println("Número arrodonit: " + P17int + "   Soc un alien de Pau");
                        TipusExtraterrestre = "soc un alien de Pau";
                        ConversaAlien = "Soc un alien de Pau\n\n";
                    } else if (P17float - P17int < 0.5) {
                        System.out.println("Número arrodonit: " + P17int + "   Soc un Alien, et matare");
                        TipusExtraterrestre = "soc un Alien, et matare";
                        ConversaAlien = "Soc un Alien, et matare\n\n";
                    }
                    break;
                case 2:
                    if (!Verificacio[1]) {
                        System.out.println("Contesta la pregunta 1 abans de fer la 2");
                        break;
                    }
                    //Introduir un float entre 0 i 1.
                    System.out.println("Com et desplaces?");
                    System.out.print("Introdueix un nombre amb un decimal entre 0,1 i 1: ");
                    float P18 = teclat.nextFloat();
                    Verificacio[2] = true;
                    while (P18 <= 0 || P18 > 1) {
                        System.out.println("Valor incorrecte. Torna-ho a provar.");
                        P18 = teclat.nextFloat();
                    }
                    //En funció de quin nombre han introduit, surt la sortida de coincideix amb el float.
                    if (P18 == 0.1f) {
                        System.out.println("Navegant");
                        FormaDesplacarse = "navegant";
                        ConversaAlien = ConversaAlien + "Navegant\n\n";
                    } else if (P18 == 0.2f) {
                        System.out.println("Flotant");
                        FormaDesplacarse = "flotant";
                        ConversaAlien = ConversaAlien + "Amb moto\n\n";
                    } else if (P18 == 0.3f) {
                        System.out.println("Propulsat");
                        FormaDesplacarse = "propulsat";
                        ConversaAlien = ConversaAlien + "Propulsat\n\n";
                    } else if (P18 == 0.4f) {
                        System.out.println("Patinant");
                        FormaDesplacarse = "patinant";
                        ConversaAlien = ConversaAlien + "Patinant\n\n";
                    } else if (P18 == 0.5f) {
                        System.out.println("Caminant");
                        FormaDesplacarse = "caminant";
                        ConversaAlien = ConversaAlien + "Caminant\n\n";
                    } else if (P18 == 0.6f) {
                        System.out.println("Coetejant");
                        FormaDesplacarse = "coetejant";
                        ConversaAlien = ConversaAlien + "Coetejant\n\n";
                    } else if (P18 == 0.7f) {
                        System.out.println("Planejant");
                        FormaDesplacarse = "planejant";
                        ConversaAlien = ConversaAlien + "Planejant\n\n";
                    } else if (P18 == 0.8f) {
                        System.out.println("Corrent");
                        FormaDesplacarse = "corrent";
                        ConversaAlien = ConversaAlien + "Corrent\n\n";
                    } else if (P18 == 0.9f) {
                        System.out.println("Saltant");
                        FormaDesplacarse = "saltant";
                        ConversaAlien = ConversaAlien + "Saltant\n\n";
                    } else if (P18 == 1) {
                        System.out.println("Levitant");
                        FormaDesplacarse = "levitant";
                        ConversaAlien = ConversaAlien + "Levitant\n\n";
                    }
                    break;
                case 3:
                    if (!Verificacio[2]) {
                        System.out.println("Contesta les preguntes anteriors abans de fer aquesta ");
                        break;
                    }
                    System.out.println("Quin és el teu número favorit?");
                    //Introduir un nombre i establir que el format dels decimals tingui sol un digit.
                    float P19 = teclat.nextFloat();
                    while (P19 < 0) {
                        System.out.println("Valor incorrecte. Torna-ho a provar.");
                        P19 = teclat.nextFloat();
                    }
                    Verificacio[3] = true;
                    NumeroPreferit = (P19 / 2);
                    ConversaAlien = ConversaAlien + "El meu numero favorit es : " + NumeroPreferit + "\n\n";

                    // Amb la funció for, ha de començar des de 0 i ha de parar quan arribi a la meitat del nombre introduit, sumant cada cop 0,1.
                    for (float i = 0.0f; i <= NumeroPreferit; i += 0.1) {
                        System.out.println(UnDecimal.format(i));
                    }
                    break;

                case 4:
                    if (!Verificacio[3]) {
                        System.out.println("Contesta les preguntes anteriors abans de fer aquesta ");
                        break;
                    }
                    System.out.println("Ho sento, es una pregunta massa dificil, porva'n una altra.");
                    Verificacio[4] = true;
                    //Dos floats en una mateixa linia
                    //float A = teclat.nextFloat();
                    //float B = teclat.nextFloat();
                    //float Numero = ((A + B) / 2);
                    break;


                case 5:
                    if (!Verificacio[4]) {
                        System.out.println("Contesta les preguntes anteriors abans de fer aquesta ");
                        break;
                    }
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
                        if (P21float<0 || P21float>4){
                            System.out.println("Valor incorrecte. Torna-ho a provar.");
                        }
                        ConversaAlien = ConversaAlien + P21float + "\n";
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
                            ConversaAlien = ConversaAlien + "!!!TOCAT!!!\n";
                            System.out.println("HAS GUANYAT");
                            ConversaAlien = ConversaAlien + "HAS GUANYAT\n\n";
                            Final = true;
                            PartidaGuanyada = true;
                            Verificacio[5] = true;
                        } else if (Diferencia > 0 && Diferencia <= 0.3f) {
                            System.out.println("Estas aprop");
                            ConversaAlien = ConversaAlien + "Estas aprop\n";
                        } else if (Diferencia > 0.3f && Diferencia <= 1) {
                            System.out.println("Estas lluny");
                            ConversaAlien = ConversaAlien + "Estas lluny\n";
                        } else if (Diferencia > 1) {
                            System.out.println("Estas molt lluny");
                            ConversaAlien = ConversaAlien + "Estas molt lluny\n";
                        }
                        //Quan es realitzin 10 intents finalitzar el joc.
                        if (intents == 0) {
                            System.out.println("Has esgootat els 10 intents");
                            ConversaAlien = ConversaAlien + "Estas molt lluny\n";
                            System.out.println("HAS PERDUT");
                            ConversaAlien = ConversaAlien + "HAS PERDUT\n\n";
                            Verificacio[5] = true;
                            Final = true;
                        }

                    } while (!Final);
                    System.out.println("Fi del joc");
                    break;

                case 6:
                    if (!Verificacio[5]) {
                        System.out.println("Contesta les preguntes anteriors abans de fer aquesta ");
                        break;
                    }
                    teclat.nextLine();
                    System.out.print("Tria un nom: ");
                    Nom = teclat.nextLine();
                    while (Nom.isEmpty()){
                        System.out.println("Valor incorrecte. Torna-ho a provar.");
                        Nom = teclat.nextLine();
                    }
                    Verificacio[6] = true;
                    System.out.print(Nom);
                    ConversaAlien = ConversaAlien + "El meu nom es: " + Nom + "\n\n";
                    System.out.println(", quin nom mes bonic!");
                    break;
                case 7:
                    if (!Verificacio[6]) {
                        System.out.println("Contesta les preguntes anteriors abans de fer aquesta ");
                        break;
                    }
                    System.out.print("Em dic ");
                    System.out.print(Nom);
                    System.out.print(" i ");
                    System.out.print(TipusExtraterrestre);
                    System.out.println(". ");
                    System.out.print("Em solc transportar ");
                    System.out.print(FormaDesplacarse);
                    System.out.print(" i el meu numero favorit es el ");
                    System.out.println(NumeroPreferit + ". ");
                    System.out.print("També hem fet una partida al joc d'enfonsar el vaixell i ");
                    if (PartidaGuanyada) {
                        System.out.println("has tingut molta sort, ja veurem a la proxima.");
                    } else {
                        System.out.println("com soc un alien ningu em pot guanyar, tu tampoc.");
                    }
                    System.out.println("Aixo es tot el que recordo.");
                    break;
                case 8:
                    System.out.println("Au adeu, hasta la proxima.");
                    System.out.println(ConversaAlien);
            }
        }
        return FinishH;
    }
}
