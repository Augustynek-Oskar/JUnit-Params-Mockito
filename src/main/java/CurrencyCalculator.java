public class CurrencyCalculator implements CurrencyExchangeRate{

    public float plnToEuroCalculator (float amountInZlotys){
        if (amountInZlotys == 0) return 0;
        float convertedAmount = amountInZlotys / CurrencyExchangeRate.euroToPlnBuyRate();
        System.out.println(amountInZlotys + " " + Currency.PLN + " is worth: " + convertedAmount + " " + Currency.EURO);
        return convertedAmount;
    }
    public float plnToUsdCalculator (float amountInZlotys){
        if (amountInZlotys == 0) return 0;
        float convertedAmount = amountInZlotys / CurrencyExchangeRate.usdToPlnBuyRate();
        System.out.println(amountInZlotys + " " + Currency.PLN + " is worth: " + convertedAmount + " " + Currency.USD);
        return convertedAmount;
    }
    public float plnToGbpCalculator (float amountInZlotys){
        if (amountInZlotys == 0) return 0;
        float convertedAmount = amountInZlotys / CurrencyExchangeRate.gbpToPlnBuyRate();
        System.out.println(amountInZlotys + " " + Currency.PLN + " is worth: " + convertedAmount + " " + Currency.GBP);
        return convertedAmount;
    }
}
