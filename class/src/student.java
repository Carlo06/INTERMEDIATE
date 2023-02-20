public class student {
    boolean enroll;
    int year;
    String school;
    double grade;

    boolean isStudying(boolean enroll, String school) {

        if (enroll == false || school == null){
            return false;

        }else{
            return true;
        }
    }

    boolean isPassed(Double grade){
        if (grade >= 75){
            return true;
        }else{
            return false;
        }
    }

    student(){
        enroll = false;
        year = 1;
        grade = 0;
    }
}
