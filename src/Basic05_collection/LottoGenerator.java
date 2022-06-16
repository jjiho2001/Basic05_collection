package Basic05_collection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class LottoGenerator {

	public static void main(String[] args) {
		
		Scanner game = new Scanner(System.in);
		
		for(;;) {
			System.out.print("���Ӽ� : ");
			int game_num = game.nextInt();
			// int[] Lotto_num = new int[6];

			for (int i = 0; i < game_num; i++) {
				TreeSet<Integer> Lotto_num = new TreeSet<Integer>();
				int bonus_num = 0;
				
				while (Lotto_num.size() < 7) {
					bonus_num = (int)(Math.random() * 45) + 1;
					Lotto_num.add(bonus_num);
				}
			Lotto_num.remove(bonus_num);
			System.out.println(Lotto_num.toString() + " bonus : " + bonus_num);
			
			}
			
			
			/* 
			
			for (int j = 0; j < game_num; j++) {
				int bonus_num = (int)(Math.random() * 45) + 1;
				
				for(int i = 0; i < Lotto_num.length; i++) {
					
					Lotto_num[i] = (int)(Math.random() * 45) + 1;
					if(Lotto_num[i] == bonus_num) i--;
					for(int k = 0; k < i; k++) {
						if(Lotto_num[i] == Lotto_num[k]) i--;
					}
				}
				Arrays.sort(Lotto_num);
				System.out.printf("%d���� : %s, bonus : %d\n",j+1, Arrays.toString(Lotto_num), bonus_num);
			}
			*/
			
			System.out.print("����Ͻðڽ��ϱ�? (1.��, 2.�ƴϿ�)");
			
			if(game.nextLine().equals("1")) {
				continue;
			} else if(game.nextLine().equals("2")) {
				break;
			}
		}
	}

}
