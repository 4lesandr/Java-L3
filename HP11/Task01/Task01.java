public class Task01 {
    public static void main(String[] args) {
        System.out.println("мяу!");
    }
}
/*Переменная publicVar доступна везде.
protectedVar доступна в том же пакете и через наследование в подклассах.
defaultVar (package-private) доступна только в том же пакете.
privateVar доступна только внутри своего класса AccessModifiersDemo.
Подкласс SubClass в другом пакете может получить доступ к protectedVar через механизм наследования*/