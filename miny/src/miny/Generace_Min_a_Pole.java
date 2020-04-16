package miny;

import java.util.Random;

public class Generace_Min_a_Pole {
	
	 int sirka = 10;
	 int vyska = 10;
	 int pocetMin = 5;
	 int[][] mapa;

	    public void vytvorMapu() {
	        mapa = new int[sirka][vyska];

	    }

	    Random rand = new Random();

	    public void vytvorMiny() { 
	        int i = 0;

	        while (i < pocetMin) {
	            int x = rand.nextInt(sirka);
	            int y = rand.nextInt(vyska);
	            if (mapa[x][y] != 9) {
	                mapa[x][y] = 9;
	                i++;
	            }
	        }
	    }

public void vykresleniPole() { 
    for (int y = 0; y < vyska; y++) {
        for (int x = 0; x < sirka; x++) {
            if (mapa[x][y] == 9) {
                System.out.print(" X ");
            } else {
                System.out.print(" " + mapa[x][y] + " ");
            }

        }
    }
}

}