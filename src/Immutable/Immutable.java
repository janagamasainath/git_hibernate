package Immutable;

public class Immutable {
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	

	public Immutable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Immutable [id=" + id + ", name=" + name + "]";
	}
	public Immutable transulate(int i , String n) {
		return new Immutable(id+i, n+name);
		
		// TODO Auto-generated constructor stub
	}


}
