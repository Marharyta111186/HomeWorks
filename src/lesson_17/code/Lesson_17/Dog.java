package Lesson_17;

public class Dog {

    String name;
    int jumpHeight;
    int maxJumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }


    void whoAmI() {
        System.out.println(" Я пес по имени: " + name + " я умею прыгать на высоту " + jumpHeight + " sm! ");
    }

    void jump() {
        System.out.println("Я прыгаю !!");
    }
    void jump(int height) {
        System.out.println("Я перепрыгиваю барьер!!" + height+ " sm");
    }

    void getBarrier(int barrierHeight){ //
        if (barrierHeight <= maxJumpHeight && jumpHeight<barrierHeight ){
            while (jumpHeight < barrierHeight){
                training();
            }
        }
        if (jumpHeight>= barrierHeight){
            jump(barrierHeight);
        } else {
        System.out.println(" я не могу перепрыгнуть барьер высотой " + barrierHeight);
        }
        System.out.println("End get barrier. Текущий прыжок " + jumpHeight);
    }
    void training() {
        System.out.println("start training ");
        if (jumpHeight + 10 <= maxJumpHeight) {
            jumpHeight += 10;
            System.out.println("Я потренировался , высота прыжка теперь " + jumpHeight);
            whoAmI();
        } else {
            System.out.println("Больше тренироваться не могу! ");
        }
    }

}



