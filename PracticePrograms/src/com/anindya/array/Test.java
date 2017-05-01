package com.anindya.array;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Test {

	private List<String> totalNumberOfTimeIntervalsBetweenTwoTimes(String S, String T) {
		List<String> values = new ArrayList<>();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("hh.mm.ss");
		LocalTime t1 = LocalTime.parse(S, fmt);
		LocalTime t2 = LocalTime.parse(T, fmt);
		long minutes = ChronoUnit.MINUTES.between(t1, t2);
		System.out.println(minutes);
		
		String[] newS = S.split(":");
		String[] newT = T.split(":");
		if (Integer.valueOf(newS[0]) < 24 && Integer.valueOf(newS[1]) < 60 && Integer.valueOf(newS[2]) < 60
				&& Integer.valueOf(newT[0]) < 24 && Integer.valueOf(newT[1]) < 60 && Integer.valueOf(newT[2]) < 60
			 ) {
			// Find the difference between two dates
			int hourCounter = 0;
			int minutesCounter = 0;
			int secondsCounter = 0;
			if( Integer.valueOf(newS[0]) <= Integer.valueOf(newT[0])){
				if( Integer.valueOf(newS[1]) <= Integer.valueOf(newT[1])){
					if( Integer.valueOf(newS[2]) < Integer.valueOf(newT[2])){
						for(int i = Integer.valueOf(newS[2]); i <= Integer.valueOf(newT[2]); i++){
							// Increment the seconds
							values.add(newS[0]+":"+ newS[1]+":"+i);
						}
					}
					
				}
			}
			
			
		}

		return values;
	}

	public static void main(String[] args) {
		Test t = new Test();
		String[] s = "15:15:11".split(":");
		int MAX_HOUR_LENGTH = 23;
		int MAX_MINUTES_LENGTH = 59;
		int MAX_SECONDS_LENGTH = 59;
		if (Integer.valueOf(s[0]) < 24 && Integer.valueOf(s[1]) < 60 && Integer.valueOf(s[2]) < 60) {
			long newDistinctValues = (s[0].toString() + s[1].toString() + s[2]).toString().chars().distinct().count();
			if (newDistinctValues < 3) {
				System.out.println("True");
			}
		}
		System.out.println(t.totalNumberOfTimeIntervalsBetweenTwoTimes("15:15:11", "16:14:30"));

	}

}
