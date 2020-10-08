package AssignmentSeven;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

	@Test
	public void testIntegerMaximumAtFirstPosition() {
		Integer maximum=UserMaximum.findMaximum(23, 12, 15);
		boolean flag;
		if(maximum.equals(23))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testIntegerMaximumAtSecondPosition() {
		Integer maximum=UserMaximum.findMaximum(10, 20, 15);
		boolean flag;
		if(maximum.equals(20))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testIntegerMaximumAtThirdPosition() {
		Integer maximum=UserMaximum.findMaximum(23, 12, 40);
		boolean flag;
		if(maximum.equals(40))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testFloatMaximumAtFirstPosition() {
		Float maximum=UserMaximum.findMaximum(23.2f, 12.4f, 15.6f);
		boolean flag;
		if(maximum.equals(23.2f))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testFloatMaximumAtSecondPosition() {
		Float maximum=UserMaximum.findMaximum(12.5f,29.6f,9.8f);
		boolean flag;
		if(maximum.equals(29.6f))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testFloatMaximumAtThirdPosition() {
		Float maximum=UserMaximum.findMaximum(14.5f,9.2f,15.1f);
		boolean flag;
		if(maximum.equals(15.1f))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testStringMaximumAtFirstPosition() {
		String maximum = UserMaximum.findMaximum("Pineapple", "Peach", "Banana");
		boolean flag;
		if (maximum.equals("Pineapple"))
			flag = true;
		else
			flag = false;
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testStringMaximumAtSecondPosition() {
		String maximum = UserMaximum.findMaximum("Apple", "Peach", "Banana");
		boolean flag;
		if (maximum.equals("Peach"))
			flag = true;
		else
			flag = false;
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testStringMaximumAtThirdPosition() {
		String maximum = UserMaximum.findMaximum("Apple", "Banana", "Peach");
		boolean flag;
		if (maximum.equals("Peach"))
			flag = true;
		else
			flag = false;
		Assert.assertEquals(true, flag);
	}
}
