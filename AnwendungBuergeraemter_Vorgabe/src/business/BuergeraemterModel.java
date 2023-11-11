package business;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuergeraemterModel {

	private Buergeramt buergeramt;
	
	public BuergeraemterModel()
	{
		
	}

	public Buergeramt getBuergeramt() {
		return this.buergeramt;
	}
	
	public void schreibeBuergeraemterInCsvDatei() throws IOException
	{
		BufferedWriter aus = new BufferedWriter(new FileWriter("Buergeraemter.csv", true));
		aus.write(this.getBuergeramt().gibBuergeramtZurueck(';'));
		aus.close();
	}
	
	public void setBuergeramt(Buergeramt buergeramt)
	{
		this.buergeramt = buergeramt;
	}
}