package Lesson011;

public class UseAssingMass {
    static void show(int[] nums){ //Статичная функция для записи массива в консоль
        for (int s:nums){
            System.out.print("| "+s+" ");
        }
        System.out.print("|\n\n");
    }

    public static void main(String[] args) {
        int[] mass1 = {1,2,3,4,5,6,7,8,9};
        int[] mass2 = {11,22,33,44,55,66,77,88,99};
        System.out.println("Massive №1:");
        show(mass1);
        System.out.println("Massive №2:");
        show(mass2);
        System.out.println("---Assing Massive---\n");
        mass2 = mass1;
        mass2[0] = 9999;    //т.к. ссылки на массивы одинаковые, значение
        mass1[0] = 8888;    //применяет сразу в обоих массивах, но...
        System.out.println("Massive №1:");
        show(mass1);
        System.out.println("Massive №2:");
        mass2[0] = 7777;    //...можно вот так
        show(mass2);
    }
}
