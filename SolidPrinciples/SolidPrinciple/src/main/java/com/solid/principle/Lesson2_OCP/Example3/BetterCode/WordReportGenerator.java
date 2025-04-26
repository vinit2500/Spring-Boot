package com.solid.principle.Lesson2_OCP.Example3.BetterCode;

public class WordReportGenerator implements ReportGenerator{
    @Override
    public String generate() {
        return "Word Report";
    }
}
