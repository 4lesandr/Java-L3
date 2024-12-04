//Объекты в программе должны быть заменяемы экземплярами их подтипов без изменения правильности работы программы.

// базовый класс лампочки
class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb is on!");
    }
}

// подкласс для умной лампочки, сохраняющий поведение базового класса
class SmartLightBulb extends LightBulb {
    @Override
    public void turnOn() {
        System.out.println("SmartLightBulb is on with additional features!");
    }
}


public class Task01 {
    public static void turnOnLight(LightBulb bulb) {
        bulb.turnOn();
    }

    public static void main(String[] args) {
        LightBulb regularBulb = new LightBulb();
        LightBulb smartBulb = new SmartLightBulb();

        turnOnLight(regularBulb); // вывод: LightBulb is on!
        turnOnLight(smartBulb);   // вывод: SmartLightBulb is on with additional features!
    }
}

//Благодаря принципу подстановки Лисков, мы можем передать как обычную лампочку (LightBulb), 
//так и "умную" лампочку (SmartLightBulb). Для обеих лампочек метод turnOn будет работать корректно.