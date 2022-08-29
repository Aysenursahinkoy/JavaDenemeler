package Bolum11Alistirma;

import java.util.ArrayList;
import java.util.Date;

public class Account {

	private String name;
	private int id;
	private double balance;
	private double annualInterestRate;
	private ArrayList<Transactions> Transactions;

	public Account() {

	}

	public Account(String name,int id, double balance) {
		this.name=name;
		this.id = id;
		this.balance = balance;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterestRate() {

		return (balance * annualInterestRate / 12) / 100;
	}

	public double getMonthlyInterest() {

		return (balance * annualInterestRate / 12);

	}

	public double withdraw(double amount) {
		return balance -= amount;
	}

	public double deposit(double amount) {
	 	return balance += amount;

	}

	@Override
	public String toString() {
		return "Account name : " + name  + "  id: " +id + "   balance:  " +balance;

	}

	public ArrayList<Transactions> getTransactions() {
	
		return new ArrayList<>(Transactions);
	}
	
}

class Transactions {

	private Date date;
	private char type;
	private double amount;
	private String description;
	private double balance;

	public Transactions(char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.description = description;
		this.balance = balance;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
