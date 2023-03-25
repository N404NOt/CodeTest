package code_LeetCode.code_2023_03_25.Code;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class migong {
	static boolean[][] visited;
	static int[][] direction = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[][] ch = new char[10][10];
		while (in.hasNext()) {
			
			visited = new boolean[10][10];
			for (int i = 0; i < 10; i++) {
				char[] temp = in.nextLine().toCharArray();
				for (int j = 0; j < 10; j++) {
					ch[i][j] = temp[j];
				}
			}
			miNode start = new miNode(0, 1, 0);
			miNode end = new miNode(9, 8, 0);
			bfs(ch, start, end);
		}
	}
	private static void bfs(char[][] ch, miNode start, miNode end) {
		Queue<miNode> queue = new LinkedList<miNode>();
		queue.add(start);
		while (!queue.isEmpty()) {
			miNode cur = queue.poll();
			if (cur.x == end.x && cur.y == end.y) {
				System.out.println(cur.step);
				break;
			}
			for (int i = 0; i < 4; i++) {
				miNode next = new miNode(cur.x + direction[i][0], cur.y + direction[i][1], cur.step + 1);
				if (next.x >= 0 && next.x < 10 && next.y + direction[i][1] >= 0 && next.y + direction[i][1] < 10
						&& ch[next.x][next.y] != '#' && !visited[next.x][next.y]) {
					queue.add(next);
					visited[next.x][next.y] = true;
				}
			}
		}
	}
	static class miNode {
		int x, y, step;
		public miNode(int x, int y, int step) {
			this.x = x;
			this.y = y;
			this.step = step;
		}
	}
}
