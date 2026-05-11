public class TestCoda {
    public static String patataBollente(String[] persone, int k) {
        Coda<String> coda = new Coda<>();

        for (int i = 0; i < persone.length; i++) {
            coda.enqueue(persone[i]);
        }

        System.out.println("Gioco: " + coda);

        while (coda.size() > 1) {

            for (int i = 0; i < k - 1; i++) {
                String turno = coda.dequeue();
                coda.enqueue(turno);
            }

            String fuori = coda.dequeue();
            System.out.println("Fuori: " + fuori);
            System.out.println("Rimasti: " + coda);
        }

        return coda.peek();
    }

    public static void main(String[] args) {

        String[] squadra1 = { "Luca", "Sara", "Michele", "Davide", "Chiara" };
        String vincitore1 = patataBollente(squadra1, 3);
        System.out.println("Vince: " + vincitore1);

        System.out.println();

        String[] squadra2 = { "Paolo", "Emma", "Giorgio", "Martina" };
        String vincitore2 = patataBollente(squadra2, 2);
        System.out.println("Vince: " + vincitore2);

        System.out.println();

        String[] squadra3 = { "Alessio" };
        String vincitore3 = patataBollente(squadra3, 5);
        System.out.println("Vince: " + vincitore3);
    }
}
