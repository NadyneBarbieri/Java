package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

		public static void main(String[] args) {
			//data local 
			//DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			
			//data local
			LocalDate d01 = LocalDate.now();
			//data e hora local
			LocalDateTime d02 = LocalDateTime.now();
			//data hora gnt ou seja data e hora global de londres 
			Instant d03 = Instant.now();
			//data local
			LocalDate d04 = LocalDate.parse("2025-03-02");
			//data local e hora global
			LocalDateTime d05 = LocalDateTime.parse("2025-03-02T01:30:26");
			
			Instant d06 = Instant.parse("2025-03-02T01:30:26Z");
			//data hora gnt ou seja data e hora global de londres com fuso horario de 3 horas 
			Instant d07 = Instant.parse("2025-03-02T01:30:26-03:00");
			
			// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
			// data formatada
			LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			// data e hora formatada 
			LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
			//data   
			LocalDate d10 = LocalDate.of(2022, 07, 20);
			
			LocalDateTime d11 = LocalDateTime.of(2024, 03, 02, 1, 30);
			 
			System.out.println("d01 = " + d01.toString());
			System.out.println("d02 = " + d02.toString());
			System.out.println("d03 = " + d03.toString());
			System.out.println("d04 = " + d04.toString());
			System.out.println("d05 = " + d05.toString());
			System.out.println("d06 = " + d06.toString());
			System.out.println("d07 = " + d07.toString());
			System.out.println("d08 = " + d08.toString());
			System.out.println("d09 = " + d09.toString());
			System.out.println("d10 = " + d10.toString());
			System.out.println("d11 = " + d11.toString());
			
			
			
		}
	}
