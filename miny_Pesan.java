import java.util.Random;

class Miny {
    int Sirka = 30;
    int Vyska = 10;
    int PocetMin = 20;
    char[][] MinovePole;

    public Miny() {
        System.out.println("Generace");

        MinovePole = new char[Vyska][Sirka];

        System.out.println("Nulace");

        clearMinovePole();

        System.out.println("Rozmístění min");

        placeMiny();

        drawMinovePole();
    }
    public void placeMiny() {
        int minUdano = 0;
        Random random = new Random();
        while (minUdano < PocetMin) {
            int x = random.nextInt(Sirka);
            int y = random.nextInt(Vyska);

            if (MinovePole[y][x] != '*') {
                MinovePole[y][x] = '*';
                minUdano++;
            }
        }
    }
    public void clearMinovePole() {
        for (int y = 0; y < Vyska; y++) {
            for (int x = 0; x < Sirka; x++) {
                MinovePole[y][x] = ' ';
            }
        }
    }
    public void drawMinovePole() {
        for (int y = 0; y < Vyska; y++) {
            for (int x = 0; x < Sirka; x++) {
                System.out.print(MinovePole[y][x]);
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Miny miny = new Miny();
    }
}