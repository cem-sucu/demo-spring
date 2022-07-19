package springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class CoursAleatoire implements CoursService {
	
	private String[] coursDispos = {"Maths", "Economie", "Football"};

	@Override
	public String nommerCours() {	
		
		int random = new Random().nextInt(coursDispos.length);
		return coursDispos[random];
	}

}
