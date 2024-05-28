/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author labfatec
 */
public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        count con = new count();
        double value = 0;
        int number = 0;

        con.limit = 10000.34;

        System.out.print("Digite o Número e o Nome da sua Conta: ");
        con.id = in.nextInt();
        con.name = in.next();

        System.out.print(
                "\nDigite o Valor do deposito: ");
        value = in.nextDouble();

        System.out.println(
                "Valor depositado: " + con.deposit(value));

        System.out.print(
                "\nDigite o valor do saque: ");
        value = in.nextDouble();

        System.out.println(con.pop(value) ? "O saque foi realizado: " + con.balance : "ERRO, saque não realizado");

        System.out.print(
                "\nDigite a conta de Transferencia: ");
        number = in.nextInt();

        System.out.print(
                "Digite o valor da Transferencia: ");
        value = in.nextDouble();

        System.out.println(con.transfer(con, value, number) ? "\nA transferencia foi efetuada com sucesso para: " + number : "\nERRO, transferencia recusada, verifique seu saldo ou a conta de transferencia");
        System.out.print(con.balance);
    }

}
