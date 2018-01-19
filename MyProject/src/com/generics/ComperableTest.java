package com.generics;

import java.util.Arrays;

public class ComperableTest {

	public static void main(String[] args) {
		Student []students = { new Student("cs011", "Lennon ", 3.1),
				new Student("cs021", "McCartney", 3.4),
				new Student("cs012", "Harrison ", 2.7),
				new Student("cs022", "Starr ", 3.7) };
		
				System.out.println("Before sorting by student ID");
				System.out.println("Student-ID \t Name \t CGPA (for 4.0) ");
				System.out.println(Arrays.toString(students));
				
				/*System.out.println("After sorting by student ID");
				Arrays.sort(students); call the default compareTo() of the Student Class*/
				Arrays.sort(students, new CGPAComparator());
				
				System.out.println("After sorting by student's CGPA");
				System.out.println("Student-ID \t Name \t CGPA (for 4.0) ");
				System.out.println(Arrays.toString(students));

	}

}