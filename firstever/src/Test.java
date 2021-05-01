import java.util.Scanner;
public class Test {
	
	public static void main (String[] args) {
		
	    Scanner scan=new Scanner(System.in);
		System.out.print("Do you want to know a little about my family? Type 1 for Yes or any other integer for No: ");
		
		if(scan.nextInt()==1) {
			scan.nextLine();
		System.out.print("Please enter an age (integer): ");
		while(!scan.hasNextInt()) {
			scan.nextLine();
		
			System.out.print("Please enter an age (an integer), correctly: ");
		}
		
		int value=scan.nextInt();
		scan.close();
			
		Universe a[]=new Universe[4];
		a[0]=new Universe("Elizete", 65, "Aries");
		a[1]=new Universe("Carlos", 62, "Capricorn");
		a[2]=new Universe("Lucas", 28, "Scorpio");
		a[3]=new Universe ("Pedro", 27, "Aries");
		int cont=0;
		int j=0;
		
		//to practice more arrays
		String [] who= new String[4];
		String [] zod= new String[4];
		int [] ag =new int[4];
		
		for(int i=0; i<4; i++) {
		if(a[i].holenAge()<value) {
			cont++;
			who[j]=a[i].holenName();
			zod[j]=a[i].holenSign();
			ag[j]=a[i].holenAge();
			j++;
				}
		}
		
		if(cont!=0) {
			System.out.println("Total of people under the age of "+value+": "+cont);
			
			for(int k=0; k<j; k++) {
				System.out.println("Name: "+who[k]+" ; Age:"+ag[k]+ " ; Sign: "+zod[k]);
			}
		}
		else
			System.out.print("No one in my family is under the age of "+value+"!");
		}
		
	
	
	else 
		System.out.print("Okay, bye then! :)");
	
	}
}
	

	
	
		
	
