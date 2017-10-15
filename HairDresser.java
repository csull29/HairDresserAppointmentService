/*
HairDresser.java
C Sullivan
18 4 2017
*/


//class signature
public class HairDresser{

	//data members

	private String service;
	private String day;
	private String length;

	//constructor
	public HairDresser(){
		service="";
		day="";
		length="";
	}

	//setters
	public void setService(String service){
		this.service=service;
	}
	public void setLength(String length){
		this.length=length;
	}

	//compute
	public void compute(){
		if(service.equalsIgnoreCase("cut")){
			if(length.equalsIgnoreCase("short")){
				day="Monday";
			}
			else{
				day="Tuesday";
			}
		}
		else if(service.equalsIgnoreCase("color")){
				if(length.equalsIgnoreCase("short")){
					day="Wednesday";
				}
				else{
					day="Thursday";
				}
			}
			else if(service.equalsIgnoreCase("blowDry")){
				if(length.equalsIgnoreCase("short")){
					day="Friday";
				}
				else{
					day="Saturday";
				}//closes the last else
			}//closes the else if
		}//ends compute

		public String getDay(){
			return day;
		}
	}