package io.robusta.java.classic;

import java.util.*;
import java.util.Map.Entry;

/**
 *
 * Map : We add entry with map.put(key, val) We read value with map.get(key) We
 * read keys with map.keySet() We read values with map.values() We read entries
 * with map.entrySet()
 *
 *
 */
public class MapApp {

	Map<Integer, String> buildMap(int key1, String val1, int key2, String val2) {
		HashMap<Integer, String> result = new HashMap<>();
		result.put(key1, val1);
		result.put(key2, val2);
		return result;
	}

	Map<Integer, String> buildMap(int[] keys, String[] values) {
		if (keys.length != values.length) {
			return null;
		}
		HashMap<Integer, String> result = new HashMap<>();
		for (int i = 0; i < keys.length; i++) {
			result.put(keys[i], values[i]);
		}
		return result;
	}

	Set<Integer> getKeys(Map<Integer, String> map) {
		return map.keySet();
	

	}

	List<Integer> getKeysAsList(Map<Integer, String> map) {
		ArrayList<Integer> result = new ArrayList<>();
		result.addAll(map.keySet());
		return result;
	}

	Set<Entry<Integer, String>> getEntries(Map<Integer, String> map) {
		return map.entrySet();
	}

	List<String> getValues(Map<Integer, String> map) {
		ArrayList<String> result = new ArrayList<>();
		result.addAll(map.values());
		return result;
	}

	String[] getValuesFromMap(Map<Integer, String> map, int key1, int key2) {
		String[] result = new String[2];
		result[0] = map.get(key1);
		result[1] = map.get(key2);

		return result;
	}

	String displayMap(Map<Integer, String> map) {
		// Use map.entrySet()to have nice display
		String result = "";
		for (Entry<Integer, String> entry : map.entrySet()) {
			result += entry.getValue() + "->" + entry.getKey() + ":";
		}

		return result;
	}

	List<Integer> getKeysHavingValue(Map<Integer, String> map, String value) {
		if (!map.containsValue(value)) {
			return null;
		}
		ArrayList<Integer> result = new ArrayList<>();
		for (Entry<Integer, String> entry : map.entrySet()) {
			if (value == entry.getValue()) {
				result.add(entry.getKey());
			}
		}
		return result;
	}

	List<Integer> getKeysHavingValueAnyValue(Map<Integer, String> map, String... values) {
		ArrayList<Integer> result = new ArrayList<>();
		for (String value : values) {
			result.addAll(getKeysHavingValue(map, value));
		}
		return result;

	}

	List<Card> getCards(Map<Integer, Character> map) {
		ArrayList<Card> result = new ArrayList<>();
		for (Entry<Integer, Character> entry : map.entrySet()){
			result.add(new Card(entry.getKey(), entry.getValue()));
		}
		
		return result;
	}

}
