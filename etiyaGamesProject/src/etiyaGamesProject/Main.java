package etiyaGamesProject;

import java.time.LocalDate;

import business.CalculateGameManager;
import business.CampaignManager;
import business.CampaignService;
import business.GameManager;
import business.GamePlayedManager;
import business.GamePlayedService;
import business.GameService;
import business.GamerManager;
import business.GamerService;
import business.SalesManager;
import business.SalesService;
import core.mernisServiceAdapter;
import entities.Campaign;
import entities.Game;
import entities.Gamer;
import entities.Sales;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1=new Gamer(1, "Taha", "Bayav", "35506206204",LocalDate.of(1995, 4, 6),"Erkek");
		Gamer gamer2=new Gamer(2, "Tuğra", "Bayav", "12374125896",LocalDate.of(1671, 9, 18),"Erkek");
		Gamer gamer3=new Gamer(3, "Ömür", "Bayav", "33321456987",LocalDate.of(2015, 9, 18),"Kadın");
			
		
		System.out.println("----------Kullanıcının kontrol edilmesi ve eklemesi-------------");
		
		GamerService gamerService=new GamerManager(new mernisServiceAdapter());
		gamerService.add(gamer1);
		gamerService.add(gamer2);
		gamerService.add(gamer3);
		
		
		
		System.out.println("----------Oyun Ekleme -------------");
		
		Game game1=new Game(1, "Dota 2", "Strateji", 50, 100);
		Game game2=new Game(2, "TFT ", "Strateji", 30, 500);
		Game game3=new Game(3, "Call of Duty", "Ftp", 50, 100);
		
		GameService gameService=new GameManager();
		gameService.add(game1);
		gameService.add(game2);
		gameService.add(game3);
		
		
		
		
		System.out.println("----------Kampanya Ekleme -------------");
		
		Campaign campaign1=new Campaign(1,"Steam İndirimi",50);
		Campaign campaign2=new Campaign(2,"EA indirimi",30);
		
		CampaignService campaignService=new CampaignManager();
		campaignService.add(campaign1);
		campaignService.add(campaign2);
		
		
		
		
		System.out.println("----------Satış İşlemleri -------------");
		
		Sales sales1=new Sales(1, game1, gamer3, campaign2);
		Sales sales2=new Sales(2, game2, gamer1, campaign1);
		Sales sales3=new Sales(3, game3, gamer2, campaign1);
		
		
		SalesService salesService=new SalesManager();
		salesService.add(sales1);
		salesService.add(sales2);
		salesService.add(sales3);
		
		
		System.out.println("---------- Oyun Hakkında -------------");
		
		GamePlayedService gamePlayedService1=new GamePlayedManager(new CalculateGameManager());
		GamePlayedService gamePlayedService2=new GamePlayedManager(new CalculateGameManager());
		GamePlayedService gamePlayedService3=new GamePlayedManager(new CalculateGameManager());
		
		gamePlayedService1.play(gamer3, game1);
		gamePlayedService2.play(gamer1, game1);
		gamePlayedService3.play(gamer2, game1);
		
		

	}

}
