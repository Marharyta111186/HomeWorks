package Lesson_17;

import Lesson_17.Dog;

public class HW_17_mainDog  {
    public static void main(String[] args) {

        Dog dog = new Dog("Jack",50);
        dog.whoAmI();

        int[] hurdle = {30, 50, 45, 55, 60, 90, 120, 180, 100, 130};
        int successfulJumps = 0;

        for (int hurdleHeight : hurdle){
            System.out.println("\nПрепятствие высотой "+ hurdleHeight + " см");
            dog.getBarrier(hurdleHeight);
            if (dog.jumpHeight >= hurdleHeight){
                successfulJumps++;
            }
        }
        System.out.println("\nПес " + dog.name + " успешно перепрыгнул " +successfulJumps+ " препядствий!");

    }


}
