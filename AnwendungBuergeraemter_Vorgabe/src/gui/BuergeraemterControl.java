package gui;

import java.io.IOException;

import business.BuegeraemterModel;
import business.Buergeramt;
import javafx.stage.Stage;

public class BuergeraemterControl {

	private BuergeraemterView bView;
	private Buergeramt buergeramt;
	private BuegeraemterModel bModel ;
	private BuergeraemterControl bControl;
	
	public BuergeraemterControl(Stage primaryStage) {
		this.bView = new BuergeraemterView(primaryStage , this);
		this.bModel =new BuegeraemterModel();
	}
	
	public void nehmeBuergeramtAuf(){
		
    	try{
    		this.buergeramt = this.bView.getBuergeramt();
    		this.bView.zeigeInformationsfensterAn("Das Bürgeramt wurde aufgenommen!");
       	}
       	catch(Exception exc){
       		this.bView.zeigeFehlermeldungsfensterAn(exc.getMessage());
     	}
    }
	
	void schreibeBuergeraemterInDatei(String typ) {
		try {
			if("csv".equals(typ)) {
				bModel.schreibeBuergeraemterInCsvDatei();
			}
			else {
				bView.zeigeFehlermeldungsfensterAn("Noch nicht implementiert");
			}
		
		}
		catch (IOException exc) {
			bView.zeigeFehlermeldungsfensterAn("IOException beim Speichern");
		}
		catch (Exception e) {
    bView.zeigeFehlermeldungsfensterAn("Unbekannter  Fehler beim Speichern");
		}
	}
}
