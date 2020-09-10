
public class Sentence {
	private String text;

	public Sentence(String text) {
		this.setText(text);;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String[] splitSentence() {
		String[] parts = new String[this.text.length()];
//		String word = "";
//		int index = 0;
//		for (int i = 0; i < this.text.length(); i++) {
//			if (this.text.charAt(i) == ' ') {
//				parts[index] = word;
//				index++;
//				word = "";
//			}
//			else {
//				word += this.text.charAt(i);
//			}
//		}
//		
		parts = this.text.split(" ");
		return parts;
	}
	
	
}
