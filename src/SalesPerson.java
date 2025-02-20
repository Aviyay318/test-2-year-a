public class SalesPerson extends Employee{
    private int salesSum;


    public float calculateSalary(){
        float salary = super.calculateSalary();
        salary+= (float) (salesSum*0.05);
        return salary;
    }

}
