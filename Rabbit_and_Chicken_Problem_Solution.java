
/*
----------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------
	R = Rabbit | C = Chicken
	L = Legs   | H = Head
	
	Total Head = 15
	Total Legs = 50
	
	it means total,   R + C = 15 -------(1)
	and as we know R have 4 leg and C have 2 leg
	so, 4R + 2C = 50 ----------(2)
	
	so, for finding the value of the rabbit and chickens 1st we need to find the value of any one...
	so we will multiply by 2 in the (1) eq. 
	
	2R + 2C = 30 ----------(3)
	and now , we will subtract from (2) to (3)
	
	4R + 2C = 50 ---------(2)
	2R + 2C = 30 ---------(3)
	
	2R = 20 -----------(4)
	
	and here total Rabbit is , R = 10
----------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------


Lets solve.............!

----------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------ALGORITHEM---------------------------------------------------------------

C + R = HEAD ------------(1)
2C + 4R = LEGS ------------(2)

EQ.(1) MULTIPLY BY 2   ----------------

2C + 2R = 2HEAD ----------(3)

EQ.(2) - EQ.(3)

2R = LEGS - 2HEAD

R = (LEGS - 2HEAD)/2 ---------(4)     //HERE IS THE RABBIT VALUE

after that we are putting R's value in EQ. 1
            C + R = HEAD ------------(1)
            C + (LEGS - 2HEAD)/2 = HEAD
            C = HEAD - (LEGS - 2HEAD)/2
            C = (2HEAD - LEGS + 2HEAD)/2
            c = (4HEAD - LEGS)/2........ IT IS THE CORRECT LOGIC FOR THE CHICKEN .....
----------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------
LET'S START TO WRITE CODE......
*/


package Day2;

public class Rabbit_and_Chicken_Problem_Solution {

	public static void main(String[] args) {
				// TODO Auto-generated method stub


int H = 150;
int L = 500;
int C;

int R = (L - 2*H)/2;
	if(R!=0) 
	{
		System.out.println("hello");
		C = (4*H - L)/2;
		System.out.println("Total Head is:" + H + "\nLegs is:" + L + "\nAfter Calculation \nChicken is: " + C + " and total Rabbit is : " + R );
	}
	else
	{
		System.out.println("Enter correct value!");
	}
	}
}


//----------------------------------------------------------------------------------------------------------------------------
