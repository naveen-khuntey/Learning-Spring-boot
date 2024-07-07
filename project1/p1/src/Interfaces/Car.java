package Interfaces;

public class Car implements Engine, Brake{

    @Override
    public void brake() {
        System.out.println("brakes");
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void acc() {
        System.out.println("accelerate");
    }
}
