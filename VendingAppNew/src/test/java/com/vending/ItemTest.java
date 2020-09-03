package com.vending;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;



public class ItemTest {

	@Test
	public void testSetStock() {
		
		Item it =new Item();
		assertNotNull("Please provide all the inputs",it.itemName);
		assertNotNull("Please provide all the inputs",it.price);
		assertNotNull("Please provide all the inputs",it.selectionID);
		assertNotNull("Please provide all the inputs",it.stockLevel);
	}

	@Test
	public void testStockAdjust() {
		fail("Not yet implemented");
	}

}
