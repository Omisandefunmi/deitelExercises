package tddClass;

public class Television {
    private boolean isOn;
    private int volume = 0;
    private boolean isMute;

    public boolean power() {
        isOn = !isOn;
        return isOn;
    }

    public int getVolume(){
        return volume;
    }

    public int increaseVolume() {
        if(volume <= 10)
        return volume++;
        else if (isMute)
            return volume = 0;

        else
            return volume = 10;
    }

    public int decreaseVolume() {
        if (volume > 0)
        return volume--;

        else
            return volume = 0;


    }
    public boolean isMute(){
        return isMute;

    }

    public boolean toggleMute() {
        isMute = !isMute;
        volume = 0;
        return isMute;

    }
}
