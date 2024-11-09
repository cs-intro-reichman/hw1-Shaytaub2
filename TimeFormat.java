// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String time = "";
		if (minutes < 10) 
		{	
			time = "0" + minutes;
		}
		else
		{
			time = "" + minutes;
		}
		if (hours==12)
		{
			time = hours + ":" + time + " PM";
		}
		else
		{
			if (hours>=1 && hours<=11)
			{
				time = hours + ":" + time + " AM";
			}
			else
				{
					if(hours == 0)
					{
						time = hours + ":" + time + " AM";
					}
						else 
					{
							hours = hours-12;
							time = hours + ":" + time + " PM";
					}
				}
			}
		System.out.println(time);
	}
}

