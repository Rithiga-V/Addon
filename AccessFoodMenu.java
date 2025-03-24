package session5;

public class AccessFoodMenu implements VegItems, NonvegItems {

	@Override
	public void fry() {
		System.out.println("Chicken fry, Prawn fry, Mutton fry, Egg fry etc..");
		
	}

	@Override
	public void gravy() {
		System.out.println("Chicken gravy, Mutton gravy, Egg gravy etc..");
		
	}

	@Override
	public void breakfast() {
		System.out.println("Dosa, Idly, Pongal etc..");
		
	}

	@Override
	public void lunch() {
		System.out.println("Tomato rice, Curd rice, Meals etc..");
		
	}
	
	public static void main(String[] args) {
		
		AccessFoodMenu afm = new AccessFoodMenu();
		afm.breakfast();
		afm.lunch();
		afm.fry();
		afm.gravy();
		
	}

}
