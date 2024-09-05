public class App {
    public static void main(String[] args) {
        Semaforo semaforoA = new Semaforo("verde");
        Semaforo semaforoB = new Semaforo("vermelho");
        Semaforo semaforoC = new Semaforo("vermelho");
        Semaforo semaforoD = new Semaforo("vermelho");
        SemaforoPedestre semaforoPed = new SemaforoPedestre("vermelho");
        printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
        while (true) {
            semaforoA.esperar(10);
            semaforoA.mudarCor();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoA.esperar(2);
            semaforoA.mudarCor();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoB.esperar(0);
            semaforoB.mudarCor();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoB.esperar(10);
            semaforoB.mudarCor();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoB.esperar(2);
            semaforoB.mudarCor();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoC.esperar(0);
            semaforoC.mudarCor();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoC.esperar(10);
            semaforoC.mudarCor();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoC.esperar(2);
            semaforoC.mudarCor();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoD.esperar(0);
            semaforoD.mudarCor();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoD.esperar(10);
            semaforoD.mudarCor();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoD.esperar(2);
            semaforoD.mudarCor();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoPed.esperarPed(0);
            semaforoPed.mudarCorPed();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoPed.esperarPed(10);
            semaforoPed.mudarCorPed();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoPed.esperarPed(1);
            semaforoPed.mudarCorPed();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoPed.esperarPed(1);
            semaforoPed.mudarCorPed();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoPed.esperarPed(1);
            semaforoPed.mudarCorPed();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoPed.esperarPed(1);
            semaforoPed.mudarCorPed();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoPed.esperarPed(1);
            semaforoPed.mudarCorPed();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
            semaforoPed.esperarPed(0);
            semaforoPed.mudarCorPed();
            semaforoA.esperar(0);
            semaforoA.mudarCor();
            printStatus(semaforoA, semaforoB, semaforoC, semaforoD, semaforoPed);
        }
    }

    // Método para imprimir o status dos semáforos
    public static void printStatus(Semaforo semaforoA, Semaforo semaforoB, Semaforo semaforoC, Semaforo semaforoD,
            SemaforoPedestre semaforoPed) {
        // Limpar a tela
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // Imprimir semáforo A
        System.out.println("Semáforo A:");
        printSemaforo(semaforoA);
        // Imprimir semáforo B
        System.out.println("Semáforo B:");
        printSemaforo(semaforoB);
        System.out.println("Semaforo C");
        printSemaforo(semaforoC);
        System.out.println("Semaforo D");
        printSemaforo(semaforoD);
        System.out.println("Semaforo Pedestre");
        printSemaforoPedestre(semaforoPed);
    }

    /*
     * Método auxiliar para imprimir um semáforo na tela com o uso de cores ANSI
     * vermelho: \u001B[41m
     * amarelo: \u001B[43m
     * verde: \u001B[42m
     * reset: \u001B[0m
     */
    public static void printSemaforo(Semaforo semaforo) {
        String cor = semaforo.getCor();
        String vermelho = "";
        String amarelo = "";
        String verde = "";
        if (cor.equals("vermelho")) {
            vermelho = "\u001B[41m \u001B[0m";
        } else {
            vermelho = " ";
        }
        if (cor.equals("amarelo")) {
            amarelo = "\u001B[43m \u001B[0m";
        } else {
            amarelo = " ";
        }
        if (cor.equals("verde")) {
            verde = "\u001B[42m \u001B[0m";
        } else {
            verde = " ";
        }
        // Imprime o semáforo
        System.out.println(" " + vermelho);
        System.out.println(" " + amarelo);
        System.out.println(" " + verde);
    }

    public static void printSemaforoPedestre(SemaforoPedestre semaforoPed) {
        String corPedestre = semaforoPed.getCorPed();
        String vermelho = "";
        String verde = "";

        if (corPedestre.equals("vermelho")) {
            vermelho = "\u001B[41m \u001B[0m";
        } else {
            vermelho = " ";
        }
        if (corPedestre.equals("verde")) {
            verde = "\u001B[42m \u001B[0m";
        } else {
            verde = " ";
        }

        System.out.println(" " + vermelho);
        System.out.println(" " + verde);

        
        
    }
    
}
