public class CurrencyCalculator implements CurrencyExchangeRate{
    public static void main(String[] args) {

    }
    public static float plnToEuroCalculator (float amount){
        return amount / CurrencyExchangeRate.euroToPlnExchangeRate();
    }
    public static float plnToUsdCalculator (float amount){
        return amount / CurrencyExchangeRate.usdToPlnExchangeRate();
    }
    public static float plnToGbpCalculator (float amount){
        return amount / CurrencyExchangeRate.gbpToPlnExchangeRate();
    }

}
