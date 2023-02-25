package com.keremturak;

import java.util.Random;

public class Lig {

	private Takim[] takimListesi;
	private Takim[] takim;

	private Takim[][] fikstur;

	public Lig(Takim[] takimListesi) {
		super();
		this.takimListesi = takimListesi;
	}

	public Takim[] getTakimListesi() {
		return takimListesi;
	}

	public void setTakimListesi(Takim[] takimListesi) {
		this.takimListesi = takimListesi;
	}

	public Takim[] getTakim() {
		return takim;
	}

	public void setTakim(Takim[] takim) {
		this.takim = takim;
	}

	public Takim[][] getFikstur() {
		return fikstur;
	}

	public void setFikstur(Takim[][] fikstur) {
		this.fikstur = fikstur;
	}

	public void fiksturOlustur() {
		Takim[][] fikstur = new Takim[120][2];

		int sayi = 0;
		for (int i = 0; i < getTakimListesi().length; i++) {
			for (int j = i + 1; j < getTakimListesi().length; j++) {

				fikstur[sayi][0] = getTakimListesi()[i];
				fikstur[sayi][1] = getTakimListesi()[j];
				System.out.println(i+1+". hafta karşılaşması == "+(sayi+1)+getTakimListesi()[i].getName()+"----"+getTakimListesi()[j].getName());
				sayi++;

			}

		}setFikstur(fikstur);
		System.out.println(getFikstur().length);
		

	}

	public void maclaraBasla() throws InterruptedException {
		Random random = new Random();
		
		for (int i = 0; i < getFikstur().length; i++) {
			int a = random.nextInt(3);
			if (a != 0) {
				getFikstur()[i][a-1].setPuan(getFikstur()[i][a-1].getPuan()+3);
				getFikstur()[i][a-1].setKasa(getFikstur()[i][a-1].getKasa()+10000);
				getFikstur()[i][a-1].setGalibiyet(getFikstur()[i][a-1].getGalibiyet()+1);
				System.out.println(getFikstur()[i][0].getName()+"--"+getFikstur()[i][1].getName()+" maçını "+getFikstur()[i][a-1].getName()+" takımı kazanmışştır");
				

			} else {
				getFikstur()[i][0].setPuan(getFikstur()[i][0].getPuan()+1);
				getFikstur()[i][0].setKasa(getFikstur()[i][0].getKasa()+5000);
				getFikstur()[i][1].setPuan(getFikstur()[i][1].getPuan()+1);

				getFikstur()[i][1].setKasa(getFikstur()[i][1].getKasa()+5000);
				getFikstur()[i][1].setBerabere(getFikstur()[i][1].getBerabere()+1);
				getFikstur()[i][0].setBerabere(getFikstur()[i][0].getBerabere()+1);
				System.out.println(getFikstur()[i][0].getName()+"--"+getFikstur()[i][1].getName()+" maçını berabere bitmiştir ");
				
			}

		}

//	}public void PuanDurumu() {
//		int maxPuan=0;
//		for (int i = 0; i < fikstur.length; i++) {
//			if (getTakimListesi()[i].getPuan()>maxPuan) {
//				getTakimListesi()[i]=maxPuan;
//			}
//			
//			
//		}
//		
//	}

	}public Takim[] ligTablosunuGetir() {
		for (int i = 0; i < takimListesi.length-1; i++) {
		    for (int j = 0; j < takimListesi.length-i-1; j++) {
		        if (takimListesi[j].getPuan() < takimListesi[j+1].getPuan()) {
		            // Takımları yer değiştirin
		            Takim takim2 = takimListesi[j];
		            takimListesi[j] = takimListesi[j+1];
		            takimListesi[j+1] = takim2;
		        }
		    }
		}
		
		System.out.printf("%-15s%-11s%-8s%-12s%-11s%-10s\n", "Takım","Maç Sayısı", "Kayıp", "Beraberlik", "Galibiyet", "Puan");
	    for (Takim takim : takimListesi) {
	        System.out.printf("%-16s%-11d%-8d%-12d%-11d%-10d\n", takim.getName(),takim.getMacSayisi(), (15-(takim.getBerabere()+takim.getGalibiyet())), takim.getBerabere(), takim.getGalibiyet(), takim.getPuan());
	    }return takimListesi;
		
		}

	public void basariliTakimlariGöster() {
		for (int i = 0; i <takimListesi.length; i++) {
			if (i==0) {
				System.out.println(takimListesi[i].getName()+"---şampiyon!!!!!-----");
				
			}else if (i<4&& 0<i) {
				System.out.println("\n"+takimListesi[i].getName()+" Şampiyonlar ligine gitmeye hak kazanmıştır.");
			}else if (i>13) {
				System.out.println("\n"+takimListesi[i].getName()+" küme düşen takımlara geçmiş olsun");
			}
			
		}
		
	}
}
