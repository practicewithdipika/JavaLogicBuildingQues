package JavaLogicBuildingQues;

public class ConceptConstructor {
    private String name; //Instance variable
	//Default Constructor
	public ConceptConstructor() {
		System.out.println("default constructor");
	}
	//Parameterized Constructor
	public ConceptConstructor(String name) {
		this.name = name;	
		naming();
	}
	//Copy constructor
	public ConceptConstructor(ConceptConstructor c) {
		this.name= c.name;
		naming();
	}
	
	
	public void naming() {
		System.out.println("your name is:"+ name);
	}

}
