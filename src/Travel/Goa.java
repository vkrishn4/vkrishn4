package Travel;

public class Goa extends Pondy {
	
	@Override
	public void Whiskey() {
		
		System.out.println("Whiskey:"+150);
		
		super.Whiskey();
	}
	
	@Override
	public void Rum() {
	System.out.println("Rum:"+110);
	
		super.Rum();
	}
	
	@Override
	public void Breezer() {
		System.out.println("Breezer:"+80);
		
		super.Breezer();
	}
	
	

	public static void main(String[] args) {
		Goa r = new Goa();
		r.Breezer();
		r.Whiskey();
		r.Rum();
		
	}
		
	
	}
	
	
	
	

