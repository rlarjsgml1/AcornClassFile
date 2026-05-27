package com.acorn.day3.test;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class DanServiceEx {

	public ArrayList<String> dan(int dan) {
		ArrayList<String> danList = new ArrayList<>();

		for (int i = 1; i <= 9; i++) {
			danList.add(dan + "*" + i + "=" + (dan * i));
		}

		return danList;
	}
}
