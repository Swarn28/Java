package FlatListSCL;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class TimeReportData extends ReportField<LocalDateTime> {
    public TimeReportData(String header, DateTimeFormatter dtFormatter) {
        super(header, getFormat(dtFormatter));
    }

    private static Function<LocalDateTime, String> getFormat(DateTimeFormatter dtFormatter) {
        return dtFormatter::format;
    }

}
