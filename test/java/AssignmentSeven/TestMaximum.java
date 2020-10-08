package AssignmentSeven;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

	@Test
	public void testMaximumAtFirstPosition() {
		String maximum = UserMaximum.findMaximum("Pineapple", "Peach", "Banana");
		boolean flag;
		if (maximum.equals("Pineapple"))
			flag = true;
		else
			flag = false;
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testMaximumAtSecondPosition() {
		String maximum = UserMaximum.findMaximum("Apple", "Peach", "Banana");
		boolean flag;
		if (maximum.equals("Peach"))
			flag = true;
		else
			flag = false;
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testMaximumAtThirdPosition() {
		String maximum = UserMaximum.findMaximum("Apple", "Banana", "Peach");
		boolean flag;
		if (maximum.equals("Peach"))
			flag = true;
		else
			flag = false;
		Assert.assertEquals(true, flag);
	}
}
