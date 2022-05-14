package chapter8;

public enum People {
    WORM("Taiwo"),
    DEJI(),
    BUNMI("Love", "Shade");

    private String [] girlFriendName;

    People (String name){
        girlFriendName = new String [0];
    }

    People(String...names){
        girlFriendName = names;
    }

    public String [] getGirlFriendName(){
        return girlFriendName;
    }

    public void greetGirlFriend(){
        for (String girlFriend: girlFriendName) {
            System.out.println("Hello "+ girlFriendName);

        }
    }

    public String toString(){
        switch (this){
            case DEJI : return "Deji";
            case WORM: return "Worm";
            case BUNMI: return "Bunmi";
            default: return null;
        }
    }
}
