package converter;

public class CurrencyConverter {
    
private final double usd_to_inr=83.0;
private final double yen_to_inr=0.56;
private final double euro_to_inr=89.0;
public double usdToInr(double dollar)
{
    return dollar*usd_to_inr;
}
public double euroToInr(double euro)
{
    return euro*euro_to_inr;
}
public double yenToInr(double yen)
{
    return yen*yen_to_inr;
}
public double inrToUsd(double rupees)
{
    return rupees/usd_to_inr;
}
public double inrToEuro(double rupees)
{
    return rupees/euro_to_inr;
}
public double inrToYen(double rupees)
{
    return rupees/yen_to_inr;
}

}
