package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente !");
        String cliente = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        int conta = sc.nextInt();

        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " " +
                "já está disponível para saque.");

        sc.close();
    }
}