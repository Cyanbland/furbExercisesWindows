
public class NameGenerator {
	
	//O retorno  é  a  String  gerada  e  o  parâmetro  de  entrada  é  um  vetor  de  String  contendo  na  
	//primeira posição seu nome completo, na segunda posição o nome de solteira de sua mãe e na terceira posição 
	//o nome da cidade onde você nasceu. 
	
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

