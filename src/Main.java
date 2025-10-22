import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int x;
        System.out.println("Digite um valor secreto: ");
        x = leia.nextInt();

        for(int contagem = 5;contagem >= 0; contagem--){
            if(contagem == 0) {
                System.out.println("Você perdeu!");
            } else{
                int y;
                System.out.println("Digite um número: ");
                y = leia.nextInt();
                if (y == x) {
                    System.out.println("Parabéns você conseguiu!");
                    break;
                } else {
                    System.out.println("Errou, restam apenas " + (contagem - 1) + " tentativas.");
                    if (y < x){
                        System.out.println("O número secreto é maior.");
                    } else{
                        System.out.println("O número secreto é menor.");
                    }
                }
            }
        }

    }
}