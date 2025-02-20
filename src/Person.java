public class Person {
    private String name;
    private int year;
    private boolean isMale;
public static final int CURRENT_YEAR =2025;


    public  boolean isMinor(){
        if ((CURRENT_YEAR - this.year)>=18){
            return false;
        }else {
            return true;
        }
    }

    public int getAge(){
        return (CURRENT_YEAR - this.year);
    }

    public boolean isMale(){
        return this.isMale;
    }


}
