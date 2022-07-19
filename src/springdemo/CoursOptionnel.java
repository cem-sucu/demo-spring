package springdemo;

import org.springframework.stereotype.Component;

@Component
public class CoursOptionnel implements CoursService {

	@Override
	public String nommerCours() {
		
		return "cours optionnel";
	}

}
