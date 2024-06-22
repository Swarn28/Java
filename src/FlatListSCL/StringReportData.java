package FlatListSCL;

import java.util.function.Function;

public class StringReportData extends ReportField<String> {
    public StringReportData(String header) {
        super(header, Function.identity());
    }


}
