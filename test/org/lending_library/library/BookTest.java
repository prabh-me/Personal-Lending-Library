package org.lending_library.library;

import junit.framework.TestCase;

public class BookTest extends TestCase {

	public void testBook()
	{
		Book b1=new Book("Great Expectations");
		assertEquals("Great Expectations",b1.title);
		assertEquals("unknown author",b1.author);
		
	}
	public void testGetPerson()
	{
		Book b2=new Book("War and Peace");
		Person p2=new Person();
		p2.setName("Elvis");
		b2.setPerson(p2); //method to say book is loaned to this person
		
//		Person testPerson= b2.getPerson();//get the name of the person who is loaned the book
//		String testName=testPerson.getName();
//		
		String testName=b2.getPerson().getName();

		assertEquals("Elvis",testName);
		
	}
	
	public void testToString()
	{
		Book b2=new Book("War and Peace");
		Person p2=new Person();
		p2.setName("Elvis");
		
		assertEquals("War and Peace by unknown author; Available",b2.toString());
		b2.setPerson(p2);
		
		assertEquals("War and Peace by unknown author; Checked out to Elvis",b2.toString());
	}
	
}
