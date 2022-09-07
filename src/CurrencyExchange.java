public abstract class CurrencyExchange {
    public abstract makeExchange(){}
}

public class ToUsd extends CurrencyExchange{

}

public class ToCny extends CurrencyExchange{

}

public class ExchangeCenter{
    public static CurrencyExchange makeExchange(String currencyType){
        if("ToUsd".equals(currencyType)){
            return new ToUsd();
        }
        if("ToCny".equals(currencyType)){
            return new ToCny();
        }
    }
}
