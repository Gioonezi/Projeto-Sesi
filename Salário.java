import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Sistema de Informação da Empresa X
        System.out.println("Sistema de Informação da Empresa X");
        String nome;
        double salário;
        double total;

        // Processamento
        System.out.println("Insira seu nome");
        nome = input.nextLine();
        System.out.println("Informe seu salário");
        salário = input.nextDouble();
        if (salário >= 5000) {
            System.out.println("Quantidade a ser paga=R$" + (salário - salário * 0.8));
        } else {
            System.out.println("Você não precisa pagar imposto. ");
        }
    }
}
