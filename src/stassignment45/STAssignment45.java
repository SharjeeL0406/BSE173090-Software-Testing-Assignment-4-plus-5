/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stassignment45;

import java.util.Scanner;

/**
 *
 * @author USMAN
 */
public class STAssignment45 {

    public static String Licence(int age,int verbeltest,int theorytest,int parkingscore,int drivingskillsscore,int breakingtrafficlawsscore)
    
    {
    
	String ret="";
	boolean passed1=true;
	boolean passed2=true;
    
	//cretaria to apply
	
		//knowledge test
	if( age>=18 && verbeltest>80 && theorytest>86)
        {
			passed1=true;//passed
		}
        else
        {
            passed1=false;
        }
	
	
	//driving test
	if(parkingscore>=80 && drivingskillsscore>80 && breakingtrafficlawsscore<15)
		{
			passed2=true;//passed
		}
        else
        {
            passed2=false;
        }
        if(passed1==true && passed2==true)
        { 
           ret= "You have passed the TEST";
        }
        else
        {
           ret = "TestFailed";
        }
        return ret;
        
    }
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     boolean check=true;
      int age;
     int verbeltest;
     int theorytest;
     int parkingscore;
     int drivingskillsscore;
    int breakingtrafficlawsscore;
    age=input.nextInt();
    verbeltest=input.nextInt();
    theorytest=input.nextInt();
    parkingscore=input.nextInt();
    drivingskillsscore=input.nextInt();
    breakingtrafficlawsscore=input.nextInt();
    String value= Licence(age,verbeltest,theorytest,parkingscore,drivingskillsscore,breakingtrafficlawsscore);
    if(value=="You have passed the TEST")
    {
        check=true;
    }
    else
    {
        check=false;
    }
    if(check==true)
    {
        System.out.println("You have Earned a Licence");
    }
    else
    {
      System.out.println("You HAVE FAILED YOUR TEST");  
    }
    }
}

    /**
     * @param args the command line arguments
     */
    
    
    
    

