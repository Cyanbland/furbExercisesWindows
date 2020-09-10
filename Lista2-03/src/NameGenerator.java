
public class NameGenerator {
	
	//O retorno  �  a  String  gerada  e  o  par�metro  de  entrada  �  um  vetor  de  String  contendo  na  
	//primeira posi��o seu nome completo, na segunda posi��o o nome de solteira de sua m�e e na terceira posi��o 
	//o nome da cidade onde voc� nasceu. 
	
	public static String generateStarWarsName(String[] input) {
		String swName = "";
		String swSurname;
		String fullSwName; 
		String surname;
		String name;
		String fullName = input[0];
		String mothersSingleName = input[1];
		String birthCity = input[2];
		String[] separatedNames = new String[fullName.length()];
		
		separatedNames = fullName.split(" ");
		
		surname = separatedNames[separatedNames.length - 1];
		name = separatedNames[0];
		
		swName = getLettersUntilPoint(surname, 3) + getLettersUntilPoint(name.toLowerCase(), 2);
		swSurname = getLettersUntilPoint(mothersSingleName, 2) + getLettersUntilPoint(birthCity.toLowerCase(), 3);
		fullSwName = swName + " " + swSurname;

		
		return fullSwName;
	}
	
	private static String getLettersUntilPoint(String word, int point) {
		String finalStr = "";
		for (int i = 0; i < point; i++) {
			finalStr += word.charAt(i);
		}
		return finalStr;
	}
}

