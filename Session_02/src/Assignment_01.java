import java.util.Scanner;

public class Assignment_01 {

	public static void main(String[] args) {

        /*It said to allow user input so I had to search
         * This is what is used to get user input
         */
		Scanner userInput = new Scanner(System.in);
		
		
        //Asking the user their age
         
		System.out.println("Please enter your age");
		
		//initializing age to accept user input
		int age = userInput.nextInt();
		
		/* The if else conditional statement is used
         * to determine whether the user is old enough to vote
         * or if they are to young.
         */
		
		if(age >= 18){
			System.out.println("You can vote!");
		}
		else{
			System.out.println("You can not vote!");
		}
		
	}

}
