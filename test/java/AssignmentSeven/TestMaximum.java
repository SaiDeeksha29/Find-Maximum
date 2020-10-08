package AssignmentSeven;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

	@Test
	public void testMaximumAtFirstPosition() {
		Integer maximum=UserMaximum.findMaximum(23, 12, 15);
		boolean flag;
		if(maximum.equals(23))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testMaximumAtSecondPosition() {
		Integer maximum=UserMaximum.findMaximum(10, 20, 15);
		boolean flag;
		if(maximum.equals(20))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testMaximumAtThirdPosition() {
		Integer maximum=UserMaximum.findMaximum(23, 12, 40);
		boolean flag;
		if(maximum.equals(40))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
}
