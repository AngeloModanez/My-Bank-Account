/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author labfatec
 */
public class count {

    public int id;
    public double balance;
    public double limit;
    public String name;

    public double deposit(double value) {
        return balance += value;
    }

    public boolean pop(double value) {
        if (balance >= value && limit >= value) {
            balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(count destiny, double value, int number) {
        if (id == number && limit >= value) {
            balance -= value;
            return true;
        } else {
            return false;
        }
    }
}
