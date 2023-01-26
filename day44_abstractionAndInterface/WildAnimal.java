package day44_abstractionAndInterface;

public interface WildAnimal {


    boolean isWild= true;// static and final by default


    default void hunt() {

    }


}
