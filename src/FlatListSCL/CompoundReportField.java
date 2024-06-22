package FlatListSCL;

import java.util.function.Function;

public abstract class CompoundReportField<T1, T2> extends ReportField<T1> {

    private String dataString2 = "N/A";
    private T2 data2;
    private final Function<T2, String> dataFormat2;

    public CompoundReportField(String header, Function<T1, String> format1, Function<T2, String> format2) {
        super(header, format1);
        this.dataFormat2 = format2;
    }

    public String getDataString2() { return dataString2; }
    public T2 getData2() { return data2; }

    public void setData2(T2 t) {
        if (t != null) {
            dataString2 = dataFormat2.apply(t);
            data2 = t;
        }
    }

}
