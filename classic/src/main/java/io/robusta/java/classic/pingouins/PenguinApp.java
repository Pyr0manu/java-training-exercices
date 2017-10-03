package io.robusta.java.classic.pingouins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.crypto.spec.SecretKeySpec;

/**
 * Created by nicorama on 28/09/2017.
 */
public class PenguinApp {


    Penguin createSimplePenguin(){
        Penguin pingu = new Penguin("Pingu");
        return pingu;
    }


    List<Penguin> getPenguins(Penguin p1, Penguin p2, Penguin p3, Penguin p4, Penguin p5){
    	ArrayList<Penguin> listePingouins = new ArrayList<>();
    	Collections.addAll(listePingouins, p1, p2, p3, p4, p5);
    	ArrayList<Penguin> result = new ArrayList<>();
    	for (Penguin pingouin : listePingouins){
    		if (pingouin != null){
    			result.add(pingouin);
    		}
    	}
    	return result;
    	
    }

    Penguin getPenguinByName(Penguin[] pingouins, String name){
    	for (Penguin pingouin : pingouins){
    		if (pingouin.getName() == name){
    			return pingouin;
    		}
    	}
    	return null;
    }


    Penguin getFastest(List<Penguin> penguins){
        Penguin fastestPenguin = createSimplePenguin();
        fastestPenguin.setSpeed(Integer.MIN_VALUE);
        for (Penguin pingouin : penguins){
        	if (pingouin.getSpeed() > fastestPenguin.getSpeed()){
        		fastestPenguin = pingouin;
        	}
        }
        return fastestPenguin;
    }

    Penguin getFriend(Penguin penguin){
    	return penguin.getFriend();
    }

    List<Penguin> getPenguinsWithLetter(    Penguin[] pengouins, String letters){
    	ArrayList<Penguin> pingouins = new ArrayList<>();
    	for (Penguin pingouin : pengouins){
    		if (pingouin.getName().toLowerCase().contains(letters.toLowerCase())){
    			pingouins.add(pingouin);
    		}
    	}
    	
        return pingouins;
    }

    Penguin[] getPenguinsWithLetter(    List<Penguin> pengouins, String letters){
    	int index = 0;
    	Penguin[] tableau = new Penguin[0];
    	for (Penguin pingouin : pengouins){
    		if (pingouin.getName().toLowerCase().contains(letters.toLowerCase())){
    			Penguin[] nouveauTableau = new Penguin[index+1];
    			System.arraycopy(tableau, 0, nouveauTableau, 0, index);
    			tableau = nouveauTableau;
    			tableau[index]=pingouin;
    			index++;
    		}
    	}
        return tableau;
    }


    Object getSmallestSize(Penguin[] array, List<Penguin> list){
    	if (list.size() < array.length) {
    		return list;
		} else if(array.length < list.size()){
    		return array;
		}
		return null;
    }





    List<Penguin> getFriends(Penguin[] penguins){
        return null;
    }




}
