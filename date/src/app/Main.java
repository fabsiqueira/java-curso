package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf1.format(d));
		
		Calendar cal =  Calendar.getInstance();
		cal.setTime(d);
		//cal.add(Calendar.HOUR_OF_DAY, 4); adicionando hora
		//d = cal.getTime();
		//System.out.println(sdf1.format(d));
		
		// Pegando minutos 
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes:" + minutes);
		
		// Pegando mes 
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Month:" + month);
		
		
		
	}

}
