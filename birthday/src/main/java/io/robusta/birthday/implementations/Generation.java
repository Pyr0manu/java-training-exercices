package io.robusta.birthday.implementations;

import io.robusta.birthday.interfaces.IGeneration;
import io.robusta.birthday.interfaces.IPeopleCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicolas Zozol on 04/10/2016.
 */
public class Generation implements IGeneration{

    List<PeopleCollection> collections;

    public Generation(){

    }

    public Generation(int n, int collectionSize) {
        this.collections = createAllRandom(n, collectionSize);
    }

    @Override
    public PeopleCollection createRandom(int size) {

        return new PeopleCollection(size);
    }

    @Override
    public List<PeopleCollection> createAllRandom(int n, int size) {
        List<PeopleCollection> peopleCollection = new ArrayList<>();
        for (int i = 0; i < n; i++){
            peopleCollection.add(this.createRandom(size));
        }
        return peopleCollection;
    }

    @Override
    public List<PeopleCollection> getPeopleCollections() {
        return collections;
    }

    @Override
    public int getNumberOfCollectionsThatHasTwoPeopleWithSameBirthday() {

        int compteur = 0;
        for (PeopleCollection peopleCollection : collections){
            if (peopleCollection.hasSame()){
               compteur++;
            }
        }
        return compteur;
    }

    @Override
    public boolean isLessThan50() {

        if (this.getNumberOfCollectionsThatHasTwoPeopleWithSameBirthday() < 50){
            return true;
        }
        return false;
    }


}
