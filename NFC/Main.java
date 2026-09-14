public class Main {

    public static void main(String[] args) {
        PN532 pn532 = new PN532();

        pn532.iniciar();

        System.out.println("Leitor iniciado");
        System.out.println("Aproxime um NFC");

        while (true) {
            String uid = pn532.lerUID();

            if (uid != null) {
                System.out.println("UID encontrado");
                System.out.println("UID: " + uid);
                System.out.println();
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
    }