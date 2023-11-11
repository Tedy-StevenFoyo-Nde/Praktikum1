package gui;

import java.io.IOException;

import business.BuergeraemterModel;
import business.Buergeramt;

public class BuergeraemterControl {
	
	private BuergeraemterModel model;
	private BuergeraemterView view;
	
	public BuergeraemterControl(BuergeraemterView view, BuergeraemterModel buergeraemterModel)
	{
		this.view = view;
		this.model = buergeraemterModel;
	}
	
	public void schreibeBuergeraemterInDatei(String typ)
	{
		try {
			if("csv".equals(typ))
			{
				this.model.schreibeBuergeraemterInCsvDatei();
				this.view.ZeigeInformationAn("Die Buergeraemter wurde gespeichert");
			}
			else {
				this.view.zeigeFehlerMeldungAn("Noch nicht implementiert");
			}
			
		} catch (IOException e) {
			this.view.zeigeFehlermeldungsfensterAn("IOException beim Speichern!");
		}
		catch (Exception e) {
			this.view.zeigeFehlermeldungsfensterAn("Unbekannter Fehler bein Speichern!");
		}
	}

}