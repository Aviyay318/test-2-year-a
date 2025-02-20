public class Main {
    public static void main(String[] args) {
    }

 public static String maxMinor(Family[] families){
        int max = 0;
        String name="";
     for (int i = 0; i < families.length; i++) {
         if (families[i].howMuchMinor()>max){
             max  = families[i].howMuchMinor();
             name = families[i].getLastName();
         }
     }
     return name;
 }














    public static void printMaxSalary(Employee[] employees){
        float max  = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
           if (employees[i].calculateSalary()>max){
               max = employees[i].calculateSalary();
             index = i;
           }
           employees[index].printName();
            System.out.println(employees[index].calculateSalary());
        }
    }
}