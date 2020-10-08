package AssignmentSeven;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

	@Test
	public void testMaximumAtFirstPosition() {
		Float maximum=UserMaximum.findMaximum(23.2f, 12.4f, 15.6f);
		boolean flag;
		if(maximum.equals(23.2f))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testMaximumAtSecondPosition() {
		Float maximum=UserMaximum.findMaximum(12.5f,29.6f,9.8f);
		boolean flag;
		if(maximum.equals(29.6f))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testMaximumAtThirdPosition() {
		Float maximum=UserMaximum.findMaximum(14.5f,9.2f,15.1f);
		boolean flag;
		if(maximum.equals(15.1f))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
}
