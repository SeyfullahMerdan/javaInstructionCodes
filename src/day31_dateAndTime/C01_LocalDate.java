package day31_dateAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class C01_LocalDate {

	public static void main(String[] args) {

		
        LocalDate trhh=LocalDate.now();
		
		System.out.println(trhh);  // 2021-12-02
 
		System.out.println(trhh.getDayOfYear());     //  336
		System.out.println(trhh.getDayOfMonth());    //  2
		System.out.println(trhh.getDayOfWeek());     // THURSDAY
		System.out.println(trhh.getMonthValue());    // 12
		System.out.println(trhh.getMonth());         // DECEMBER
		
		System.out.println(trhh.plusDays(20));       // 2021-12-22
		System.out.println(trhh.plusMonths(5)   );   // 2022-05-02
		System.out.println(trhh.plusWeeks(0));
		System.out.println(trhh.plusYears(4));
		
		System.out.println(trhh.plusYears(10).plusMonths(10).plusDays(10)); // 2032-10-12
	
		System.out.println(trhh.minusWeeks(2));    // 2021-11-18
		System.out.println(trhh.minusYears(5));    // 2016-12-02
		System.out.println(trhh.minusMonths(52));  // 2017-08-02
		
		System.out.println(trhh.minusYears(2).minusMonths(3).minusDays(50));  // 2019-07-14
		System.out.println(trhh.plusYears(3).isLeapYear());  // true
		
		
		LocalDate dogumtarihi1=LocalDate.of(1989, Month.APRIL , 19);
		LocalDate dogumtarihi2=LocalDate.of(1985, 4, 3);
		LocalDate dogumtarihi3=LocalDate.ofYearDay(1987, 353);
		

		
		System.out.println(dogumtarihi1 + "**** " + dogumtarihi2 + "*** " + dogumtarihi3 ); // 1989-04-19**** 1985-04-03*** 1987-12-19
		
		System.out.println(dogumtarihi1.isAfter(dogumtarihi2));  // true
		System.out.println(dogumtarihi2.isBefore(dogumtarihi3));  // false
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen dogum tarihinizi giriniz.");
	    LocalDate dogumTarihi4=LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
		System.out.println(dogumTarihi4);
	
       
		scan.close();
	}

}
