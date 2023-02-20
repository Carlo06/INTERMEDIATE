public class App {
    public static void main(String[] args) throws Exception {
        // student carlo = new student();
        // System.out.println(carlo.grade = Math.random()*100);

        // if(carlo.isPassed(carlo.grade)){
        //     System.out.println("The student has passed");

        // }else{
        //     System.out.println("The student is failed");
        // }
        // carlo.enroll = true;
        // carlo.school = "National University";
        // System.out.println(carlo.isStudying(carlo.enroll, carlo.school));



        student Palatino = new student();
        Palatino.enroll = true;
        Palatino.year = 2;
        Palatino.grade = 80.0;
        Palatino.school = "Marriot";

        System.out.println(Palatino.isStudying(Palatino.enroll, Palatino.school));
        System.out.println(Palatino.isPassed(Palatino.grade));
        System.out.println(Palatino.year);
    }
}
