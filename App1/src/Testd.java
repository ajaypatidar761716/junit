import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Testd 
{
 Dd df;
  
  @Before
  public void intializer()
  {
	  df=new Dd();
	  
  }
  @After
  public void distroy()
  {
	  df=null;
  }
  @Test
  public void dateTest()
  {
	  String a="dd/mm/yyyy";
	  String d=df.getDate(a);
	  assertEquals(d,d);
  }
  
}
