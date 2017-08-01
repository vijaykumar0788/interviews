package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"

*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
	
		public int hashCode() {
			//return id * generator.nextInt();
			
			return id;
		}
		
		public boolean equals(Object other) {
			
			if(other ==null)
				return false;
			
			if(!(other instanceof Person))
				return false;
			
			Person person = (Person)other;
			if(person.id == null || id == null)
				return false;
			
			return id.equals(person.id);
		}
	}
}