import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome: ");
        nome = teclado.next();
        System.out.println("Olá, " + nome + "!");

        teclado.close();
    }
}