package caculadoraimc;

import java.util.Scanner;

public class caculadoraIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Solicita e lê o peso do usuário
        System.out.print("Digite o seu peso (em kg): ");
        double peso = scanner.nextDouble();

        // Solicita e lê a altura do usuário
        System.out.print("Digite a sua altura (em metros): ");
        double altura = scanner.nextDouble();

        // Fecha o Scanner
        scanner.close();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Exibe o resultado
        System.out.printf("Seu IMC é: %.2f%n", imc);

        // Interpretação do resultado
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 24.9) {
            System.out.println("Você está com o peso normal.");
        } else if (imc < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade.");
        }

	}

}
