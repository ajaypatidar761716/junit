package log4jdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Test
{
 final static Logger loger=Logger.getLogger(Test.class.getName());
	public static void main(String[] args)
	{
		PropertyConfigurator.configure("log4j.properties");
		loger.debug("This is debug");
		loger.info("This is info");
		loger.warn("This is warn");
		loger.error("This is error");
		loger.fatal("This is fatal");
	}
}
