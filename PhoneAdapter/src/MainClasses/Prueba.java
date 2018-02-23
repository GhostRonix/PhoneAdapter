/**
 * 
 */
package MainClasses;

/**
 * @author Ronixon Ledesma
 *
 */

	

/* Imports Classes from Samsung Package*/
import Samsung.AndroidPhone;
import Samsung.miniUSB;
import Samsung.GalaxyS8;

/* Imports Classes from Apple Package*/

import Apple.ApplePhone;
import Apple.EuropeanToAmericanAd;
import Apple.Iphone8;
import Apple.UsbC;

/*---------------------------------------------------------*/


public class Prueba {

	public static void main (String[] args)
	{
		
		 miniUSB androidCharger = new miniUSB();
	        AndroidPhone androidPhone = new GalaxyS8();
	        androidCharger.charge(androidPhone);

	        UsbC iPhoneCharger = new UsbC();
	        ApplePhone iPhone = new Iphone8();
	        iPhoneCharger.charge(iPhone);

	       // EURtoUSAdapter adapter = new EURtoUSAdapter(null);
	       // iPhoneCharger.charge(adapter);
	        
	        
	       

		
	}
}

