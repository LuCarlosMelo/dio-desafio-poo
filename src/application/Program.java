package application;

import entities.Course;
import entities.Mentoring;

public class Program {
	public static void main(String[] args) {
		Course curso1 = new Course();
		curso1.setTitle("Curso Java");
		curso1.setDescription("Descri��o curso Java");
		curso1.setWorkload(8);
		
		Course curso2 = new Course("Curso js", "descri��o curso JS", 4);
		
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		Mentoring mentoria = new Mentoring();
		mentoria.
		
	}
}
