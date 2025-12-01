package trabalho_heranca;

public class Main {
    public static void main(String[] args) {
        CSapoFaminto sapo1 = new CSapoFaminto("REX", "Verde Musgo", 5, 6, 0);
        CSapoCururu sapo2 = new CSapoCururu("Atumalaka", "Roxo Brilhante", 10, 2, true);
        CSapoCururu sapo3 = new CSapoCururu("Sad FrogBoy", "Azul Cinzento", 1, 10, false);
        CSapoPeSujo sapo4 = new CSapoPeSujo("Cascão","Marrom Bombom", 2.5, 4, true, 0);
        CSapoQualquer sapo5 = new CSapoQualquer("Sapo Comum","Verde Natural", 1, 5);
        CSapo sapo6 = new CSapo("Saponildo","ciano", 2, 3);

        sapo1.mostrar();
        sapo1.andar();
        sapo1.mostrar();
        sapo1.comer();
        sapo1.mostrar();
        sapo1.pular();
        sapo1.mostrar();
        sapo1.comer();
        sapo1.mostrar();

        sapo2.andar();
        sapo2.comer();
        sapo2.pular();

        sapo3.andar();
        sapo3.comer();
        sapo3.pular();

        sapo4.andar();
        sapo4.comer();
        sapo4.pular();
        sapo4.mostrar();

        sapo5.andar();
        sapo5.comer();
        sapo5.pular();

    }
}