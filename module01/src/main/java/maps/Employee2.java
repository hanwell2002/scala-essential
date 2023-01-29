package maps;

public class Employee2 {

    private static String name = "Jobs";

    private String depName = "R&D";

    public static String getName() {
        return name;
    }

    public void showDepName(){

       System.out.println(this.depName);
    }

    public static void main(String[] args) {

        String bossName = Employee2.getName();
        //Employee2.showDepName();
        System.out.println(bossName);

        Employee2 emp = new Employee2();

        emp.showDepName();



    }

}


