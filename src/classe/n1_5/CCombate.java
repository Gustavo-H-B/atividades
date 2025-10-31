package classe.n1_5;

public class CCombate {

    private CMonstro desafiado;
    private CMonstro desafiante;
    private boolean combateAceito;

    public CMonstro getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(CMonstro desafiado) {
        this.desafiado = desafiado;
    }

    public boolean isCombateAceito() {
        return combateAceito;
    }
    public void setCombateAceito(boolean combateAceito) {
        this.combateAceito = combateAceito;
    }

    public CMonstro getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(CMonstro desafiante) {
        this.desafiante = desafiante;
    }

    public void marcarCombate(CMonstro desafiado, CMonstro desafiante) {
        if(desafiante != desafiado){
            this.combateAceito = true;
            this.desafiante = desafiante;
            this.desafiado = desafiado;
        }
        else {
            this.combateAceito = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void duelar(CMonstro sapo, CMonstro rato){
        System.out.println("!!!Duelo de titãs começou!!!");

        if (this.isCombateAceito()) {

        System.out.println("\n--- TURNO 1 ---");
        sapo.atacar(sapo.getAtaque());
        System.out.print(" VIDA ATUAL: " + rato.getVida() + " do " + rato.getNome());

        System.out.println("\n--- TURNO 2 ---");
        rato.atacar(rato.getAtaque());
        System.out.print(" VIDA ATUAL: " + sapo.getVida() + " do " + sapo.getNome());

        System.out.println("\n--- TURNO 3 ---");
        sapo.atacar(sapo.getAtaque());
        System.out.print(" VIDA ATUAL: " + rato.getVida() + " do " + rato.getNome());

    } else {
        System.out.println("O duelo não pode ser marcado.");
    }
        System.out.println("Fim do duelo.");
    }
}