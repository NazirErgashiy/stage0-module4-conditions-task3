package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        int originalSalary = salary;
        if (salary <= 0) {
            System.out.println("wrong input!");
        } else {

            if (salary <= 10000) {

                int salaryWithoutTaxes = salary / 100;
                salaryWithoutTaxes *= 15;
                originalSalary -= salaryWithoutTaxes;
                System.out.println((float) originalSalary);
            } else {
                if (salary <= 20000) {
                    int salaryWithoutTaxes = salary / 100;
                    salaryWithoutTaxes *= 18;
                    originalSalary -= salaryWithoutTaxes;
                    System.out.println((float) originalSalary);
                } else {
                    if (salary > 20000) {
                        int salaryWithoutTaxes = salary / 100;
                        salaryWithoutTaxes *= 20;
                        originalSalary -= salaryWithoutTaxes;
                        System.out.println((float) originalSalary);
                    }
                }
            }
        }
    }
}
