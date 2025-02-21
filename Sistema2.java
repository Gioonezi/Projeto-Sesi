    import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Sistema de Informação SESI
        System.out.println("Bem vindo ao portal do aluno!");

        // Declaração de Variaveis
        String nome;
        double nota;

        // Entradas
        System.out.println("Informe o nome do estudante.");
        nome = input.nextLine();
        System.out.println("Informe a nota.");
        nota = input.nextDouble();

        // Processamento
        if (nota >= 50) {
            System.out.println(nome + " Estudante está aprovado.");
        } else {
            System.out.println(nome + " Estudante não está aprovado.");
        }

        // Saída
    }
}
