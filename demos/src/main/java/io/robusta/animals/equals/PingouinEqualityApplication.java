package io.robusta.animals.equals;

import io.robusta.animals.Pingouin;

public class PingouinEqualityApplication {

	public static void main(String[] args) {

		PingouinEqualityApplication app = new PingouinEqualityApplication();
		app.launch();
		
	}
	
	public void launch(){
		Pingouin jack = new Pingouin("Jack");
		Pingouin john = new Pingouin("Jack");
		
		System.out.println(jack.equals(jack));
	}

}
