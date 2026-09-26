package advanced_arrays.assignment_problems;

public class q4 {

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("TL-9");

        System.out.println(light.getColor());
        light.next();
        System.out.println(light.getColor());
        light.next();
        System.out.println(light.getColor());
        light.next();
        System.out.println(light.getColor());
    }
}