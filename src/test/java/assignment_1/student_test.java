package assignment_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class student_test {

	@Test
	public void test(){
			
		Student s = new Student ("Daniel", "27/07/1995", 20, 300124);
		assertEquals("Daniel20", Student.getUsername());
			System.out.println("Student are:" +Student.getUsername() );
		
		}

	
	}

