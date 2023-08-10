package HomeWork_18;

import java.util.Arrays;

public class HW_Array_18 {
    public static void main(String[] args) {


        int[] array2 = { 1, 2, 3, 4, 5};
        RubberArray myArray = new RubberArray(array2);

        System.out.println("Добавление 1 элемента: ");
        myArray.add(45);
        myArray.printArray();
        System.out.println("===========================================================");

        System.out.println("Добавление произвольного количества аргументов типа int ");
        myArray.add(35, 66,99);
        myArray.printArray();
        System.out.println("===========================================================");


        System.out.println("Расширение массива на одну ячейку ");
        myArray.extractArray();
        myArray.printArray();
        System.out.println("===========================================================");

        System.out.println("Количество элементов в массиве: ");
        int arrSize = myArray.size();
        System.out.println("Сейчас в массиве " + arrSize + " элементов");
        System.out.println("===========================================================");


        System.out.println("Сумма значений элементов массива = " + myArray.sumOfValues());
        System.out.println("===========================================================");


        System.out.println("Min в массиве: " + myArray.min());
        System.out.println("Max в массиве: " + myArray.max());
        System.out.println("===========================================================");

        System.out.println("Нужно создать КОПИЮ нашего массива и ее вернуть ");
        myArray.printArray();
        int[] newArray = myArray.toArray();
        newArray[1] = 130;
        System.out.println(Arrays.toString(newArray));
        System.out.println("===========================================================");

        System.out.println("Удалить элемент массива по индексу");
        myArray.deleteByIndex(9);
        myArray.printArray();
        System.out.println("===========================================================");

        System.out.println("Удалние элемента по значению ");
        System.out.println("Текущий массив: " + Arrays.toString(array2));
        System.out.print("Новый массив: " );
        myArray.deleteByValue(array2,5);
        System.out.println("===========================================================");

        System.out.println("Поиск элемента по значению");
        System.out.println("Элемент в массиве имеет индекс: "+ myArray.searchByValue(4));
        System.out.println("===========================================================");

        System.out.println("Новый RubberArray ");//новый RubberArray принимающий в себя обычный массив и создающий RubberArray с такими же значениями
        RubberArray rubberArray = new RubberArray(array2);
        rubberArray.printArray();
        System.out.println("===========================================================");

        System.out.println("Замена значения по индексу (есть индекс и новое значение)");
        myArray.changeByIndex(2,25);
        myArray.printArray();
        System.out.println("===========================================================");

        System.out.println("Замена значения по значению (есть старое и новое значение)");
        myArray.changeByValue(5,60);
        myArray.printArray();







    }
}
