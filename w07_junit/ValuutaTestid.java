import org.junit.*;
import static org.junit.Assert.*;
public class ValuutaTestid {
    @Test
    public void Test1(){
		ValuutaTestid testing1 = new ValuutaTestid();
		double euro = 10;
		double tulemus = testing1.euroToDollar(euro);
		assertEquals(12, tulemus, 0.5);
	}
	@Test
    public void Test2(){
		ValuutaTestid testing2 = new ValuutaTestid();
		double dollar = 10;
		double tulemus = testing2.dollarToPound(dollar);
		assertEquals(7, tulemus, 0.5);
	}
	@Test
    public void Test3(){
		ValuutaTestid testing3 = new ValuutaTestid();
		double pound = 10;
		double tulemus = testing3.poundToEuro(pound);
		assertEquals(11.6, tulemus, 0.5);
	}
}
