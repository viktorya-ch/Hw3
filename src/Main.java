public class Main {
    public static void main(String[] args) {

        //Task#1
        var dog = 0.8;
        var cat = 3.6;
        var paper = 763789;

        //Task#2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        //Task#3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(" При уменьшении переменной dog получилось " + dog + " cat " + cat + " paper " + paper);

//Task#4
        var friend = 19;
        System.out.println(" Переменная friend равна " + friend);
        friend = friend + 2;
        System.out.println(" После увеличения на 2, стала равна " + friend);
        friend = friend / 7;
        System.out.println(" После деления на 7, стала равна " + friend);

        //Task#5
        var frog = 3.5;
        System.out.println("Переменная frog равна " + frog);
        frog = frog * 10;
        System.out.println(" При увеличении в 10 раз, стала равна " + frog);
        frog = (int) (frog / 3.5);
        System.out.println(" После деления на 3,5, стала равна " + frog);
        frog = frog + 4;
        System.out.println(" После того как прибавили 4, стала равна " + frog);

        //Task#6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var mass = boxer1 + boxer2;
        System.out.println(" Общая масса двух бойцов равна " + mass);
        var difference = boxer2 - boxer1;
        System.out.println(" Разница между массами бойцов равна " + difference);

//Task#7
        var remainder = boxer2 % boxer1;
        System.out.println(" Остаток от деления равен " + remainder);

//Task#8
        var t = 640;
        var t1 = 8;
        var workers = t / t1;
        System.out.println(" Всего работников в комании - " + workers + " человек ");

        var workers2 = workers + 94;
        var t2 = t / workers2;
        System.out.println(" Если в компании " + workers2 + " человека, то всего " + t2 + " часа работы может быть поделено между сотрудниками ");

    }}