
public class FreeParking extends Unownable
	{
		public FreeParking(String n, int s, boolean cb) 
			{
				name = n;
				space = s;
				buyable = cb;
			}
		public String getName()
			{
				return name;
			}
	}