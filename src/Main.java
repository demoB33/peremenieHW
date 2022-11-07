public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1 :");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 2
        System.out.println("Задача 2 :");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 3
        System.out.println("Задача 3 :");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 4
        System.out.println("Задание 4 :");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Задача 5
        System.out.println("Задание 5 :");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Задача 6
        System.out.println("Задание 6 :");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var sumWeight = boxerWeight1 + boxerWeight2;
        System.out.println("общий вес двух бойцов = " + sumWeight + " кг");
        var differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Разница между весами бойцов = " + differenceWeight + " кг");
        // Задача 7
        System.out.println("Задание 7 :");
        var differenceWeight7Zadanie = boxerWeight2 - boxerWeight1;
        System.out.println("Разница между весами бойцов (выч. большего из меньшего) = " + differenceWeight7Zadanie + " кг");
        var differenceMassOstatok = boxerWeight2 % boxerWeight1;
        System.out.println("Разница весов спортсменов (функц. остаток от деления) = " + differenceMassOstatok + " кг");
        // Задача 8
        System.out.println("Задание 8 :");
        var allWorkTime = 640;
        var employeeWorks = 8;
        var numbersEmployees = allWorkTime / employeeWorks;
        System.out.println("Всего работников в компании - " + numbersEmployees + " человек.");
        var pluseNumbersEmployees = numbersEmployees + 94;
        var workTimeFor174Empl =pluseNumbersEmployees * employeeWorks;
        System.out.println("Если в компании работает " + pluseNumbersEmployees + " человека, то всего " + workTimeFor174Empl + " часов работы может быть поделено между сотрудениками.");
    }
}