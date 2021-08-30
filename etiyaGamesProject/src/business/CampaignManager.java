package business;

import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println(campaign.getName() +  " Eklendi");
		
	}

	@Override
	public void getAll() {
		System.out.println( "Listelendi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() +  "G�ncellendi");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() +  "Silindi");
		
	}

}