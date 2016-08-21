import java.util.Arrays;

public class test8 {

	public static void Shuffle(int[] card) {

		for (int i = 0; i < 1000000; i++) {
			int index_first = (int) (Math.random() * 52);
			int index_second = (int) (Math.random() * 52);

			if (index_first != index_second) {
				int temp = card[index_first];
				card[index_first] = card[index_second];
				card[index_second] = temp;
			}

		}
	}

	public static void Cardtype(int matrix_num) {
		int suit_type = (matrix_num - 1) / 13;

		int card_num = matrix_num % 13;

		switch (suit_type) {
		case 0:
			System.out.print("\u2663");
			break;

		case 1:
			System.out.print("\u2666");
			break;

		case 2:
			System.out.print("\u2665");
			break;

		case 3:
			System.out.print("\u2660");
			break;
		}

		switch (card_num) {
		case 0:
			System.out.print("K" + "\t");
			break;

		case 1:
			System.out.print("A" + "\t");
			break;
			
		case 11:
			System.out.print("J" + "\t");
			break;

		case 12:
			System.out.print("Q" + "\t");
			break;

		default:
			System.out.print(card_num + "\t");
			break;
		}

		if (card_num == 0)
			card_num = 13;		
	}

	public static void main(String[] args) {

		// 設定撲克牌的初始
		int[] poker = new int[52];

		for (int i = 0; i < poker.length; i++) {
			poker[i] = i + 1;
		}

		// 洗牌

		long begin = System.currentTimeMillis();

		Shuffle(poker);

		System.out.println(System.currentTimeMillis() - begin);

		// 發牌

		int[][] player = new int[4][13];

		for (int i = 0; i < poker.length; i++) {

			int index = i / 4;
			int player_num = i % 4;

			player[player_num][index] = poker[i];
		}

	
		int i = 0;
		for (int[] p : player) {
			System.out.print("player" + i + ":\t");
			
			Arrays.sort(p);
			for (int q : p) {
				Cardtype(q);
			}
			System.out.print("\n");

			i++;
		}

		// 理牌

	}

}
