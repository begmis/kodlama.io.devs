package Kodlama.io.Devs.entities.concretes;

public class ProgrammingLanguage {
	private int id;
	private String languageName;
	
	public ProgrammingLanguage() {
		super();
	}

	public ProgrammingLanguage(int id, String languageName) {
		super();
		this.id = id;
		this.languageName = languageName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
}
