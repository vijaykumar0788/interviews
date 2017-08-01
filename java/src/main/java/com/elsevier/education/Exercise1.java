package com.elsevier.education;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**

TODO: Make this class immutable.

*/
public final class Exercise1 {
	
	 
	public Person getPerson(){
		return Exercise1.Person.person;
	}
	
	public static class Person {
		
		private static Person person;
		
		private final Set<String> phoneNumbers; 
		private final String firstName;
		private final String lastName;
		
		/*
		 * Make this constructor private to avoid unplanned object creation
		 */
		private Person(Set<String> phoneNumbers, String firstName, String lastName) {
			this.phoneNumbers = new HashSet<String>(phoneNumbers);
			this.firstName = firstName;
			this.lastName = lastName;
		}
		

		/* 
		 * createPerson method created to have 
		 * object creation logic in single place
		 */
		public static void createPerson(Set<String> phoneNumbers, String firstName, String lastName)
	    {
			if(person == null ){
				synchronized (Person.class) {
					if(person == null ){
						person = new Person(phoneNumbers, firstName, lastName);
					}
				}
			}
	    }
		
		public Set<String> getPhoneNumbers() {
			return Collections.unmodifiableSet(phoneNumbers);
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		/*
		 * AS part of making this class immutable 
		 * there should not be any setter method
		 * We can remove below commented methods 
		 */
		/*public void setPhoneNumbers(Set<String> newPhoneNumbers) {
			phoneNumbers = newPhoneNumbers;
		}
		
		public void setFirstName(String newName) {
			firstName = newName;
		}
		
		
		public void setLastName(String newName) {
			lastName = newName;
		}*/
	}
}