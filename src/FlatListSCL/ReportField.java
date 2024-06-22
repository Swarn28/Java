package FlatListSCL;

import java.util.function.Function;

public abstract class ReportField<T> {

    private final String header;
    private String dataString = "";
    private T data;
    private final Function<T, String> dataFormat;

    ReportField(String header, Function<T, String> format) {
        this.header = header;
        this.dataFormat = format;
    }

    public String getHeader() { return header; }
    public String getDataString() { return dataString; }
    public T getData() { return data; }

    public void setData(T t) {
        dataString = dataFormat.apply(t);
        this.data = t;
    }

}
