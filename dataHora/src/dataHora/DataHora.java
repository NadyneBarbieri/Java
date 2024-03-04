package dataHora;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataHora {

		public static void main(String[] args) {
			//data local 
			DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			DateTimeFormatter fmt3 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
			DateTimeFormatter fmt4 =  DateTimeFormatter.ISO_DATE_TIME;
			DateTimeFormatter fmt5 =  DateTimeFormatter.ISO_INSTANT;
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
			LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
			// data e hora formatada 
			LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
			//data   
			LocalDate d10 = LocalDate.of(2022, 07, 20);
			//data e hora
			LocalDateTime d11 = LocalDateTime.of(2024, 03, 02, 1, 30);
			
			//corvertendo data global para data local
			LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
			LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
			LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
			LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
			
			System.out.println("r1 = " + r1);
			System.out.println("r2 = " + r2);
			System.out.println("r3 = " + r3);
			System.out.println("r4 = " + r4);
			
			System.out.println("d04 dia = " + d04.getDayOfMonth());
			System.out.println("d04 mes = " + d04.getMonthValue());
			System.out.println("d04 ano = " + d04.getYear());
			
			System.out.println("d05 hora = " + d05.getHour());
			System.out.println("d05 minutos = " + d05.getMinute());
			
			//adicao e subtratcao de dia
			LocalDate pastWeekLocalDate = d04.minusDays(7);
			LocalDate nextWeekLocalDate = d04.plusDays(7);
			
			System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
			System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
			
			//adicao e subtratcao de hora
			LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
			LocalDateTime nextWeekLocalDateTime = d05.minusDays(7);
			
			System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
			System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
			
			//adicao e subtratcao de dia global
			Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
			Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
			
			System.out.println("pastWeekInstant = " + pastWeekInstant);
			System.out.println("nextWeekInstant = " + nextWeekInstant);
			
			//Calculando quantidade de dias de uma data para outra 
			Duration t1 = Duration.between(pastWeekLocalDate.atTime(0,0), d04.atTime(0,0));
			Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
			Duration t3 = Duration.between(pastWeekInstant, d06);
			Duration t4 = Duration.between(d06, pastWeekInstant);
			System.out.println("t1 dias = " + t1.toDays());
			System.out.println("t2 dias = " + t2.toDays());
			System.out.println("t3 dias = " + t3.toDays());
			System.out.println("t4 dias = " + t4.toDays());
			
			
			
			System.out.println("d01 = " + d01);
			System.out.println("d02 = " + d02);
			System.out.println("d03 = " + d03);
			System.out.println("d04 = " + fmt1.format(d04));
			System.out.println("d05 = " + fmt2.format(d05));
			System.out.println("d06 = " + fmt4.format(d05));
			System.out.println("d07 = " + fmt5.format(d06));
			System.out.println("d08 = " + fmt3.format(d06));
			
			System.out.println("d09 = " + d07);
			System.out.println("d10 = " + d08);
			System.out.println("d11 = " + d09);
			System.out.println("d12 = " + d10);
			System.out.println("d13 = " + d11);
			
			
		}
	}
