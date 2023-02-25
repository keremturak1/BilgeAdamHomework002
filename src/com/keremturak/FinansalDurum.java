package com.keremturak;

public class FinansalDurum {
	public void iflasDurumundakiler(Takim[] takim) {
		
		for (int i = 0; i < takim.length; i++) {
			if (takim[i].getKasa()<50000) {
				System.out.println(takim[i].getName()+" Takımı "+takim[i].getKasa()+" Kazanmıştır. İflas etme durumu var.. ");
			}
			
		}
		
		
	}
	
	

}
