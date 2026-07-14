package esempioForString;

public class CicloFor {

	public static void main(String[] args) {
		//ciclo for con due String per contatori! 
		
		for(String i = "|", t =  "------"; i.length() < 7; i += "|", t = t.substring(1))
		{
			System.out.println(i + t);
		}
		
	}

}