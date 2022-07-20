package Lesson001;

class MyClass {
    private static int count = 0;
    private String name;
    private int number;

    MyClass(String n) {
        count++;
        name = n;
        number = count;
        System.out.println("Создан объектом под именем: " + name);
    }

    public void show() {
        System.out.println("Имя объекта - " + name);
        System.out.println("Номер - " + number);
        System.out.println("Всего объектов - " + count);
    }

    public void set(String n) {
        name = n;
    }

}

class UsePrivate {
    public static void main(String[] args) {
        MyClass objA = new MyClass("Alpha");
        MyClass objB = new MyClass("Beta");
        MyClass objC = new MyClass("Centavo");
        objA.show();
        objB.show();
        objC.show();
        objA.set("Пися");
        objA.show();
        objB.show();
        objC.show();

    }
}