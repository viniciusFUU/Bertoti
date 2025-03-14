package Singleton;

public class App {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstancia("teste");
        Singleton anotherSingleton = Singleton.getInstancia("vazio");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
