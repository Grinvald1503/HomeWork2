public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var sumWeight = boxerOne + boxerTwo;
        var differenceWeight = Math.abs(boxerOne - boxerTwo);
        System.out.println("Общий вес двух бойцов " + sumWeight + "кг.");
        System.out.println("Разница между весами бойцов " + differenceWeight + "кг.");
        var ves1 = boxerTwo - boxerOne;
        var ves2 = boxerTwo % boxerOne;

        var totalTime = 640;
        var hoursPerDatEmployee = 8;
        var numberOfEmployees = totalTime / hoursPerDatEmployee;
        var numberOfEmployees94 = numberOfEmployees + 94;
        var hoursDivided = numberOfEmployees94 * hoursPerDatEmployee;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек");
        System.out.println("Если в  компании работает " + numberOfEmployees94 + " человек, то всего " + hoursDivided + " часов работы может быть поделено между сотрудниками");




    }
}