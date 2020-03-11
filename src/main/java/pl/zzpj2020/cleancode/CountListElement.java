package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CountListElement {

	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	private int minValue = Integer.MIN_VALUE;
	private int maxValue = Integer.MAX_VALUE;


	public void countElementAppearance(List<Integer> l1) {
		for (Integer integer : l1) {
			checkElement(integer);
		}
	}

	public void checkElement(Integer i) {

		if (map.containsKey(i)) {
			Integer k = map.get(i);
			map.put(i, k +1);
		} else {
			map.put(i, 1);
		}

		if (i > minValue) {
			minValue = i;
		}

		if (i < maxValue) {
			maxValue = i;
		}
	}

	public int getElementsNumberByKey(int i) {
		return map.getOrDefault(i, 0);
	}

	public double countAverage() {
		double numerator = 0;
		double dominator = 0;

		for (Entry<Integer, Integer> u : map.entrySet()) {
			dominator += u.getValue();
			numerator += u.getKey() * u.getValue();
		}
		return numerator/dominator;
	}

	public int getMinValue() {
		return minValue;
	}

	public int getMaxValue() {

		return maxValue;

	}

}