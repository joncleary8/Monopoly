public class Fees extends Unownable
	{
		public Fees(String n, int i, boolean b) 
			{
				name = n;
				space = i;
				buyable = b;
			}
		public String getName()
			{
				return name;
			}
	}