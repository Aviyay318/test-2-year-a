public class Manager extends Employee{
    private float bonusPercent;


public float calculateSalary(){
 float salary = super.calculateSalary();
 salary+= salary*(this.bonusPercent/100);
 return salary;

}
}