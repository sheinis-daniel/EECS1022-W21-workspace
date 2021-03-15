//Beseyata DeShmaya
package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice {

	public static int maxMirror(int[] nums) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i : nums) {
			list.add(i);
		}

		ArrayList<Integer> reversed = new ArrayList<>(list);
		Collections.reverse(reversed);

		int sizeCounter = 0;
		int maxSize = 0;
		for (int inset = list.size() - 1; inset >= list.size() * -1; inset--) {
			for (int i = 0; i < list.size(); i++) {
				if (maxSize < sizeCounter) {
					maxSize = sizeCounter;
				}
				if (i + inset < 0 || i + inset > list.size()-1)
					continue;
				if (list.get(i).equals(reversed.get(i + inset))) {
					sizeCounter++;
				} else {
					sizeCounter=0;
				}
			}
			if (maxSize < sizeCounter) {
				maxSize = sizeCounter;
			}
			sizeCounter=0;
			
		}

		return maxSize;

	}
	
}
