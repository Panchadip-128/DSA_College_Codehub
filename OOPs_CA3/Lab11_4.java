package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

class Employee {
    private String name;
    private int empID;
    private String designation;
    private double basicPay;
    private double DA;
    private double HRA;
    private double PF;
    private double LIC;
    private double netSalary;

    public Employee(String name, int empID, String designation, double basicPay, double LIC) {
        this.name = name;
        this.empID = empID;
        this.designation = designation;
        this.basicPay = basicPay;
        this.LIC = LIC;
        this.DA = 0.40 * basicPay;
        this.HRA = 0.15 * basicPay;
        this.PF = 0.12 * basicPay;
        this.netSalary = basicPay + DA + HRA - (PF + LIC);
    }

    public String getDetails() {
        return "Name: " + name + "\n" +
               "EmpID: " + empID + "\n" +
               "Designation: " + designation + "\n" +
               "Basic Pay: " + basicPay + "\n" +
               "DA: " + DA + "\n" +
               "HRA: " + HRA + "\n" +
               "PF: " + PF + "\n" +
               "LIC: " + LIC + "\n" +
               "Net Salary: " + netSalary;
    }
}

public class Lab11_4 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Employee employee = new Employee("John Doe", 101, "Software Engineer", 50000, 500);

        Label employeeDetailsLabel = new Label(employee.getDetails());

        VBox vbox = new VBox(10);
        vbox.getChildren().add(employeeDetailsLabel);

        Scene scene = new Scene(vbox, 300, 300);
        primaryStage.setTitle("Employee Information");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
