package HomeWork_18;

import java.util.Arrays;

public class RubberArray {
    int[] array;

    public RubberArray(){ // конструктор
        this.array = new int[0];
    }

    public void add(int value){// добавление 1 элемента
        extractArray();
        array[array.length -1] = value;

    }

    public void add(int... ints){ //принимает произвольное количество аргументов типа инт
        for (int value : ints){
            add(value);
        }
    }

    public void extractArray(){ //расширение массива на одну ячейку
        array= Arrays.copyOf(array, array.length +1);
    }

    public void printArray(){ //вывести в консоль значение массива
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i<array.length -1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public int size(){ // количество элементов в массиве
        return array.length;
    }

    public int sumOfValues(){// сумма значений в массиве
        int sum = 0;
        for (int value:array){
            sum+=value;
        }
        return sum;
    }

    public int min(){// возвращаем Min значение из массива
        if (array.length ==0)return Integer.MIN_VALUE;

        int min = array[0];
        for (int value : array){
            if (value < min){
                min=value;
            }
        }
        return min;
    }

    public int max(){
        if (array.length ==0)return Integer.MAX_VALUE;// возвращаем Max значение из массива

        int max = array[0];
        for (int value : array){
            if (value > max){
                max=value;
            }
        }
        return max;
    }

    public int[] toArray(){// нужно создать КОПИЮ нашего массива и ее вернуть
        int[] result = new int[array.length];

        for (int i = 0; i < result.length; i++) {
            result[i]=array[i];
        }
        return result;
        //  или   return Arrays.copyOf(array,array.length);
    }

    public void deleteByIndex(int index){// удалить элемент массива по индексу
        if (array.length >= 1 && index >=0 && index<array.length ){

            int[] result = new int[array.length -1];

            for (int i = 0; i < result.length; i++) {
                if (i < index) {
                    result[i] = array[i];
                } else {// if (i >= index {
                    result[i]=array[i+1];
                }
            }
            //System.out.println("Result " + Arrays.toString(result));
            array=result;

        }

    }

    public RubberArray (int[] arr){// новый RubberArray принимающий в себя обычный массив и создающий RubberArray с такими же значениями
        this();
        add(arr);
    }

    public int searchByValue (int value){ //поиск по значению. Возвращаем индекс
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) return i;
        }
        return -1;
    }

    public void deleteByValue(int[] arr , int value){// удаление элемента по значению
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value){
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value){
                newArr [index] =arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }

    public void changeByIndex(int index, int value){//Замена значения по индексу (есть индекс и новое значение)
        array[index] = value;
    }

    public void changeByValue(int value, int newValue){//Замена значения по значению (есть старое и новое значение)
        int index = searchByValue(value);
        changeByIndex(index,newValue);
    }




}

/*

        Удаление элемента по значению
        Замена значения по индексу (есть индекс и новое значение)
        Замена значения по значению (есть старое и новое значение)

 */
