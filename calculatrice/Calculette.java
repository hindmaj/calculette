import java.io.PushbackInputStream;
import java.util.HashMap;

import calculatrice.Addition;
import calculatrice.Operation;
import calculatrice.Soustraction;

public class Calculette {
 public int resultat;
 private int rightoperand;
private String operator="+";
 private Operation operation=new Addition();
 
 public int resultat()
	{   getresultat();
		return  this.resultat;
	}
	
	public Calculette click(int i) {
		this.rightoperand=this.rightoperand*10+i;
		 return  this;
		                           }
	
	public Calculette click(String operator) {
		 this.getresultat();
		 this.selectoperation(operator);
		 return  this;
		                             }
	private void getresultat()
	{
	
		if("+".equals(this.operator))
		 {
		this.resultat=operation.calcul(this.resultat,this.rightoperand);}
		else if("-".equals(this.operator))
			{
		this.resultat=operation.calcul(this.resultat,this.rightoperand);}
		else if("*".equals(this.operator))
			{
			this.resultat=operation.calcul(this.resultat,this.rightoperand);}
		else if("/".equals(this.operator))
			{
			this.resultat=operation.calcul(this.resultat,this.rightoperand);}
				
		this.rightoperand=0;
	}
	
	public void selectoperation(String operator){
		HashMap<String,Operation> operations=new HashMap<String,Operation>();
		operations.put("+",new Addition());
		operations.put("-",new Soustraction());
		operations.put("=",new Egal());
		operations.put("*",new Multiplication());
		operations.put("/",new Division());
		this.operation=operations.get(operator);
	}

	

	


}






























