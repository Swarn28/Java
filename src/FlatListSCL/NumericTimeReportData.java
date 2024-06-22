package FlatListSCL;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;


public class NumericTimeReportData extends CompoundReportField<Number, LocalDateTime> {

    static final int DEFAULT_NUM_DECIMALS = 2;


    public NumericTimeReportData(String header, String unit, DateTimeFormatter dtFormatter) {
        this(header, unit, dtFormatter, DEFAULT_NUM_DECIMALS);
    }

    public NumericTimeReportData(String header, String unit, DateTimeFormatter dtFormatter, int nDecimals) {
        super(header, getFormat1(unit, nDecimals), getFormat2(dtFormatter));
    }

    private static Function<Number, String> getFormat1(String unit, int nDecimals) {
        return NumericReportData.getFormat(nDecimals, unit);
    }

    private static Function<LocalDateTime, String> getFormat2(DateTimeFormatter dtFormatter) {
        return dtFormatter::format;
    }

}
