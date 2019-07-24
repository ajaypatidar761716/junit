import java.text.SimpleDateFormat;
import java.util.Date;

public class Dd 
{
  public String getDate(String df)
  {
	  Date d=new Date();
	  
	  SimpleDateFormat sdf=new SimpleDateFormat(df);
	  String md=sdf.format(d);
	  return md;
	  
  }
}
