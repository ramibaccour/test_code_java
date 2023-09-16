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
                indiceTabUnites = Integer.parseInt(tabstringNumber[2]);
                indiceTabDizaines = Integer.parseInt(tabstringNumber[1]);
                indiceTabCentaines = Integer.parseInt(tabstringNumber[0]);
                chiffreRomain = tabCentaines[indiceTabCentaines].concat(tabDizaines[indiceTabDizaines].concat(tabUnites[indiceTabUnites]));
                return chiffreRomain;
            }
            else if(stringNumber.length() >= 4)
            {
                indiceTabUnites = Integer.parseInt(tabstringNumber[stringNumber.length()-1]);
                indiceTabDizaines = Integer.parseInt(tabstringNumber[stringNumber.length()-2]);
                indiceTabCentaines = Integer.parseInt(tabstringNumber[stringNumber.length()-3]);
                chiffreRomain = tabCentaines[indiceTabCentaines].concat(tabDizaines[indiceTabDizaines].concat(tabUnites[indiceTabUnites]));
                Integer nunmberSuperieurCentaine = Integer.parseInt(stringNumber.substring(0, stringNumber.length()-3)) ;

                for(Integer i=0;i<nunmberSuperieurCentaine;i++)
                {
                    chiffreRomain = "M".concat(chiffreRomain);
                }
            }
        }
        return chiffreRomain;
    }

}
