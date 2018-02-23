
package MainClasses;
import Apple.EuropeanToAmericanAd;
import Apple.ApplePhone.*;



public class EURtoUSAdapter implements Apple.ApplePhone {
	
	EuropeanToAmericanAd converter;
	
	public EURtoUSAdapter(EuropeanToAmericanAd converter )
	{
		this.converter = converter;
		
	}
	
	public void charge() 
	{
		converter.plug();
	}

	
	
	

}
