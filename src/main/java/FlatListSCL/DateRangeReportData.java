package FlatListSCL;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class DateRangeReportData extends CompoundReportField<LocalDateTime, LocalDateTime> {
    public DateRangeReportData(String header, DateTimeFormatter formatter) {
        super(header, getDateFormat(formatter), getDateFormat(formatter));
    }

    private static Function<LocalDateTime, String> getDateFormat(DateTimeFormatter formatter) {
        return formatter::format;
    }

}
