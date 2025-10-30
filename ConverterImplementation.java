import converter.CurrencyConverter;
public class ConverterImplementation
{
    public static void main(String [] args)
    {
        CurrencyConverter cc=new CurrencyConverter();
        System.out.println(cc.euroToInr(234));
    }
}