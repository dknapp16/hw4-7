public class Runner {


    public static void main(String[] args) {

        System.out.println("Starting runner...");


        email emailTaskAssigner = new email();

        phonr phoneTaskAssigner = new phonr();

        person personTaskAssigner = new person();


        TaskAssigner taskAssigner = new TaskAssigner();

        System.out.println(emailTaskAssigner.assignTask("David", 25));


    }

}