package EX2;


import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
	
	 public void ex_1_min_c()
	    {
	       String res=App.numberToChar(70) ;
	       String ex="c";
	       Assert.assertEquals(ex, res);
	    }
	    
	    
	    public void ex_1_min1_c()
	    {
	       String res=App.numberToChar(71) ;
	       String ex="c";
	       Assert.assertEquals(ex, res);
	    }
	    
	    
	    public void ex_1_nom_c()
	    {
	       String res=App.numberToChar(75) ;
	       String ex="c";
	       Assert.assertEquals(ex, res);
	    }
	    
	    
	    public void ex_1_max_c()
	    {
	       String res=App.numberToChar(79) ;
	       String ex="c";
	       Assert.assertEquals(ex, res);
	    }
	    
	    
	    public void ex_1_max1_c()
	    {
	        String res=App.numberToChar(78) ;
	        String ex="c";
	        Assert.assertEquals(ex, res);
	     }
	    
}
