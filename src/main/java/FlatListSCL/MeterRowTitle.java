package FlatListSCL;

public enum MeterRowTitle {
    SINGLE_PHASE("Single Phase Connected Meters"),
    TWO_PHASE("Two Phase Connected Meters"),
    THREE_PHASE("Three Phase Connected Meters");

    private String title;

    MeterRowTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static MeterRowTitle fromCount(int count) {
        if (count == 1) {
            return SINGLE_PHASE;
        } else if (count == 2) {
            return TWO_PHASE;
        } else {
            return THREE_PHASE;
        }
    }

}
