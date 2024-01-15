package EX2;


public class App 
{
	 public static String numberToChar (int number) {
  	   if ((number <=59)& (number>=50)) {
  		   return "e";
  	   }
  	   else if ((number <=69)& (number>=60)) {
  		   return "d";
  	   }
  	   else if ((number <=79)& (number>=70)) {
  		   return "c";
  	   }
  	   else if ((number <=89)& (number>=80)) {
  		   return "b";
  	   }
  	   else if ((number <=99)& (number>=100)) {
  		   return "f";
  	   }
  	   else if ((number <=49)& (number>=1)) {
  		   return "f";
  	   }
  	   else {
  		   return "error";
  	   }
  	   
     }
}
