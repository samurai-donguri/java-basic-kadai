package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		String[] searchWords = { "apple", "banana", "grape", "orange" };

		for( int i = 0; i < searchWords.length; i++ ) {
			dictionary.SearchDic(searchWords[i]);
		}
		
	}

}
