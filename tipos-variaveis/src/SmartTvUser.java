
public class SmartTvUser {
    public static void main (String [] args) throws Exception{

        SmartTv smartTv = new SmartTv();
        System.out.println("Is turned on? " + smartTv.turnedOn);
        System.out.println("Current Channel: " + smartTv.volume);
        System.out.println("Current volume: " + smartTv.channel);
        
        smartTv.turnOn();
        System.out.println("Turned on? " + smartTv.turnedOn);

        smartTv.turnOff();
        System.out.println("Turned on? " + smartTv.turnedOn);

        smartTv.turnOn();

        smartTv.increaseOneVolume();
        smartTv.increaseOneVolume();
        smartTv.increaseOneVolume();
        smartTv.increaseOneVolume();
        smartTv.increaseOneVolume(); // 30

        smartTv.decreaseOneVolume();
        smartTv.decreaseOneVolume();
        smartTv.decreaseOneVolume();
        smartTv.decreaseOneVolume();
        smartTv.decreaseOneVolume(); //25
        System.out.println("Volume: " + smartTv.volume);

        smartTv.changeVolume(78);
        System.out.println("Volume: " + smartTv.volume); //78

        smartTv.increaseChannel();
        System.out.println("Volume: " + smartTv.channel); //2

        smartTv.decreaseChannel();
        System.out.println("Volume: " + smartTv.channel); //1

        smartTv.changeChannel(72); //72
        System.out.println("Volume: " + smartTv.channel);


    }


    
}