package JavaLogicBuildingQues;

public class constructorCalling {
	public static void main(String[] args) {
		ConceptConstructor c1 = new ConceptConstructor();
		ConceptConstructor c2=  new ConceptConstructor("Dipika");
		ConceptConstructor c3=  new ConceptConstructor(c2);
	}
}
