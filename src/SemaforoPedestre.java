public class SemaforoPedestre extends Semaforo {

    private String corPedestre;

    public SemaforoPedestre(String corPedestre) {
        super(corPedestre);
        this.corPedestre = corPedestre;
    }

    public void mudarCorPed() {
        switch (this.corPedestre) {
            case "vermelho":
                this.corPedestre = "verde";
                break;
            case "verde":
            if (corPedestre.equals("verde")){
                System.out.println("O sinal está ficando verde!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Erro ao exibir a mensagem");
                }
            }
                this.corPedestre = "vermelho";
                break;
                
        }
    }

    public String getCorPed() {
        return this.corPedestre;
    }

    public void esperarPed(int segundosPed) {
        try {
            Thread.sleep(segundosPed * 1000);
        } catch (InterruptedException e) {
            System.out.println("Erro ao esperar");
        }
    }

}
