package io.robusta.animals.types;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import io.robusta.animals.Pingouin;

public class SetApplication {

	public static void main(String[] args) {

			SetApplication app = new SetApplication();
			app.init();
		
	}
	
	public void init(){
		
		Pingouin kowalsky = new Pingouin("Kowalsky");
        Pingouin ricoh = new Pingouin("Ricoh");
        Pingouin soldat = new Pingouin("Soldat");
        Pingouin commandant = new Pingouin("Commandant");
        Pingouin tux = new Pingouin("Tux");
		
		HashSet<Pingouin> set = new HashSet<>();
		
		set.add(tux);
		set.add(ricoh);
		set.add(commandant);
		
		System.out.println(set.size());
		set.add(ricoh);
		System.out.println(set.size());
		
		Pingouin imposteur = new Pingouin("Ricoh");
		set.add(imposteur);
		System.out.println(set.size());
		System.out.println(set);
		
		set.add(soldat);
		set.add(kowalsky);
		System.out.println(set);
		
		Iterator<Pingouin> iterator = set.iterator();
		
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		
		//Let's start again
		iterator = set.iterator();
		while (iterator.hasNext()){
			Pingouin current = iterator.next();
			System.out.println(current);
		}
		
		System.out.println("======== more pretty ========");
		for (Pingouin current : set){
			System.out.println(current);
		}
		
	}

}
