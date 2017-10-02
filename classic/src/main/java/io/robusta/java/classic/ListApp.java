package io.robusta.java.classic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ListApp {

	List<Integer> buildList(int a, int b, int c) {
		LinkedList<Integer> liste = new LinkedList<>();
		Collections.addAll(liste, a, b, c);
		return liste;
	}

	ArrayList<Integer> buildList(int... numbers) {
		ArrayList<Integer> liste = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			liste.add(numbers[i]);
		}
		return liste;
	}

	boolean equality(List<Integer> list1, List<Integer> list2) {

		if (list1.size() != list2.size()) {
			return false;
		}
		for (int i = 0; i < list1.size(); i++) {
			if (! list1.get(i).equals(list2.get(i))) {
				return false;
			}
		}
		return true;
	}

	String asString(List<Integer> numbers) {
		return null;
	}

	int first(List<Integer> ints) {
		return ints.get(0);
	}

	int last(List<Integer> ints) {
		return ints.get(ints.size()-1);
	}

	int medium(List<Integer> ints) {
		return ints.get((ints.size()-1)/2);
	}
}
