package com.keremturak;


public class Main {

	public static void main(String[] args) throws InterruptedException {

		
		Takim takim1 = new Takim("Real Madrid");
		Takim takim2 = new Takim("Barcelona");
		Takim takim3 = new Takim("Real Sociedad");
		Takim takim4 = new Takim("Atletico Madrid");
		Takim takim5 = new Takim("Rayo Vallecano");
		Takim takim6 = new Takim("Athletic Bilbao");
		Takim takim7 = new Takim("Villarreal");
		Takim takim8 = new Takim("Mallorca");
		Takim takim9 = new Takim("Osasuna");
		Takim takim10 = new Takim("Girona");
		Takim takim11 = new Takim("Sevilla");
		Takim takim12 = new Takim("Espanyol");
		Takim takim13 = new Takim("Celta Vigo");
		Takim takim14 = new Takim("Real Valladolid");
		Takim takim15 = new Takim("Getafe");
		Takim takim16 = new Takim("Real Betis");
		System.out.println(takim1.getName());

		Takim[] takimListesi= {takim1,takim2,takim3,takim4,takim5,takim6,takim7,takim8,takim9,takim10,takim11,takim12
				,takim13,takim14,takim15,takim16};
		
		Lig lig = new Lig(takimListesi);
		FinansalDurum finansaldurum = new FinansalDurum();
		lig.fiksturOlustur();
		Thread.sleep(1000);
		lig.maclaraBasla();
		Thread.sleep(1000);
		System.out.println();
		lig.ligTablosunuGetir();
		
		System.out.println();
		Thread.sleep(1000);
		finansaldurum.iflasDurumundakiler(takimListesi);
		Thread.sleep(1000);
		System.out.println();
		lig.basariliTakimlariGöster();
		
		
		

	}

}
