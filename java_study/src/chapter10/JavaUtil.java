package chapter10;

import java.util.Calendar;
import java.util.Date;

public class JavaUtil {
	public static void main(String[] args) {
		Date date = new Date(); 
		System.out.println(date.toString()); // Mon Sep 09 16:37:57 KST 2024
		System.out.println(date.getTime()); // 1725867477963
		
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		// 0 ~ 11 수로 반환 +1 해야 현재 월
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + " " + month + " " + day); // 2024 9 9

		
	}
}
