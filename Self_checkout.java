/**
 * @author  1-ABDERRAHMANE BENFATAH 2- OMAR RAMADHAN
 * @ID      1-444106928             2-444106902
 * @PROGRAM This project involves developing a self-checkout software for a retail store to enhance its 
customers' shopping experience. The software enables customers to independently select items, 
specify quantities, and complete their purchases

*@DATE 15/03/2024 
 */


import java.util.Scanner;

public class Self_checkout {

	public static void main(String[] args) {
			Scanner input = new Scanner(System .in);
			double totalCost1 = 0;
//			all the variables in this program
			 int quantityOfcheckenInstore = 50;           final double priceOfchecken = 20;
			 int quantityOfeggsInstore = 50;              final double priceOfeggs = 17;
			int quantityOfcheeseInstore = 30;             final double priceOfcheese = 15;
			 int quantityOfriceInstore = 30;              final double priceOfrice = 50;
			int quantityOfbreadInstore = 100;             final double priceOfbread = 1.5;
			 int quantityOfjuiceInstore = 250;            final double priceOfjuice = 3;
			int userquantityOfchecken = 0,userquantityOfeggs = 0, userquantityOfcheese=0, userquantityOfrice=0, userquantityOfbread=0,
			userquantityOfjuice=0;
			double totalCostOfchecken=0, totalCostOfeggs=0, totalCostOfcheese=0, totalCostOfrice=0,
			 totalCostOfbread=0, totalCostOfjuice=0;
			int lastuserquantityOfchecken=0,lastuserquantityOfeggs=0,lastuserquantityOfcheese=0,lastuserquantityOfrice=0,
					lastuserquantityOfbread=0,lastuserquantityOfjuice=0;
			String item;
			int mostPopularproduct=0;
			int quantity;
			double totalCost = 0;
			boolean selectedChecken = false,selectedEggs= false,selectedCheese= false,selectedRice= false
					,selectedBread= false,selectedJuice= false;
			
			// User Interface a friendly welcome message
			
			System.out.println("Hello user:) You are in our store and you have two choises : \n 1-customer. 2-store owner. 3-exit.");
			String checkConfirmation,mostPopularitemname;
			String choice = input.next();
			
			while(!(choice.equalsIgnoreCase("exit"))){
			
			if (choice.equalsIgnoreCase("customer")){
				// Customer Self-Checkout Menu:
				System.out.println(" this is the list of the available products in our store :");
				
			System.out.println("**********************************************************************");
				System.out.println("* Welcome to our supermarket Center :)                           *");
				System.out.println("* ---------------------------                                    *");
				System.out.println("* item number    name                quantity           price    *");
				System.out.println("* 1)            Checken.              50                20       *");
				System.out.println("* 2)            egges.                50                17       *");
				System.out.println("* 3)            cheese.               30                15       *");
				System.out.println("* 4)            rice.                 30                50       *");
				System.out.println("* 5)            bread.                100               1.5      *");
				System.out.println("* 6)            juice.                250               3        *");
				System.out.println("* checkout (to see the bill)                                     *");
				System.out.println("*                                                                *");
				System.out.println("******************************************************************");
				
	
				do {
					System.out.print("Enter the items: ");
					item = input.next();
					input.nextLine();
				
					if (item.equalsIgnoreCase("checken")) {
						System.out.print("enter the quantity :");
						userquantityOfchecken =input.nextInt();
						
						if (quantityOfcheckenInstore<userquantityOfchecken) {
							System.out.println("Out of stock: ");
							userquantityOfchecken= lastuserquantityOfchecken;
							}
						else  {
							quantityOfcheckenInstore -= userquantityOfchecken;
							  lastuserquantityOfchecken=userquantityOfchecken;
							selectedChecken = true;
							totalCostOfchecken = totalCostOfchecken+(userquantityOfchecken *priceOfchecken);
						}
						
					}
					else if(item.equalsIgnoreCase("eggs")) {
						
						System.out.print("enter the quantity :");
						
						userquantityOfeggs =input.nextInt();
						
						if (quantityOfeggsInstore<userquantityOfeggs) {
							System.out.print("Out of stock: ");
						userquantityOfeggs= lastuserquantityOfeggs;
						}
						else {
							quantityOfeggsInstore -=userquantityOfeggs;
							lastuserquantityOfeggs=userquantityOfeggs;
							selectedEggs=true;
							totalCostOfeggs = totalCostOfeggs+(userquantityOfeggs *priceOfeggs);
						}
						
					}
					else if(item.equalsIgnoreCase("cheese")) {
						System.out.print("enter the quantity :");
						userquantityOfcheese =input.nextInt();
						
						if (quantityOfcheeseInstore<userquantityOfcheese) {
							System.out.print("Out of stock: ");
						userquantityOfcheese= lastuserquantityOfcheese;
						}
						else {
							quantityOfcheeseInstore-=userquantityOfcheese;
							lastuserquantityOfcheese=userquantityOfcheese;
							selectedCheese= true;
							totalCostOfcheese = userquantityOfcheese *priceOfcheese;
						}
						
					}
					else if(item.equalsIgnoreCase("rice")) {
						System.out.print("enter the quantity :");
						userquantityOfrice =input.nextInt();
						
						if (quantityOfriceInstore<userquantityOfrice) {
							System.out.print("Out of stock: ");
						userquantityOfrice= lastuserquantityOfrice;
						}
						else  {
							quantityOfriceInstore-=userquantityOfrice;
							lastuserquantityOfrice=userquantityOfrice;
							selectedRice=true;
							totalCostOfrice = userquantityOfrice *priceOfrice;
						}
						
					}
					else if(item.equalsIgnoreCase("bread")) {
						System.out.print("enter the quantity :");
						userquantityOfbread =input.nextInt();
						
						if (quantityOfbreadInstore<userquantityOfbread) {
							System.out.print("Out of stock: ");
							userquantityOfbread= lastuserquantityOfbread;
						}
						
						else  {
							quantityOfbreadInstore -= userquantityOfbread;
							lastuserquantityOfbread = userquantityOfbread;
							selectedBread=true;
							totalCostOfbread = userquantityOfbread *priceOfbread;
						}
						
					}
					else if(item.equalsIgnoreCase("juice")) {
						System.out.print("enter the quantity :");
						userquantityOfjuice =input.nextInt();
						
						if (quantityOfjuiceInstore<userquantityOfjuice) {
							System.out.print("Out of stock: ");
							userquantityOfjuice = lastuserquantityOfjuice;
						}
						else  {
							quantityOfjuiceInstore-= userquantityOfjuice;
							lastuserquantityOfjuice = userquantityOfjuice;
							selectedJuice=true;
							totalCostOfjuice = userquantityOfjuice *priceOfjuice;
								}		
					}
					
				}while (!(item.equalsIgnoreCase("checkout")));
				System.out.println();
				
				// The invoice
				System.out.println("This is the bill for your purchases");
				if (selectedChecken)System.out.println("checken  "+userquantityOfchecken+"  "+totalCostOfchecken);
				if (selectedEggs)System.out.println("eggs  "+userquantityOfeggs+ "  "+totalCostOfeggs);
				if (selectedCheese)System.out.println("cheese  "+userquantityOfcheese+"  "+totalCostOfcheese);
				if (selectedRice)System.out.println("rice  "+userquantityOfrice+"  "+totalCostOfrice);
				if (selectedBread)System.out.println("bread  "+userquantityOfbread+"  "+totalCostOfbread);
				if (selectedJuice)System.out.println("juice  "+userquantityOfjuice+"  "+totalCostOfjuice);
				 totalCost1 = totalCostOfchecken+totalCostOfeggs+totalCostOfcheese+totalCostOfrice+totalCostOfbread+totalCostOfjuice;
				
				System.out.println("Your total cost is: "+totalCost1);
				System.out.println();
				
				
				System.out.println("Do you want to confirm your purchases or cancel the process? \n"
				+"1- yes for confirming the process\n 2- Cancel for ending the process");
				checkConfirmation = input.nextLine();
				if (checkConfirmation.equalsIgnoreCase("yes")) {
					System.out.println("thank you ");
					
					//canceling
				}else if (checkConfirmation.equalsIgnoreCase("cancel")) {
					System.out.println("no problem"+ ":|");
					 quantityOfcheckenInstore = 50;      
					 quantityOfeggsInstore = 50;            
					 quantityOfcheeseInstore = 30;             
					 quantityOfriceInstore = 30;         
					 quantityOfbreadInstore = 100;        
					 quantityOfjuiceInstore = 250; 
					 
					selectedChecken = false;selectedEggs= false;selectedCheese= false;selectedRice= false
								;selectedBread= false;selectedJuice= false;
								
					totalCost = 0;
					userquantityOfchecken = 0;userquantityOfeggs = 0; userquantityOfcheese=0; userquantityOfrice=0; userquantityOfbread=0;
										userquantityOfjuice=0;
					totalCostOfchecken=0; totalCostOfeggs=0; totalCostOfcheese=0; totalCostOfrice=0;
										 totalCostOfbread=0; totalCostOfjuice=0;
					lastuserquantityOfchecken=0;lastuserquantityOfeggs=0;lastuserquantityOfcheese=0;lastuserquantityOfrice=0;
												lastuserquantityOfbread=0;lastuserquantityOfjuice=0;
												
				}				
				else System.out.println("incorrect input :(");	
			}
			
			else if (choice.equalsIgnoreCase("owner")){ 
				//Store Owner Menu
				System.out.println("Your Total Profit Is : "+totalCost1);
				//most popular item
				mostPopularproduct=userquantityOfbread;
				
				if (userquantityOfchecken>mostPopularproduct) {
				           mostPopularproduct=userquantityOfchecken;System.out.println("the most popular item is checken with quantity"+mostPopularproduct);}
			           	else if(userquantityOfcheese>mostPopularproduct) {
			       		mostPopularproduct=userquantityOfcheese;System.out.println("the most popular item is cheese with quantity"+mostPopularproduct);}
			           	else if(userquantityOfeggs>mostPopularproduct) {
				    	mostPopularproduct=userquantityOfeggs;System.out.println("the most popular item is eggs with quantity"+mostPopularproduct);}
				      else if (userquantityOfjuice>mostPopularproduct) {
				      	mostPopularproduct=userquantityOfjuice;System.out.println("the most popular item is juise with quantity"+mostPopularproduct);}
				       else if (userquantityOfrice>mostPopularproduct) { mostPopularproduct=userquantityOfrice;System.out.println("the most popular item is rice with quantity"+mostPopularproduct);}
				       else {System.out.println("the most popular item is bread with quantity"+mostPopularproduct);}
			
			}
			else {
				System.out.println("incorrect choice please choose betwen the two choise ");
			System.exit(0);	}
			System.out.println("Hello user:) You are in our store and you have two choises : \n 1-customer. 2-store owner. 3-exit.");
			 choice = input.next();			
	}		
	System.out.println("you are out of our system");		
}
}
