package convertisseur;

public class Convertisseur 
{
    final String [] tabUnites = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    final String [] tabDizaines = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    final String [] tabCentaines = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    final String [] tabMilliers = {"","M","MM","MMM","MMMM","MMMMM","MMMMMM","MMMMMMM" };
    public String convertToRomain(Integer number)
    {
        String chiffreRomain = "";
        if(number != null)
        {
            Integer indiceTabUnites;            
            Integer indiceTabDizaines;
            Integer indiceTabCentaines;
            Integer indiceTabMilliers;

            String stringNumber = number.toString();
            String  [] tabstringNumber = stringNumber.split("");
            
            if(stringNumber.length() == 1)
            {
                indiceTabUnites = Integer.parseInt(tabstringNumber[0]);

                chiffreRomain = tabUnites[indiceTabUnites];
                return chiffreRomain;
            }
            else if(stringNumber.length() == 2)
            {
                indiceTabUnites = Integer.parseInt(tabstringNumber[1]);
                indiceTabDizaines = Integer.parseInt(tabstringNumber[0]);
                chiffreRomain = tabDizaines[indiceTabDizaines].concat(tabUnites[indiceTabUnites]);
                return chiffreRomain;

            }
            else if(stringNumber.length() == 3)
            {
                
            }
            else if(stringNumber.length() == 4)
            {
                
            }
            else if(stringNumber.length() == 5)
            {
                
            }
            else if(stringNumber.length() == 6)
            {
                
            }
            else if(stringNumber.length() == 7)
            {
                
            }
            return number.toString();

        }
        return chiffreRomain;
    }

}
