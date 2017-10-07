package io.robusta.birthday.implementations;

import io.robusta.birthday.interfaces.IGenerationThreshold;
import io.robusta.birthday.interfaces.IPeopleCollection;

import java.util.ArrayList;

/**
 * Created by Nicolas Zozol on 04/10/2016.
 */
public class GenerationThreshold implements IGenerationThreshold{


    public GenerationThreshold() {



    }


    @Override
    public int getSmallNumber() {
        return 0;
    }

    @Override
    public int getBigNumber() {
        return 0;
    }

    @Override
    public int findSmallestNumberOfPeopleRequiredToHave50() {

        float probability = 0;
        int size = 0;
        while (probability < 50){
            size++;
            probability = calculateProbabilityOfSame(size);
        }
        return size;
    }


	@Override
	public float calculateProbabilityOfSame(int size) {
		float probability;
		int nombreTest = 10000;
		Generation generation = new Generation(nombreTest, size);
		probability = generation.getNumberOfCollectionsThatHasTwoPeopleWithSameBirthday()/(nombreTest/100);

		return probability;
	}
}
