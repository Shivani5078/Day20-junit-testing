package com.javaRegex;

import org.junit.Assert;
import org.junit.Test;

public class Testcase {

	//test case for valid e-mail id
	
	@Test
	public  void When_AttheRate_DotPresent_ReturnTrue() {
		Assert.assertTrue(UC9_Email.EmailidValidation("abc@bridgelabz.co.in"));
				
				
	}
	@Test
	public  void Whentwotimedotispresent_ReturnTrue() {
		Assert.assertTrue(UC9_Email.EmailidValidation("abc@gmail.com.com"));

	}
	@Test
	public void whengamilisabsent_ReturnTrue() {
		Assert.assertTrue(UC9_Email.EmailidValidation("abc@yahoo.com"));
	}
	@Test
	public  void whengamilisnotpresent_ReturnTrue() {
		Assert.assertTrue(UC9_Email.EmailidValidation("abc@1.com"));
	}
	@Test
	public void whenNumberispresnt_ReturnTrue() {
		Assert.assertTrue(UC9_Email.EmailidValidation("abc-100@yahoo.com"));	
	}
    @Test
    public void wheningmaildotisfristlypresent_ReturnTrue() {
    	Assert.assertTrue(UC9_Email.EmailidValidation("abc.100@yahoo.com"));	
    }
    @Test
    public void whentwotimenameispresntintheemail_ReturnTrue() {
    	Assert.assertTrue(UC9_Email.EmailidValidation("abc111@abc.com"));	
    	
    }
    @Test
    public void whenComisnotPresentintheemail_ReturnTrue() {
    	Assert.assertTrue(UC9_Email.EmailidValidation("abc-100@abc.net"));	
    }
    @Test
    public void whenTwoDotisPresentAnsnualso_ReturnTrue() {
    	Assert.assertTrue(UC9_Email.EmailidValidation("abc.100@abc.com.au"));		
    }
    @Test
    public void whenArithmaeticOpertorisPresntinEmail_ReturnTrue() {
    	Assert.assertTrue(UC9_Email.EmailidValidation("abc+100@gmail.com"));	
    }
    ///test case for Invalid Email
    @Test
    public void whenTwoTimeDotisPrsentAndalsoName_Returnflase() {
    	Assert.assertFalse(UC9_Email.EmailidValidation(".abc@abc.com"));
    }
    @Test
    public void WhenAtTheRateisAbsentAndDotalsoAbsent_Returnflase() {
    	Assert.assertFalse(UC9_Email.EmailidValidation("abc"));
    	
    }
    @Test
    public void WhenTwoTimeDotisPresent_Returnflase() {
    	Assert.assertFalse(UC9_Email.EmailidValidation("abc@.com.my"));
    }
    @Test
    public void whenTwotimeNameAndAtTheRateisPrsent_Returnflase() {
    	Assert.assertFalse(UC9_Email.EmailidValidation("abc@abc@gmail.com"));	
    }
    @Test
    public void WhenAtTheRateisAbsentAndStarispresent_Returnflase() {
    	Assert.assertFalse(UC9_Email.EmailidValidation("abc()*@gmail.com"));	
    }
    @Test
    public void WhenDotisPresentAndnumberalso_Returnflase() {
    	Assert.assertFalse(UC9_Email.EmailidValidation("abc..2002@gmail.com"));	
    }
    @Test
    public void WhenTwoTimeDotisPresentintheemail_Returnflase() {
    	Assert.assertFalse(UC9_Email.EmailidValidation("abc.@gmail.com"));	
    }
    @Test
    public void whenNumberispersent_Returnflase() {
    	Assert.assertFalse(UC9_Email.EmailidValidation("abc123@.com"));	
    }
    @Test
    public void whenTwoTimeDotComispresent_Returnflase() {
    	Assert.assertFalse(UC9_Email.EmailidValidation("abc123@.com.com"));		
    }
    @Test
    public void whenInEmailLetterisPresent_Returnflase() {
    	Assert.assertFalse(UC9_Email.EmailidValidation("abc123@gmail.a"));			
    }
   @Test
   public void InEmailpercentageAndstarIsPresent_Returnflase() {
		Assert.assertFalse(UC9_Email.EmailidValidation("abc@%*.com"));		   
   }
   @Test
   public void whenNumberAndletterArePresntInEmail_Returnflase() {
		Assert.assertFalse(UC9_Email.EmailidValidation("abc@gmail.com.1a"));	 
   }
   @Test
   public void whenaaauispresent_Returnflase() {
	   Assert.assertFalse(UC9_Email.EmailidValidation("abc@gmail.com.aa.au"));	 
   
   }
}




