import java.io.*;
import java.util.*;
class GuessingGame {
 
Scanner s=new Scanner(System.in);
int n; 
int m=s.nextInt();  
public int answer;
   
public int min;
    
public int max;
 
public GuessingGame(int min, int max) {
  
guess();
	}

    public int guess() {
 

	

	 n=s.nextInt();
if(n>1 && n<100){

	if(n==m){
			System.out.println("Bingo!");

				System.exit(1);
		}
		
	else if(n<m){
			System.out.println("higher than"+"  "+n);

			higher();
		    }
	else
		{
			System.out.println("lower than"+n);
			lower();
		}	

       	}

 
else
{
System.out.println("enter between 1 and 100");
guess();
} return 0;

} 
 	public void lower() {
 guess();  
				}

  

 
 public void higher() {
 guess();
   
			}



public static void main(String a[])
{
GuessingGame game = new GuessingGame(0, 100);
game.guess();
}}