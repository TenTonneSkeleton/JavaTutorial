package Lesson017;

class Alpha {
    String name;
    int code;

    Alpha(String name, int code) {
        this.name = name;
        this.code = code;
        System.out.println("����� Alpha");
        System.out.println("���� name - " + this.name);
        System.out.println("���� code - " + this.code);
    }

    Alpha(String name) {
        this(name, 0);
    }

    Alpha(int code) {
        this("�����", code);
    }

    Alpha() {
        this("������", 12);
    }
}

class Bravo extends Alpha {
    char symbol;

    private void show() {
        System.out.println("����� Bravo");
        System.out.println("���� char - " + this.symbol);
        for (int i = 0; i < 18; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }

    Bravo(String name, int code, char symbol) {
        super(name, code);
        this.symbol = symbol;
        show();
    }

    Bravo(String name, int code) {
        this(name, code, 'D');
    }

    Bravo(char symbol) {
        super();
        this.symbol = symbol;
        show();
    }

    Bravo(String name) {
        super(name);
        this.symbol = 'A';
        show();
    }

    Bravo(int code) {
        super(code);
        this.symbol = 'B';
        show();
    }

    Bravo() {
        this.symbol = 'C';
        show();
    }
}
class SubclassConstructor{
    public static void main(String[] args) {
        Bravo obj;
        obj = new Bravo();                          //������ �������� ����� Alpha()
        obj = new Bravo("�������");
        obj = new Bravo(100);
        obj = new Bravo("�������", 200);
        obj = new Bravo('Y');
        obj = new Bravo("�����", 300, 'Z');
    }
}
