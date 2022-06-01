package screenshot;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProgram
{
       public static void main(String[] args) 
       {
		    Date d = new Date();
		    System.out.println(d);
		    
		  //  simple format
		  DateFormat  d1   = new SimpleDateFormat("MM-dd-yy& HH-mm-ss");
		  String date = d1.format(d);
			System.out.println(date);

	}
}
