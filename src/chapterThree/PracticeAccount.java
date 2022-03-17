package chapterThree;

public class PracticeAccount {

    private String name;

    public PracticeAccount (String name){
        this.name = name; //This is a constructor. It has only one parameter i.e name
    }

    public void setName(String name){
        this.name = name; //This is a mutator. it allows user to update name
    }

    public String getName(){
        return name; //This is an accessor. it allows user to get name
    }
}
