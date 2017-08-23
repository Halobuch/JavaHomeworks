package com.cognizant.dateformats;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormats {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d.toString());
		
		Date CurDate = new Date();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy h:mm a");
		System.out.println(format.format(CurDate));
		
		
		Date date = new Date();
		String strDateFormat = "H:mm:ss a";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		System.out.println(sdf.format(date));
		
		Date CurDate1 = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("MMM dd, yyyy h:mm:ss a");
		System.out.println(format1.format(CurDate1));
		
		Date CurDate0 = new Date();
		SimpleDateFormat format0 = new SimpleDateFormat("dd MMM yyyy HH:mm:ss z");
		System.out.println(format0.format(CurDate0));
		
				
		Date CurDate2 = new Date();
		SimpleDateFormat format2 = new SimpleDateFormat("h:mm a");
		System.out.println(format2.format(CurDate2));
		
		Date CurDate3 = new Date();
		SimpleDateFormat format3 = new SimpleDateFormat("h:mm:ss a");
		System.out.println(format3.format(CurDate3));
		
		Date CurDate4 = new Date();
		SimpleDateFormat format4 = new SimpleDateFormat("h:mm:ss a z");
		System.out.println(format4.format(CurDate4));
		
		
		Date CurDate5 = new Date();
		SimpleDateFormat format5 = new SimpleDateFormat("MM/dd/yy h:mm a");
		System.out.println(format5.format(CurDate5));
		
		Date CurDate6 = new Date();
		SimpleDateFormat format6 = new SimpleDateFormat("MMM dd, yyyy h:mm a");
		System.out.println(format6.format(CurDate6));
		
		Date CurDate7 = new Date();
		SimpleDateFormat format7 = new SimpleDateFormat("MMMM dd, yyyy h:mm:ss a z");
		System.out.println(format7.format(CurDate7));
		
		
		
	}

}
