package kadai_026;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	public String getMyChoice() {
		
		boolean inputError = true;
		String  input  = "";
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			input = scanner.next();
			
			if(input.equals("r") || input.equals("s") || input.equals("p")) {
				inputError = false;
			} else {
				System.out.println("正しいじゃんけんの手ではありません");
			}
			
		} while(inputError);
		
		scanner.close();
		
		return input;
	
	}

	public String getRandom() {
		
		String[] jyankenHand = { "r", "s", "p" };

		return jyankenHand[(int) Math.floor(Math.random() * 3)];
		
	}

	public void playGame(final String myChoice, final String yourChoice) {
		
		HashMap<String,String> jyankenName = new HashMap<String,String>();
		
		jyankenName.put("r","グー");
		jyankenName.put("s","チョキ");
		jyankenName.put("p","パー");
		
		System.out.println("自分の手は" + jyankenName.get(myChoice) + ",対戦相手の手は" + jyankenName.get(yourChoice));
		
		if(myChoice.equals(yourChoice)) {
			System.out.println("あいこです");
		} else {

			switch(myChoice) {

				case "r" -> {
					if (yourChoice.equals("s")) {
						System.out.println("自分の勝ちです");
					} else {
						System.out.println("自分の負けです");
					}
				}
				case "s" -> {
					if (yourChoice.equals("p")) {
						System.out.println("自分の勝ちです");
					} else {
						System.out.println("自分の負けです");
					}
				}
				case "p" -> {
					if (yourChoice.equals("r")) {
						System.out.println("自分の勝ちです");
					} else {
						System.out.println("自分の負けです");
					}
				}
			}
			
		}
		
	}
}
