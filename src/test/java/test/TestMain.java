package test;

import org.junit.Assert;
import org.junit.Test;

import cobertura.Main;

public class TestMain {
	
	@Test
	public void testPrintHelloWorld() {

		Assert.assertEquals(Main.getHelloWorld(), "Hello World");

	}

	@Test
	public void testPrintHelloWorld1() {

		Main m = new Main();
		m.FFoo(1, 2, 3);

	}

}
