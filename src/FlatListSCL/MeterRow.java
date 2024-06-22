package FlatListSCL;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

//import static com.landisgyr.aga.delivery.report.data.TrLoadReport.FORMATTER;

public class MeterRow implements ReportRow {

    static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");

    private final MeterRowTitle meterRowTitle;
    StringReportData meterId;
    StringReportData servicePoint;
    StringReportData active;
    StringReportData address;
    NumericReportData serviceVoltage;
    StringReportData phaseCode;
    NumericReportData peakKw;
    TimeReportData peakTime;
    NumericReportData meterPeak;
    TimeReportData meterPeakTime;
    NumericReportData peak1HrKw;
    NumericReportData peak3HrKw;
    NumericReportData peakContributionKw;
    NumericReportData peakContributionPercent;
    NumericReportData kvarhTotal;
    NumericReportData totalKWh;

    public MeterRow setMeterId(String meterId) {
        this.meterId.setData(meterId);
        return this;
    }

    public MeterRow setServicePoint(String servicePoint) {
        this.servicePoint.setData(servicePoint);
        return this;
    }

    public MeterRow setActive(String active) {
        this.active.setData(active);
        return this;
    }

    public MeterRow setAddress(String address, String city, String zip) {
        this.address.setData(address + " " + city + " " + zip);
        return this;
    }

    public MeterRow setServiceVoltage(double voltage) {
        this.serviceVoltage.setData(voltage);
        return this;
    }

    public MeterRow setPhaseCode(String phaseCode) {
        this.phaseCode.setData(phaseCode);
        return this;
    }

    public MeterRow setCalcPeak(double peakKw) {
        this.peakKw.setData(peakKw);
        return this;
    }

    public MeterRow setCalcPeakTime(LocalDateTime calcPeakTime) {
        this.peakTime.setData(calcPeakTime);
        return this;
    }

    public MeterRow setMeterPeak(double meterPeak) {
        this.meterPeak.setData(meterPeak);
        return this;
    }

    public MeterRow setMeterPeakTime(LocalDateTime meterPeakTime) {
        this.meterPeakTime.setData(meterPeakTime);
        return this;
    }

    public MeterRow setPeak1Hr(double peak1Hr) {
        this.peak1HrKw.setData(peak1Hr);
        return this;
    }

    public MeterRow setPeak3Hr(double peak3Hr) {
        this.peak3HrKw.setData(peak3Hr);
        return this;
    }

    public MeterRow setPeakContribution(double contribution) {
        this.peakContributionKw.setData(contribution);
        return this;
    }

    public MeterRow setPeakContributionPercent(double percent) {
        this.peakContributionPercent.setData(percent);
        return this;
    }

    public MeterRow setTotalKvarh(double kvarh) {
        this.kvarhTotal.setData(kvarh);
        return this;
    }

    public MeterRow setTotalKwh(double totalKwh) {
        this.totalKWh.setData(totalKwh);
        return this;
    }

    public MeterRow(MeterRowTitle meterRowTitle) {
        this.meterRowTitle = meterRowTitle;
        meterId = new StringReportData("Meter Id");
        servicePoint = new StringReportData("Service Point Id");
        active = new StringReportData("Active");
        address = new StringReportData("Address");
        serviceVoltage = new NumericReportData("Service Voltage", "V", 0);
        phaseCode = new StringReportData("Meter Phase");
        peakKw = new NumericReportData("Calculated Peak [kW]");
        peakTime = new TimeReportData("Calculated Peak Timestamp", FORMATTER);
        meterPeak = new NumericReportData("Metered Peak [kw]");
        meterPeakTime = new TimeReportData("Metered Peak Timestamp", FORMATTER);
        peak1HrKw = new NumericReportData("1hr Peak [kW]");
        peak3HrKw = new NumericReportData("3hr Peak [kW]");
        peakContributionKw = new NumericReportData("Peak Demand Contribution [kW]");
        peakContributionPercent = new NumericReportData("Peak Demand Contribution [%]");
        kvarhTotal = new NumericReportData("Total kVARh");
        totalKWh = new NumericReportData("Total kWH");
    }

    private List<ReportField<?>> reportFields = null;

    private void fillReportFields() {
        reportFields = Arrays.asList(
                meterId,
                address,
                active,
                serviceVoltage,
                phaseCode,
                peakKw,
                peakTime,
                meterPeak,
                meterPeakTime,
                peak1HrKw,
                peak3HrKw,
                peakContributionKw,
                peakContributionPercent,
                kvarhTotal,
                totalKWh
        );
    }

    @Override
    public List<ReportField<?>> getReportFields() {
        if (reportFields == null) {
            fillReportFields();
        }
        return reportFields;
    }

    @Override
    public String getTitle() {
        return meterRowTitle.getTitle();
    }

    public MeterRowTitle getMeterRowTitle() {
        return meterRowTitle;
    }

    public StringReportData getMeterId() {
        return meterId;
    }

    public StringReportData getServicePoint() {
        return servicePoint;
    }

    public StringReportData getActive() {
        return active;
    }

    public StringReportData getAddress() {
        return address;
    }

    public NumericReportData getServiceVoltage() {
        return serviceVoltage;
    }

    public StringReportData getPhaseCode() {
        return phaseCode;
    }

    public NumericReportData getPeakKw() {
        return peakKw;
    }

    public TimeReportData getPeakTime() {
        return peakTime;
    }

    public NumericReportData getMeterPeak() {
        return meterPeak;
    }

    public TimeReportData getMeterPeakTime() {
        return meterPeakTime;
    }

    public NumericReportData getPeak1HrKw() {
        return peak1HrKw;
    }

    public NumericReportData getPeak3HrKw() {
        return peak3HrKw;
    }

    public NumericReportData getPeakContributionKw() {
        return peakContributionKw;
    }

    public NumericReportData getPeakContributionPercent() {
        return peakContributionPercent;
    }

    public NumericReportData getKvarhTotal() {
        return kvarhTotal;
    }

    public NumericReportData getTotalKWh() {
        return totalKWh;
    }
}
