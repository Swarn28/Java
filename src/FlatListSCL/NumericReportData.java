package FlatListSCL;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.stream.IntStream;

public class NumericReportData extends ReportField<Number>{

    static final int DEFAULT_NUM_DECIMALS = 2;

    public NumericReportData(String header) {
        this(header, "", DEFAULT_NUM_DECIMALS);
    }

    public NumericReportData(String header, String unit) {
        this(header, unit, DEFAULT_NUM_DECIMALS);
    }

    public NumericReportData(String header, String unit, int nDecimals) {
        super(header, getFormat(nDecimals, unit));
    }

    static String getFormatString(int nDecimals) {
        StringBuilder sb = new StringBuilder("#0");
        if (nDecimals > 0) {
            sb.append(".");
            IntStream.range(0, nDecimals)
                    .forEach(n -> sb.append("0"));
        }
        return sb.toString();
    }

    static Function<Number, String> getFormat(int nDecimals, String unit) {
        DecimalFormat df = new DecimalFormat(getFormatString(nDecimals));
        return n -> {
            String sUnit = "";
            if (!unit.isEmpty()) {
                sUnit = unit;
            }
            return df.format(n) + sUnit;
        };
    }

}
