
public abstract class Space
	{
				protected String name;
				protected int space;
				protected int price;
				protected boolean buyable;
				protected boolean purchased;
				
				public String getName()
					{
						return name;
					}

				public int getSpace()
					{
						return space;
					}

				public void setSpace(int space)
					{
						this.space = space;
					}

				public int getPrice()
					{
						return price;
					}

				public void setPrice(int price)
					{
						this.price = price;
					}

				public boolean isBuyable()
					{
						return buyable;
					}

				public void setBuyable(boolean buyable)
					{
						this.buyable = buyable;
					}

				public boolean isPurchased()
					{
						return purchased;
					}

				public void setPurchased(boolean purchased)
					{
						this.purchased = purchased;
					}

				public void setName(String name)
					{
						this.name = name;
					}
				
				
	}