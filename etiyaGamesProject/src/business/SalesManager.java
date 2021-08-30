package business;

import entities.Sales;

public class SalesManager implements SalesService{

	@Override
	public void add(Sales sales) {
		System.out.println( sales.getGame().getName() + " oyunu, " + sales.getGamer().getFirstName() + " kisisi "
				+ sales.getCampaign().getName() + " kampanyasi ile "+ sales.getGame().getUnitPrice()+" TL yerine, "
				+ sales.getCampaignPrice() +" TL ye satin alindi. " );
					
				
		
	}

	@Override
	public void getAll() {
		
		
	}

	@Override
	public void update(Sales sales) {
		
		
	}

	@Override
	public void delete(Sales sales) {
		
		
	}

}