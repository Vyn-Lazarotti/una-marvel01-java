import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do recruta: ");
        String nome = teclado.nextLine().toUpperCase();
        System.out.println("Olá, " + nome + "!");

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        
        if (idade < 18) {
            System.out.println("Candidato rejeitado. Muito jovem para a guerra!\n Retorne em alguns anos!");
        } else {
            
            System.out.println("Digite o seu peso: ");
            double peso = teclado.nextDouble();
            System.out.println("Seu peso é " + peso + " kg");

            System.out.println("Digite sua altura em centimetros: ");
            double altura = teclado.nextDouble();

            //double imc = peso / Math.pow(altura / 100, 2);

            if (peso < 50) {
                System.out.println("Você está abaixo do peso ideal para o alistamento!");
            } else if (peso >= 50 && peso <= 100) {
                System.out.println("Você está dentro do peso ideal para o alistamento!");
            } else {
                System.out.println("Você está acima do peso ideal para o alistamento!");
            }
        }
        

        teclado.close();
    }
}
