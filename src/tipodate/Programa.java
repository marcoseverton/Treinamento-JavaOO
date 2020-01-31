package tipodate;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Programa {

	public static void main(String[] args)throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = sdf1.parse("30/01/2020");
		Date y2 = sdf2.parse("30/01/2020 16:44:05");
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		
		System.out.println("Y1: "+ sdf1.format(y1));
		System.out.println("Y2: "+ sdf2.format(y2));
		System.out.println("X1: "+ sdf2.format(x1));
		System.out.println("X2: "+ sdf2.format(x2));
		System.out.println("X3: "+ sdf2.format(x3));
		System.out.println("------------------------------------");

		System.out.println("Y1: "+ y1);
		System.out.println("Y2: "+ y2);
		System.out.println("X1: "+ x1);
		System.out.println("X2: "+ x2);
		System.out.println("X3: "+ x3);
	}

}
