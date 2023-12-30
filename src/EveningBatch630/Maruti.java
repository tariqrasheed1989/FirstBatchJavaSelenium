package EveningBatch630;
interface car
{
	public void wheels();
	public void seats();
	public void steering();
}

public class Maruti implements car
{
	public static void main(String[] args) 
	{Maruti ob=new Maruti();
	ob.wheels();
	ob.seats();
	ob.steering();
		
	
	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("4 wheels");
	}

	@Override
	public void seats() {
		// TODO Auto-generated method stub
		System.out.println("5 seater");
		
	}

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("Powersteering");
	}

}
