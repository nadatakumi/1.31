package main;

class Person {
    public String name;
    public int age;
    public double height;
    public double weight;
    public static int count = 0; // 問題1：クラスフィールドcountの定義（初期値: 0）

    Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++; // 問題2：コンストラクタ内でcountに1を足す
    }

    public double bmi() {
        return this.weight / this.height / this.height;
    }

    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
    }

    // 問題4と問題5：クラスメソッドprintCountの定義
    public static void printCount() {
        System.out.println("合計" + count + "人です"); // クラスフィールドcountを用いて出力
    }
}
