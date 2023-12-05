public class CurrencyCalculator implements CurrencyExchangeRate{

    public static float plnToEuroCalculator (float amountInZlotys){
        float convertedAmount = amountInZlotys / CurrencyExchangeRate.euroToPlnBuyRate();
        System.out.println(amountInZlotys + " " + Currency.PLN + " is worth: " + convertedAmount + " " + Currency.EURO);
        return convertedAmount;
    }
    public static float plnToUsdCalculator (float amountInZlotys){
        float convertedAmount = amountInZlotys / CurrencyExchangeRate.usdToPlnBuyRate();
        System.out.println(amountInZlotys + " " + Currency.PLN + " is worth: " + convertedAmount + " " + Currency.USD);
        return convertedAmount;
    }
    public static float plnToGbpCalculator (float amountInZlotys){
        float convertedAmount = amountInZlotys / CurrencyExchangeRate.gbpToPlnBuyRate();
        System.out.println(amountInZlotys + " " + Currency.PLN + " is worth: " + convertedAmount + " " + Currency.GBP);
        return convertedAmount;
    }
}
