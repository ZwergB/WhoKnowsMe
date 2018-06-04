package main;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import internal.Portal;

public class PortalTest {

	@Test
	public void getWebsideTitleTest() throws Exception {
		String title = Portal.getWebsitesTitle("https://example.com/");
		System.out.println(title);
		assertTrue(title.equals("Example Domain"));
	}

}