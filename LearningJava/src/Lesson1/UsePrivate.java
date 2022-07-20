package Lesson1;

class MyClass {
    private static int count = 0;
    private String name;
    private int number;

    MyClass(String n) {
        count++;
        name = n;
        number = count;
        System.out.println("������ �������� ��� ������: " + name);
    }

    public void show() {
        System.out.println("��� ������� - " + name);
        System.out.println("����� - " + number);
        System.out.println("����� �������� - " + count);
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
        objA.set("����");
        objA.show();
        objB.show();
        objC.show();

    }
}