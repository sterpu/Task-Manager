package com.kate.task;

public class PersonMainExample {


    public static void main(String[] args) {

        String BASIC_EMAIL = "my.example@com";
        String BASIC_NAME = "IVAN";
        //Мария Петровна

        //TODO : СОЗДАТЬ и заполнить экземпляр класса PersonFromJson
        createPerson(BASIC_EMAIL, BASIC_NAME, 28);
        createPerson(BASIC_EMAIL, BASIC_NAME, 28);
        createPerson(BASIC_EMAIL, BASIC_NAME, 28);
        //создаём объект через new + ЗАГЛАВНЫЕ БУКВЫ, выносим на CTRL + ALT + V
        //через F2 переходим к месту ошибки
        //CTRL + P - показать параметры, CTRL + SHIFT + SPACE - показываем варианты подстановок
        //*CTRL + ALT + SHIFT + LEFT/RIGHT - переметсить аргумент влево/вправо
        //SHIFT + ALT - переход на следующую строку, экономим нажатия
        //CTRL + SPACE - выводим варианты,  CTRL + . - выбираем метод
        //*CTRL + W - увеличивающаяся область выбора, " при выбранном тексте оборачивает его (то же с {[(<)
        //CTRL + D - дублируем строку, CTRL + SPACE - выводим варианты
        //CTRL + SHIFT + V - вставка с историей
        //*SHIFT + ALT + UP/DOWN - ДВИГАЕМ ВВЕРХ-ВНИЗ

        //TODO : Вынести в метод создание PersonFromJson, создать ещё двух
        //CTRL + W - увеличивающаяся область выбора,
        //делаем дубликаты, F2
        //ALT + J - создаём курсоры
        //СTRL + ALT + M - ВЫНОС МЕТОДА, ALT + UP/DOWN - переход по методам, CTRL + F12 - навигация по методам
        //СTRL + ALT + P - вынос параметра, CTRL + ALT + C - вынос константы, SHIFT + F6 - переименование
        //CTRL + B - к использованию, *CTRL + ALT + N - INLINE


        //TODO : вывести в консоль пол созданного человека, залогировать отдельно людей с заполненным именем отца
        //idea-way по добавлению полей/методов/классов - ALT + ENTER с курсором на несуществующем методе
        //postfixes
        //sout, ifn, inn, opt, field
        //CTRL + SHIFT + ENTER - дополнение текущего выражения (; в конце строки, else в блоке)
    }

    private static void createPerson(String BASIC_EMAIL, String BASIC_NAME, int age) {
        PersonFromJson personFromJson = new PersonFromJson(BASIC_NAME, BASIC_EMAIL);
        personFromJson.setIsWoman(true);
        personFromJson.setAge(age);
    }

}
