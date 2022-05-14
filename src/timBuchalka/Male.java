package timBuchalka;

public class Male extends Human{

    public static void main(String[] args) {
        Male male = new Male();
        male.ownName();

    }

    public Male() {
        super("errrrrrw", "jdsjnk");
        System.out.println("Male is created");

    }

    @Override
    public void ownName(){
        super.ownName();
        System.out.println("This is my name.");

    }




}
