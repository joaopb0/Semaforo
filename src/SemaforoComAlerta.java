public class SemaforoComAlerta extends Semaforo {
    private boolean alerta;

    public SemaforoComAlerta(String cor, boolean alerta) {
        super(cor);
        this.alerta = alerta;
    }

    @Override
    public void mudarCor() {
        if (this.cor.equals("amarelo")) {
            ativarAlerta();
        }
        if(alerta == true) {
            System.out.println("O semaforo vai fechar!");
        }
        super.mudarCor();
    }

    public void ativarAlerta() {
        this.alerta = true;
    }

    public void desativarAlerta() {
        this.alerta = false;
    }

    public boolean isAlertaAtivo() {
        return this.alerta;
    }
}
