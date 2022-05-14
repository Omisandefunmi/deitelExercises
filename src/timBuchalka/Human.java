package timBuchalka;

public class Human {
    private String move;

    public String getName() {
        return name;
    }

    private String name;

    public Human(String move, String breathe) {
        this.move = move;
        this.breathe = breathe;
    }

    public void ownName(){
        System.out.println("my name is "+name);
    }
    private String breathe;
}
