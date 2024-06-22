package FlatListSCL;


import java.util.List;
import java.util.stream.Collectors;

public interface ReportRow {
    List<ReportField<?>> getReportFields();

    default List<String> getHeaderRow() {
        return getReportFields().stream()
                .map(ReportField::getHeader)
                .collect(Collectors.toList());
    }

    default List<String> getData() {
        return getReportFields().stream()
                .map(ReportField::getDataString)
                .collect(Collectors.toList());
    }

    default String getTitle() {
        return "";
    }

}
