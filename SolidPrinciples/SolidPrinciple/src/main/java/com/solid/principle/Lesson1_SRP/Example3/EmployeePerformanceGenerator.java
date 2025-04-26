package com.solid.principle.Lesson1_SRP.Example3;

import com.solid.principle.Lesson1_SRP.Example2.BetterCode.Employee;

/*
   Below example follows the single responsibility principle because a class has only one
   reason to change only when generate a report.
   It is another thing that below code is voilating some other principle
   If we judge this code with respect to SRP then it is good beacuse focus is only to genarate
   report what it generates why it generates we do not know
*/
public class EmployeePerformanceGenerator {

    public String generateReport(String reportType, Employee employee) {
        if (reportType.equals("PDF")) {
            return "Generating PDF report.";
        } else if (reportType.equals("Word")) {
            return "Generating Word report.";
        }
        return "Report type not supported.";
    }
}