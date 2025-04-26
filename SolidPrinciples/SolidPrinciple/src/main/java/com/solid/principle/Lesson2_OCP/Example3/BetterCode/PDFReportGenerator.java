package com.solid.principle.Lesson2_OCP.Example3.BetterCode;

public class PDFReportGenerator implements ReportGenerator{
    @Override
    public String generate() {
        return "PDF Report";
    }
}
