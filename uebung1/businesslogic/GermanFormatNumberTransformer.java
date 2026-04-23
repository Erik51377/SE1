package uebung1.businesslogic;

import java.text.DecimalFormat;

public class GermanFormatNumberTransformer implements NumberTransformer{

    @Override
    public String transformNumber(int number) {
        DecimalFormat df = new DecimalFormat("#.##0");

        return df.format(number);
    }

    @Override
    public String getTransformerType() {
        return "Transformer für deutsche Zahlenformatierungen";
    }
    
}
