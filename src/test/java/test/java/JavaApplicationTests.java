package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import test.java.service.ConvertisseurChiffreRomin;

@SpringBootTest
class JavaApplicationTests 
{
	@Autowired
	ConvertisseurChiffreRomin convertisseurChiffreRomin;

	@Test
	void testChiffreRomin() 
	{
		String resulta = "I"; 
		// convertisseurChiffreRomin.convertisseurChiffre(1).compareTo(resulta);

		assertEquals(resulta, convertisseurChiffreRomin.convertisseurChiffre(1));
	}

}
