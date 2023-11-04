package business;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import gui.BuergeraemterView;

public class BuegeraemterModel {
    
	private BuergeraemterView bview;
	private Buergeramt bu;
	
	/*public BuegeraemterModel() {
		this.bu = bview.getBuergeramt();
		
	} */
	public void schreibeBuergeraemterInCsvDatei() throws IOException {
		BufferedWriter aus = new BufferedWriter(new FileWriter("Buegeraemt.csv", true));
		aus.write(this.getBu().gibBuergeramtZurueck(';'));
		aus.close();
	}

	public Buergeramt getBu() {
		return bu;
	}

	public void setBu(Buergeramt bu) {
		this.bu = bu;
	}

	
	
}
