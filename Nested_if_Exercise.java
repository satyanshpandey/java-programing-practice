package Day2;

public class Nested_if_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String city = "kanpur , Prayagraj , Patna ,  Meerut , Mysore";
		
		if(city.endsWith("Mysore")) //This line check ending point with given City name, And this is our 1st loop
		{
			if(city.contains("Allahabad")) //This is loop under loop is called Nested loop;
			{
				System.out.println("Your city is Allahabad");
			}
			else if(city.startsWith("kanpur"))// startsWith , it will check if given city name index start with given name
			{
				System.out.println("Your City is Kanpur");
			}
			else
			{
				System.out.println(city.split(", ")[1]);
			}	
		}
		else  //This is final else clause
		{
			System.out.println("You are not living in India!");
		}
	}
}
