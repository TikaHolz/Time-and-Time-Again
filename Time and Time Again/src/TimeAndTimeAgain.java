import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class TimeAndTimeAgain
	{
	public static void main(String[] args)
		{
		try(Scanner input = new Scanner(System.in))
			{
			int numTimeCases = input.nextInt();
			Pattern secondRegex = Pattern.compile(".*(\\d+)s.*");
			Pattern minuteRegex = Pattern.compile(".*(\\d+)m.*");
			Pattern hourRegex = Pattern.compile(".*(\\d+)h.*");
			for(int num = 0; num < numTimeCases; num++)
				{
				int hour = 0;
				int minute = 0;
				int second = 0;
				
				String data = input.nextLine();
				
				Matcher matcher = secondRegex.matcher(data);
				if(matcher.matches())
					{
					second = Integer.parseInt(matcher.group(1));
					}
				}
			 
			 
			 
			 
			 
			}
		}
	}
