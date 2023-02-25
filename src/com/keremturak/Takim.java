package com.keremturak;

public class Takim {
	public  int macSayisi =15;
	private String name;
	private int puan;
	private int kasa;
	private int galibiyet;
	private int kayıp;
	private int berabere;
	
	public int getMacSayisi() {
		return macSayisi;
	}

	public void setMacSayisi(int macSayisi) {
		this.macSayisi = macSayisi;
	}


	public Takim(String name, int puan, int kasa) {
		super();
		this.name = name;
		this.puan = puan;
		this.kasa = kasa;
	}
	
	public int getGalibiyet() {
		return galibiyet;
	}

	public void setGalibiyet(int galibiyet) {
		this.galibiyet = galibiyet;
	}

	public int getKayıp() {
		return kayıp;
	}

	public void setKayıp(int kayıp) {
		this.kayıp = kayıp;
	}

	public int getBerabere() {
		return berabere;
	}

	public void setBerabere(int berabere) {
		this.berabere = berabere;
	}

	public Takim(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPuan() {
		return puan;
	}
	public void setPuan(int puan) {
		this.puan = puan;
	}
	public int getKasa() {
		return kasa;
	}
	public void setKasa(int kasa) {
		this.kasa = kasa;
	}
	
	

}
