package gui;

import java.io.IOException;

import business.BuegeraemterModel;
import business.Buergeramt;
import javafx.stage.Stage;

public class BuergeraemterControl {

	private BuergeraemterView bView;
	private Buergeramt buergeramt;
	private BuegeraemterModel bmodel ;
	private BuergeraemterControl bControl;
	
	public BuergeraemterControl( BuergeraemterView bview , BuegeraemterModel bmodel) {
		this.bView = bview;
		this.bmodel = bmodel;
	}
	
	
	
	void schreibeBuergeraemterInDatei(String typ) {
		try {
			if("csv".equals(typ)) {
				this.bmodel.schreibeBuergeraemterInCsvDatei();
			}
			else {
				this.bView.ZeigeInformationAn("die Burg. wurde aufgenommen");
			}
		
		}
		catch (IOException exc) {
			this.bView.zeigeFehlermeldungsfensterAn("IOException beim Speichern");
		}
		catch (Exception e) {
    this.bView.zeigeFehlermeldungsfensterAn("Unbekannter  Fehler beim Speichern");
		}
	}
}
