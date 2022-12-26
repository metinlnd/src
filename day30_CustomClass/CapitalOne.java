package day30_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        Employee employee3 = new Employee();
        Employee employee4 = new Employee();

        Employee employee5 = new Employee();
        employee1.setInfo("john", 2214, 'M', "DEVELEOPERE", 25000, true);
        employee2.setInfo("metin", 2245, 'M', "SDET", 20000, false);
        employee3.setInfo("ali", 1245, 'M', "MANAGER", 240000, false);
        employee4.setInfo("ayse", 4578, 'F', "Senior manager", 340000, true);
        employee5.setInfo("osman", 5858, 'M', "QA", 50000, true);


        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        int countfulltime = 0;
        int coutpartime = 0;
        double max = employees[0].salaary;
        double min = employees[0].salaary;




        for (Employee each: employees ) {
            if (each.isFulltimeorParttime) {
                countfulltime++;
            } else {
                coutpartime++;
            }

            if (each.salaary > max) {
                max = each.salaary;
            }

            if (each.salaary < max) {
                min = each.salaary;
            }




        }System.out.println(max);

        System.out.println(min);


    }
}