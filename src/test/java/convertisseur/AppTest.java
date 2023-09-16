package convertisseur;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static Convertisseur convertisseur;
    @BeforeAll
	public static void methodeAppeleeAvantTousLesTests() 
    {
        convertisseur = new Convertisseur();
	}

    @DisplayName("Réussir à convertir un chiffre arabe => romain")
    @ParameterizedTest(name = "{0} should equal to {1}")
	@CsvSource({ "1,I", "2,II", "3,III" })
    public void test_convert_int_to_romain(Integer number, String numberRomain)
    {
        assertEquals( convertisseur.convertToRomain(number),numberRomain );
    }

}
