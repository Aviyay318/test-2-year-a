public class Family {
    private String lastName;
    private Person[] familyMembers;


    public String getLastName(){
        return this.lastName;
    }

    public int howMuchMinor(){
        int count =0;
        for (int i = 0; i < this.familyMembers.length; i++) {
            if (this.familyMembers[i].isMinor()){
                count++;
            }
        }
        return count;
    }

    public   boolean isLargeFamily(){
       int count = howMuchMinor();
        if (count>=3){
            return true;
        }else {
            return false;
        }
    }

public  double calculateAverageAge(boolean male){
int sum = 0;
int count = 0;
    for (int i = 0; i < this.familyMembers.length; i++) {
        if (this.familyMembers[i].isMale()==male){
            sum+=this.familyMembers[i].getAge();
            count++;
        }
    }

    return (double)sum/count;
}


}
