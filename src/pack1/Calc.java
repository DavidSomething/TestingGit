package pack1;

public class Calc {

	
	public static int random() {
		return (int) (Math.random()*50+1);
	}
	
	public static String saluto () 
	{
		String ciao ="";
		int a = 10;
		if (a<10)
			ciao = "ciao!!";
		else
<<<<<<< HEAD
			ciao = "no!";

		System.out.println("due");
=======
			ciao = "niente!";
		System.out.println("uno");
>>>>>>> 2f2752a1e7d25b9b1e34bbc025d1f5427eeb5be5
		return ciao;
	}
	
	
}