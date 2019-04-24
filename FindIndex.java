package com.dell.mercury2.vrops.fcswitch.util;

import java.util.ArrayList;
import java.util.List;

class FindIndex {

	public static void main(String args[]) {
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(2);
		integerList.add(0);
		integerList.add(1);
		for (int i = 0; i <= integerList.size() - 1; i++) {
			for (int j = 0; j <= integerList.size() - 1; j++) {
				if (i == integerList.get(j)) {
					System.out.println("Index : " + i + ", Index : " + j);
				}
			}
		}
	}
}
