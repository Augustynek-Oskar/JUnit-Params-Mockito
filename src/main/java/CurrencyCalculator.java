public class CurrencyCalculator implements CurrencyExchangeRate{

    public static void main(String[] args) {

    }
    public static float plnToEuroCalculator (float amountInZlotys){
        return amountInZlotys / CurrencyExchangeRate.euroToPlnBuyRate();
    }
    public static float plnToUsdCalculator (float amountInZlotys){
        return amountInZlotys / CurrencyExchangeRate.euroToPlnBuyRate();
    }
    public static float plnToGbpCalculator (float amountInZlotys){
        return amountInZlotys / CurrencyExchangeRate.euroToPlnBuyRate();
    }

}
