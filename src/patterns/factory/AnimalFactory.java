package patterns.factory;

public class AnimalFactory {

	public static Animal getAnimal(char animalflag) {
		Animal animal;
		
		switch (animalflag) {
		case 'c':
		case 'C':
			animal = new AnimalCat();
			break;
		case 'd':
		case 'D':
			animal = new AnimalDog();
			break;
		default:
			animal = null;
		    break;
		}
		return animal;
	}
}
