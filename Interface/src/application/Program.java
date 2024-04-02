package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.service.BrasilTaxService;
import model.service.BrasilTaxService;
import model.service.RentalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Enter rental details");
		System.out.print("car model: ");
		String carModel = sc.nextLine();
		System.out.println("Withdrawal (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Return (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Enter the price per hour: ");
		double princePerhour = sc.nextDouble();
		System.out.print("Enter the price per day: ");
		double pricePerDay = sc.nextDouble();

		RentalService rentalService = new RentalService(princePerhour, pricePerDay, new BrasilTaxService());

		rentalService.processInvoice(cr);

		System.out.println("INVOICE: ");
		System.out.println("basic payment: " + cr.getInvoice().getBasicPayment());
		System.out.println("tax: " + cr.getInvoice().getTax());
		System.out.println("total payment: " + cr.getInvoice().getTotalPayment());

		sc.close();
	}

}
