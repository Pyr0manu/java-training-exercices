package io.robusta.birthday.implementations;

public class BirthdayApplication {

    public static void main(String[] args) {

        GenerationThreshold generationThreshold = new GenerationThreshold();

        System.out.println(generationThreshold.calculateProbabilityOfSame(23));

        System.out.println(generationThreshold.findSmallestNumberOfPeopleRequiredToHave50());

    }

}
