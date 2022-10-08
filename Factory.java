package Carros;

/**
 *
 */
public class Factory {
    public static void main(String [] args){
        Singleton CarroSingleton = Singleton.getInstance();
        
        Car car = CarroSingleton.makeRandomCar();
        
        System.out.println(car.name);
    }
}
