package classe.n1_5;

public class Main {
    public static void main(String[] args) {
        CMonstro sapo = new CMonstro("Sapossauro", 100, 69, 0, 0, 0);
        CMonstro rato = new CMonstro("Ratomano", 1, 0.1, -1, 9, 0);

        CCombate nemEDuelo = new CCombate();
        nemEDuelo.marcarCombate(sapo, rato);
        nemEDuelo.duelar(sapo, rato);


    }
}
