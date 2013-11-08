import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class testcalcul {
	

	Calculette calcul;
	
	@Before
	public void initcalculette(){
		 calcul=new Calculette();
	}
	
	@Test
	public void getresultatretournezero() {
	    assertEquals(0,this.calcul.resultat());
		
	        }

	@Test
	public void getresultatretourneun (){
		assertEquals(1,this.calcul.click(1).resultat());
			}
	@Test
	public void getresultatretourneunplus (){
		assertEquals(1,this.calcul.click(1).click("+").resultat());
			
			}
	@Test
	public void getresultatretourneunplusdeux (){
		assertEquals(3,this.calcul.click(1).click("+").click(2).click("=").resultat());
			
			}
	@Test
	public void getresultatretourntwo2 (){
		assertEquals(2,this.calcul.click(5).click("-").click(3).resultat());
			
			}
	@Test
public void getresultatretourntwoo3 (){
		assertEquals(15,this.calcul.click(5).click("*").click(3).resultat());
			
			}
	@Test
	public void getresultat4(){
			assertEquals(2,this.calcul.click(6).click("/").click(3).resultat());
				
				}
	
  

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
