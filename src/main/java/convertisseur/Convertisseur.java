package convertisseur;

public class Convertisseur 
{
    public String convertToRomain(Integer number)
    {
        final String [] tabUnites = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        final String [] tabDizaines = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        final String [] tabCentaines = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        final String [] tabMilliers = {"","M","MM","MMM","MMMM","MMMMM","MMMMMM","MMMMMMM" };
        return number.toString();
    }

}
