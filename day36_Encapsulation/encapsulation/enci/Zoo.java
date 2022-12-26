package day36_Encapsulation.encapsulation.enci;

public class Zoo {
    public static void main(String[] args) {



        Dog dog1= new Dog();

        dog1.setInfo("max", "husky", 'f',"M","black");


         dog1.bark();
         dog1.eat();
         dog1.sleep();
         dog1.move();
         dog1.bark();

       Cat cat1= new Cat();
       cat1.setInfo("metin","ece",'f',"M","black");


        cat1.meow();
        cat1.stracting();



        Tiger tiger1= new Tiger();

        tiger1.setInfo("metin1","ece1",'f',"M","black");

tiger1.hunt();










    }
}
