public class leapyear {
    void leap(int year){
        if(year%400==0){
            System.out.println("It is a leap year");
        }
        else if (year%400==0) {
            System.out.println("It is not a leap year");
            
        } else if(year%4==0) {
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("It is not a leap year");
        }

    }


    public static void main(String[] args) {
        int year = 2024;
        leapyear worker = new leapyear();
        worker.leap(year);
    }
    
}
