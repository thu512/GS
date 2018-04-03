public class Single {
    private String name = "이창주";
    private static Single single = new Single();
    private Single(){}
    public static Single getInstance(){
        return single;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
