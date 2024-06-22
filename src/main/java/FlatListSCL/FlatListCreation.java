package FlatListSCL;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class FlatListCreation {

    List<List<MeterRow>> meterList = new ArrayList<>();
    List<MeterRow> meterRowList1 = new ArrayList<>();
    List<MeterRow> meterRowList2 = new ArrayList<>();
    List<MeterRow> meterRowList3 = new ArrayList<>();
    List<MeterRow> meterRowList4 = new ArrayList<>();


    public List<List<MeterRow>> setup(){
        MeterRow mr1 = getTestMeterRow(MeterRowTitle.SINGLE_PHASE);
        MeterRow mr2 = getTestMeterRow2();
        MeterRow mr3 = getTestMeterRow3();
        meterRowList1.add(mr1);
        meterRowList1.add(mr2);
        meterRowList1.add(mr3);

        MeterRow mr4 = getTestMeterRow4();
        meterRowList2.add(mr4);

        MeterRow mr5 = getTestMeterRow5(MeterRowTitle.SINGLE_PHASE);
        MeterRow mr6 = getTestMeterRow6();
        meterRowList3.add(mr5);
        meterRowList3.add(mr6);

        MeterRow mr7 = getTestMeterRow7();
        MeterRow mr8 = getTestMeterRow8();
        meterRowList4.add(mr7);
        meterRowList4.add(mr8);

        meterList.add(meterRowList1);
        meterList.add(meterRowList2);
        meterList.add(meterRowList3);
        meterList.add(meterRowList4);


        return meterList;
    }

    public static MeterRow getTestMeterRow(MeterRowTitle title) {
        LocalDateTime ldt = LocalDate.now().atStartOfDay()
                .plusHours(15)
                .minusDays(5);
        LocalDateTime ldt2 = ldt.plusHours(1);

        return new MeterRow(title)
                .setMeterId("2019492")
                .setServicePoint("SP-311776")
                .setActive("Y")
                .setAddress("124 ABC Street", "Seattle", "98118-6129")
                .setServiceVoltage(240)
                .setPhaseCode("A")
                .setCalcPeak(1.204)
                .setCalcPeakTime(ldt)
                .setMeterPeak(1.2)
                .setMeterPeakTime(ldt2)
                .setPeak1Hr(1.5)
                .setPeak3Hr(1.2)
                .setPeakContribution(0.98)
                .setPeakContributionPercent(0.13)
                .setTotalKvarh(12)
                .setTotalKwh(196);
    }

    public static MeterRow getTestMeterRow2() {
        LocalDateTime ldt = LocalDate.now().atStartOfDay()
                .plusHours(15)
                .minusDays(5);
        LocalDateTime ldt2 = ldt.plusHours(1);

        return new MeterRow(MeterRowTitle.SINGLE_PHASE)
                .setMeterId("2019492")
                .setServicePoint("SP-311776")
                .setActive("Y")
                .setAddress("125 ABC Street", "Seattle", "98118-6129")
                .setServiceVoltage(240)
                .setPhaseCode("A")
                .setCalcPeak(1.204)
                .setCalcPeakTime(ldt)
                .setMeterPeak(1.2)
                .setMeterPeakTime(ldt2)
                .setPeak1Hr(1.5)
                .setPeak3Hr(1.2)
                .setPeakContribution(0.98)
                .setPeakContributionPercent(0.13)
                .setTotalKvarh(12.5)
                .setTotalKwh(196);
    }

    public static MeterRow getTestMeterRow3() {
        LocalDateTime ldt = LocalDate.now().atStartOfDay()
                .plusHours(15)
                .minusDays(5);
        LocalDateTime ldt2 = ldt.plusHours(1);

        return new MeterRow(MeterRowTitle.SINGLE_PHASE)
                .setMeterId("2019492")
                .setServicePoint("SP-311776")
                .setActive("Y")
                .setAddress("128 ABC Street", "Seattle", "98118-6129")
                .setServiceVoltage(240)
                .setPhaseCode("A")
                .setCalcPeak(1.204)
                .setCalcPeakTime(ldt)
                .setMeterPeak(1.2)
                .setMeterPeakTime(ldt2)
                .setPeak1Hr(1.5)
                .setPeak3Hr(1.2)
                .setPeakContribution(0.98)
                .setPeakContributionPercent(0.13)
                .setTotalKvarh(12.5)
                .setTotalKwh(196);
    }

    public static MeterRow getTestMeterRow4() {
        LocalDateTime ldt = LocalDate.now().atStartOfDay()
                .plusHours(15)
                .minusDays(5);
        LocalDateTime ldt2 = ldt.plusHours(1);

        return new MeterRow(MeterRowTitle.SINGLE_PHASE)
                .setMeterId("2019492")
                .setServicePoint("SP-311776")
                .setActive("Y")
                .setAddress("128 ABC Street", "Seattle", "98118-6129")
                .setServiceVoltage(240)
                .setPhaseCode("A")
                .setCalcPeak(1.204)
                .setCalcPeakTime(ldt)
                .setMeterPeak(1.2)
                .setMeterPeakTime(ldt2)
                .setPeak1Hr(1.5)
                .setPeak3Hr(1.2)
                .setPeakContribution(0.98)
                .setPeakContributionPercent(0.13)
                .setTotalKvarh(12.5)
                .setTotalKwh(196);
    }


    //Meter 2

    public static MeterRow getTestMeterRow5(MeterRowTitle title) {
        LocalDateTime ldt = LocalDate.now().atStartOfDay()
                .plusHours(15)
                .minusDays(5);
        LocalDateTime ldt2 = ldt.plusHours(1);

        return new MeterRow(title)
                .setMeterId("2019492")
                .setServicePoint("SP-311776")
                .setActive("Y")
                .setAddress("124 ABED Street", "Seattle", "98118-6129")
                .setServiceVoltage(240)
                .setPhaseCode("A")
                .setCalcPeak(1.204)
                .setCalcPeakTime(ldt)
                .setMeterPeak(1.2)
                .setMeterPeakTime(ldt2)
                .setPeak1Hr(1.5)
                .setPeak3Hr(1.2)
                .setPeakContribution(0.98)
                .setPeakContributionPercent(0.13)
                .setTotalKvarh(12)
                .setTotalKwh(196);
    }

    public static MeterRow getTestMeterRow6() {
        LocalDateTime ldt = LocalDate.now().atStartOfDay()
                .plusHours(15)
                .minusDays(5);
        LocalDateTime ldt2 = ldt.plusHours(1);

        return new MeterRow(MeterRowTitle.SINGLE_PHASE)
                .setMeterId("2019492")
                .setServicePoint("SP-311776")
                .setActive("Y")
                .setAddress("121 ABC Street", "Seattle", "98118-6129")
                .setServiceVoltage(240)
                .setPhaseCode("A")
                .setCalcPeak(1.204)
                .setCalcPeakTime(ldt)
                .setMeterPeak(1.2)
                .setMeterPeakTime(ldt2)
                .setPeak1Hr(1.5)
                .setPeak3Hr(1.2)
                .setPeakContribution(0.98)
                .setPeakContributionPercent(0.13)
                .setTotalKvarh(12.5)
                .setTotalKwh(196);
    }

    public static MeterRow getTestMeterRow7() {
        LocalDateTime ldt = LocalDate.now().atStartOfDay()
                .plusHours(15)
                .minusDays(5);
        LocalDateTime ldt2 = ldt.plusHours(1);

        return new MeterRow(MeterRowTitle.SINGLE_PHASE)
                .setMeterId("2019492")
                .setServicePoint("SP-311776")
                .setActive("Y")
                .setAddress("129 ABC Street", "Seattle", "98118-6129")
                .setServiceVoltage(240)
                .setPhaseCode("A")
                .setCalcPeak(1.204)
                .setCalcPeakTime(ldt)
                .setMeterPeak(1.2)
                .setMeterPeakTime(ldt2)
                .setPeak1Hr(1.5)
                .setPeak3Hr(1.2)
                .setPeakContribution(0.98)
                .setPeakContributionPercent(0.13)
                .setTotalKvarh(12.5)
                .setTotalKwh(196);
    }

    public static MeterRow getTestMeterRow8() {
        LocalDateTime ldt = LocalDate.now().atStartOfDay()
                .plusHours(15)
                .minusDays(5);
        LocalDateTime ldt2 = ldt.plusHours(1);

        return new MeterRow(MeterRowTitle.SINGLE_PHASE)
                .setMeterId("2019492")
                .setServicePoint("SP-311776")
                .setActive("Y")
                .setAddress("126 ABC Street", "Seattle", "98118-6129")
                .setServiceVoltage(240)
                .setPhaseCode("A")
                .setCalcPeak(1.204)
                .setCalcPeakTime(ldt)
                .setMeterPeak(1.2)
                .setMeterPeakTime(ldt2)
                .setPeak1Hr(1.5)
                .setPeak3Hr(1.2)
                .setPeakContribution(0.98)
                .setPeakContributionPercent(0.13)
                .setTotalKvarh(12.5)
                .setTotalKwh(196);
    }
}
