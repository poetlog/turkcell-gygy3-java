package Kodlama.io.Devs.entities.concretes;

public class Languages {
	private String name;
	private int id;

	public Languages() {

	}

	public Languages(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
