package practice;

import java.util.HashMap;
import java.util.Map;

/*
 1 2 3
 4 5 6
 7 8 9
 0
 To adjust 0 position, fix the respective element in map m below.
 */
public class Numberpad {

	static class Pos {
		private final int row;
		private final int column;

		Pos(int row, int column) {
			this.row = row;
			this.column = column;
		}

		@Override
		public boolean equals(Object obj) {
			Pos p = (Pos) obj;
			return column == p.column && row == p.row;
		}

		@Override
		public int hashCode() {
			return 31 * (31 + column) + row;
		}

		@Override
		public String toString() {
			return new StringBuilder().append('[').append(row).append(',').append(column).append(']').toString();
		}
	}

	public static void main(String[] args) {
		Map<Pos, Integer> m = new HashMap<Pos, Integer>();
		m.put(new Pos(0, 0), 1);
		m.put(new Pos(0, 1), 2);
		m.put(new Pos(0, 2), 3);
		m.put(new Pos(1, 0), 4);
		m.put(new Pos(1, 1), 5);
		m.put(new Pos(1, 2), 6);
		m.put(new Pos(2, 0), 7);
		m.put(new Pos(2, 1), 8);
		m.put(new Pos(2, 2), 9);
		m.put(new Pos(3, 0), 0);
		Map<Integer, Pos> revM = new HashMap<Integer, Pos>();
		for (Map.Entry<Pos, Integer> e : m.entrySet()) {
			revM.put(e.getValue(), e.getKey());
		}
		int[][] moves = { { 2, 1 }, { 2, -1 }, { 1, -2 }, { 1, 2 }, { -1, -2 }, { -1, 2 }, { -2, -1 }, { -2, 1 } };
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < moves.length; j++) {
				Pos source = revM.get(i);
				Pos target = new Pos(source.row + moves[j][0], source.column + moves[j][1]);
				if (null == m.get(target)) {
					continue;
				}
				System.out.println("input=" + i + " target=" + target + " targetSign=" + m.get(target));
			}
		}
	}

}
