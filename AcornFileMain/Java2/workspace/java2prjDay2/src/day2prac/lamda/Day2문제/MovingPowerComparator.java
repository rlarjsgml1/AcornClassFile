package day2prac.lamda.Day2문제;

import java.util.Comparator;

public class MovingPowerComparator implements Comparator<Moving> {

	@Override
	public int compare(Moving o1, Moving o2) {
		return o1.getPower() - o2.getPower();
	}
}
