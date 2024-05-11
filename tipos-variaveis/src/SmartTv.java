public class SmartTv {

    boolean turnedOn = false;
    int channel = 1;
    int volume = 25;

    public void turnOn(){
        turnedOn = true;
    }

    public void turnOff(){
        turnedOn = false;
    }

    public void increaseOneVolume(){
        if(turnedOn){
            volume++;
        }
    }

    public void decreaseOneVolume(){
        if(turnedOn){
            volume--;
        }
    }

    public void changeVolume(int newVolume){
        if(turnedOn && volume <= 100 && volume >= 0){
            volume = newVolume;
        }
    }

    public void increaseChannel(){
        channel++;
    }

    public void decreaseChannel(){
        channel--;
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
    }
    
}
