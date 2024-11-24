package org.github.sorteio;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Random randomGenerator = new Random();

        boolean awardGift = true;
        while (awardGift) {
            System.out.println("GIFTAWAY");
            System.out.println("");
            System.out.println("Bem-Vindo ao sistema de Sorteios!");
            System.out.println("Digite um número de acordo com o sistema que você quer fazer");
            System.out.println("\n1 - Faça um sorteio de números exemplo: Até qual número você quer? 100, irá sortear de 0 a 100\n2 - Sorteio nomes coloque com um espaço para diferenciar cada nome diferente.\n3 - Encerrar o Programa\n");

            System.out.print("Digite o número da operação que deseja (1/2/3): \n");
            int number = scanner.nextInt();

            if (number == 1) {
                System.out.println("\nDigite até qual número deseja: ");
                int random = scanner.nextInt();

                int numberWinner = randomGenerator.nextInt(random);
                System.out.println("\nO numero ganhador foi " + numberWinner + "\n");
            } else if (number == 2) {
                System.out.println("\nDigite os nomes separados por espaço: ");
                scanner.nextLine();
                String names = scanner.nextLine();
                String[] listNames = names.split(" ");

                int winner = randomGenerator.nextInt(listNames.length);
                System.out.println("\nNome sorteado: " + listNames[winner] + "\n");
            } else if (number == 3) {
                System.out.println("\nFinalizado com Sucesso, Adeus!");
                awardGift = false;
            } else {
                System.out.println("\nNúmero escolhido inválido.\n");
            }
        }
    }
}