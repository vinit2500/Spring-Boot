package com.solid.principle.Lesson2_OCP.Example3.ProblematicCode;

public class ReportGenerator {

    public String generateReport(String reportType) {
        if(reportType.equals("PDF")) {
            return "Genarating PDF report";
        }
        else if(reportType.equals("Word")) {
            return "Generating Word report";
        }
        return "Report type not supported";
    }
}
