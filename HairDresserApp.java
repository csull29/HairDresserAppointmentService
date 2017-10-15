/*
HairDresserApp
C Sullivan
18 4 2017
*/

import javax.swing.*;
public class HairDresserApp{
	public static void main(String args[]){

		//inputs
		String service,day,length;

		//object
		HairDresser myHairDresser=new HairDresser();


		//input
		JOptionPane.showMessageDialog(null, "Welcome to the HairDresser's Online Appointment Service.");

		service=JOptionPane.showInputDialog(null, "What do you want done?: i.e. cut, color or blowdry.");
		myHairDresser.setService(service);

	length=JOptionPane.showInputDialog(null, "What is the length of your hair?");
		myHairDresser.setLength(length);

		//process
		myHairDresser.compute();

		//output
		day=myHairDresser.getDay();
		JOptionPane.showMessageDialog(null, "Please call into the hairdressers on "+day);
	}
}

