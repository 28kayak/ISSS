import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InternationalPerson ip1 = new InternationalPerson("kaya", "Japan" , "650-444-444", "san jose", "F",  4, "053117" );
		
		System.out.println(ip1.getName());
		InternationalPerson[] interPeople = new InternationalPerson[100];
		
		
		Scanner scan = new Scanner(System.in);//for int
		Scanner scan1 = new Scanner(System.in);
		boolean flag = true;
		int choice = 0;
		int maxNum = 0;
		int id =0;
		while(flag)
		{
			System.out.println("What do you want to do?");
			System.out.println("1: add person");
			//System.out.println("2: add student");
			System.out.println("2: remove person");
			System.out.println("4: check visa status");
			System.out.println("5: quit");
			choice = scan.nextInt();
			switch(choice)
			{
				case 1://add person
					System.out.println("Enter info:");
					System.out.println("Enter name:");
					String name = scan1.nextLine();
					System.out.println("Enter your ineternational address:");
					String intAdder = scan1.nextLine();
					System.out.println("Enter tell num:");
					String telnum = scan1.nextLine();
					System.out.println("Enter Us address:");
					String usAddr = scan1.nextLine();
					System.out.println("Enter your visatype");
					String visatype = scan1.nextLine();
					System.out.println("Enter visa period:");
					int vperiod = scan.nextInt();
					System.out.println("Enter visa expairation:");
					String visaExp = scan1.nextLine();
					id = id + 1;
					if(visatype.equalsIgnoreCase("J"))
					{
						//*** Part 1 **/
						Prof newProf = new Prof(id, name, intAdder, telnum, usAddr, visatype, vperiod, visaExp);
						if(maxNum >= interPeople.length)
						{
							System.out.println("list is full");
							System.out.println("maxNum = "+ maxNum);
							
						}
						else
						{	
							interPeople[maxNum] = newProf;
							System.out.println(interPeople[maxNum].getName());
							System.out.println(interPeople[maxNum].getIntr_addr());
							System.out.println(interPeople[maxNum].getTellNum());
							System.out.println(interPeople[maxNum].getUsAddr());
							System.out.println(interPeople[maxNum].getVisatype());
							System.out.println(interPeople[maxNum].getVisaExp());
						}
					}//if(j)
					else if(visatype.equalsIgnoreCase("F"))
					{
						//Do the same thing with part 1
						//but use Student constructor
					}
					else if(visatype.equalsIgnoreCase("H"))
					{
						//Do the same thing with part 1 
						//but use International People constructor
					}
					break;
				case 2://remove
					
					
				case 3://
				case 4: //
					
			
			
			
			}
			
			
			
		}
		
		
		
		
		
		

	}

}
