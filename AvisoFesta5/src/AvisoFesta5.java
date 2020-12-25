import java.util.Scanner;

public class AvisoFesta5 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int vezes;
        String Frase;

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.print("Digite a frase: ");
        Frase = entrada.nextLine();

        vezes = 0;

        do
        {
            System.out.print("Digite o número de repetições: ");
            vezes = entrada.nextInt();
        } while (vezes < 1);

        System.out.println();

        for (int i = 0; i < vezes; i++)
        {
            System.out.println(Frase);
        }

        entrada.close();
    }
}
