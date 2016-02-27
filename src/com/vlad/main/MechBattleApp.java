package com.vlad.main;


import java.util.Random;
import java.util.Scanner;

import com.vlad.mech.MK1Factory;
import com.vlad.mech.Player;

/**
 *
 * @author vladimirmujakovic
 */
public class MechBattleApp {

    public static void main(String[] args) {

        Random r = new Random();
        MK1Factory m = new MK1Factory(11,25);
        MK1Factory m2 = new MK1Factory(16,28);
        MK1Factory megaboss = new MK1Factory(30,100);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String nm = sc.next();

        
        Player me = new Player(nm, 100, 10);
        
        System.out.println(me.getPlayerInfo());
        String search = "n";

        while (search.equalsIgnoreCase("n")) {



            String commSelection = "s";

            while (commSelection.equalsIgnoreCase("s")) {

                System.out.println();
                System.out.println("Mech command interface.");
                System.out.println();
                System.out.print("Scan for target         -->    (S)\n");
                System.out.print("Exit command interface  -->    (E)\n");

                System.out.print("SELECT OPERATION: ");
                commSelection = sc.next();

                if (commSelection.equalsIgnoreCase("s")) {

                    int enemy;
                    enemy = r.nextInt(12) + 1;
                    if (enemy <= 5) {

                        String battleSelect = "";
                        System.out.println("Target MK1 Mech located. Loading MK1 profile.");
                        System.out.println();
                        System.out.println("MK1 hull strength: " + m.getMechHitpoints());
                        System.out.println("MK1 accuracy: " + m.getMechAccuracy());
                        System.out.println("Select command");
                        System.out.println();
                        System.out.print("Type command: (f) to FIRE on TARGET -- (x) to DISENGAGE -- (a) TO LOAD REFLECTIVE ARMOR: ");
                        battleSelect = sc.next();

                        if (battleSelect.equalsIgnoreCase("f")) {
                            String fireType = "";
                            System.out.println();
                            System.out.println("(r) Rockets (high damage, low accuracy | (c) Autocannon (low damage, 2 shots)");
                            System.out.print("Select Armament: ");
                            fireType = sc.next();
                        }else if (battleSelect.equalsIgnoreCase("x")) {
                            System.exit(0);
                        }


                    } else if (enemy >= 6) {
                        String battleSelect2 = "";
                        System.out.println("Target MK2 Mech located. Loading MK2 profile.");
                        System.out.println("MK1 hull strength: " + m2.getMechHitpoints());
                        System.out.println("MK1 accuracy: " + m2.getMechAccuracy());
                        System.out.println("Select command");
                        System.out.print("Type command: (f) to FIRE on TARGET -- (x) to DISENGAGE -- (a) TO LOAD REFLECTIVE ARMOR: ");
                        battleSelect2 = sc.next();

                        if (battleSelect2.equalsIgnoreCase("f")) {
                            String fireType2 = "";
                            System.out.println();
                            System.out.println("(r) Rockets (high damage, low accuracy | (c) Autocannon (low damage, 2 shots)");
                            System.out.print("Select Armament: ");
                            fireType2 = sc.next();
                        }


                    }
                }

            }

            System.out.println();

            System.out.println("Mech System console.");

            System.out.print("Shut Down Mech? (y/n): ");
            search = sc.next();

        }
    }
}
