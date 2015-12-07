
public class Jail extends Unownable
	{
		public Jail(String n, int s, boolean cb) 
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