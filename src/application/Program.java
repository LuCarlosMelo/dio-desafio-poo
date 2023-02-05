package application;

import java.time.LocalDate;

import entities.Bootcamp;
import entities.Course;
import entities.Dev;
import entities.Mentoring;

public class Program {
	public static void main(String[] args) {

		Course curso1 = new Course();
		curso1.setTitle("Curso Java");
		curso1.setDescription("Descrição curso Java");
		curso1.setWorkload(8);

		Course curso2 = new Course("Curso js", "descrição curso JS", 4);

//		System.out.println(curso1);
//		System.out.println(curso2);

		Mentoring mentoring = new Mentoring();
		mentoring.setTitle("mentoria de Java");
		mentoring.setDescription("descrição de Java");
		mentoring.setDate(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Java Developer");
		bootcamp.setDescription("Descrição Bootcamp Java Developer");
		bootcamp.getContents().add(curso1);

		bootcamp.getContents().add(curso2);
		bootcamp.getContents().add(mentoring);

		
		
		Dev devCamila = new Dev();
		devCamila.setName("Camila");
		devCamila.registerBootcamp(bootcamp);
		System.out.println("Canteudos inscritos Camila: " + devCamila.getSubscribedContents());
		devCamila.progress();
		devCamila.progress();
		System.out.println("-");
		System.out.println("Canteudos inscritos Camila: " + devCamila.getSubscribedContents());
		System.out.println();
		System.out.println("Conteudos concluidos Camila + " + devCamila.getCouncludedContents());
		System.out.println("XP: " + devCamila.calculateTotalXp());
		
		System.out.println("----------------------");

		Dev devJoao = new Dev();
		devJoao.setName("João");
		devJoao.registerBootcamp(bootcamp);
		System.out.println("Canteudos inscritos João: " + devJoao.getSubscribedContents());
		devJoao.progress();
		devJoao.progress();
		devJoao.progress();
		System.out.println("-");
		System.out.println("Canteudos inscritos João: " + devJoao.getSubscribedContents());
		System.out.println();
		System.out.println("Conteudos concluidos João: " + devJoao.getCouncludedContents());
		System.out.println("XP: " + devJoao.calculateTotalXp());
	}
}
