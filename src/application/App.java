package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Person;
import entities.TaxPayment;

public class App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<TaxPayment> taxx = new ArrayList<>();
		
		System.out.print("Enter the number of tax payer: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i<=n ; i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company? (i/c) .: ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (c == 'i') {
				System.out.print("Health expenditure: ");
				double health = sc.nextDouble();
				taxx.add(new Person(name, anualIncome, health));
			} else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				taxx.add(new Company(name, anualIncome, employees));
			}
		}
		
		System.out.println();
		double sum = 0;
		System.out.println("TAXES PAID:");
		for (TaxPayment payer : taxx) {
			System.out.println(payer.getName()+": $ "+String.format("%.2f", payer.tax()));
			sum += payer.tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ "+String.format("%.2f", sum));
		
		
		sc.close();
	}
}
