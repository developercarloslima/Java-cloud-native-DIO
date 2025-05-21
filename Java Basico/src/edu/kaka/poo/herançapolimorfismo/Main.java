package edu.kaka.poo.herançapolimorfismo;

public class Main {

    public static void main(String[] args) {

    }

    public static void printEmployer(Employer employer) {

       System.out.printf("===============\n", employer.getClass().getCanonicalName());
       switch (employer){
           case Manager manager ->{
               manager.setCode("2216");
               manager.setLogin("Charles");
               manager.setPassword("1315");
               manager.setSalary(5000.00);
           }
           case Salesman salesman -> {
               salesman.setCode("3325");
               salesman.setName("Robert");
               salesman.setAge(18);
               salesman.setPercentForSale(0.10);
               salesman.setSalary(3500.00);
           }

       }

    }
}
