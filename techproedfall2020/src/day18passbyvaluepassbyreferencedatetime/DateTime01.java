package day18passbyvaluepassbyreferencedatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

	public static void main(String[] args) {

		// Dates
		LocalDate currentDate01 = LocalDate.now(); // Localdate is immutable. now method date is zo
		
		System.out.println(currentDate01); // 2020-10-04
		
		System.out.println(currentDate01.plusDays(3)); //2020-10-07
		System.out.println(currentDate01.plusMonths(2));
		System.out.println(currentDate01.plusYears(4));
		
		System.out.println(currentDate01.minusDays(5)); //2020-09-29
		System.out.println(currentDate01.minusMonths(5)); //2020-05-04
		
		System.out.println(currentDate01.minusMonths(3).minusDays(5).plusYears(3)); //2023-06-29
		
		
		//Time
		LocalTime currentTime01 = LocalTime.now();
		System.out.println(currentTime01); //18:33:18.807
		System.out.println(currentTime01.plusHours(2).plusMinutes(5).plusSeconds(11)); //20:38:29.807
		System.out.println(currentTime01.minusHours(2).minusSeconds(20)); //16:36:51.811
				
		
		//Date and Time
		LocalDateTime curDateTime01 = LocalDateTime.now();
		System.out.println(curDateTime01); //2020-10-04T18:39:41.961
		
		//How to update date format
		LocalDate currentDate02 = LocalDate.now();
		System.out.println(currentDate02); //2020-10-04
		
		DateTimeFormatter dtf02 = DateTimeFormatter.ofPattern("dd/MMM/yyyy"); // 04/oktober/2020// 04/10/2020
		
		System.out.println(dtf02.format(currentDate02)); //04/okt/2020
		
		// hOW TO UPDATE TIME format
		LocalTime currentTime02 = LocalTime.now();
		DateTimeFormatter dtf03 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf03.format(currentTime02.plusHours(3))); //06:53  09:54
		
		DateTimeFormatter dtf04 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf04.format(currentTime02.plusHours(3)));  //21:56
		
		//How to get local time of any city or country
		LocalTime localTime = LocalTime.now(ZoneId.of("Turkey")); //eUROPA /MOSCOW
		System.out.println(localTime);
	}

}
