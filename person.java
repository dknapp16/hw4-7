public class person extends TaskAssigner {
    @Override
    String assignTask(String User, Integer Priority) {
        return super.assignTask(User, Priority);

    }
    public person(){
        System.out.println("person");
    }
}