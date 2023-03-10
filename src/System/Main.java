package System;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность.
        Написать 2 разных конструктора для создания объекта. В одном конструкторе задаются все поля,
         в другом только здоровье и урон. Добавить в класс Hero геттеры для всех полей.
Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты.
Добавить в класс геттеры и сеттеры для всех полей.
В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
Затем распечатать всю информацию о боссе.
ДЗ на сообразительность:
Добавить метод в классе Main который называется createHeroes,
в теле метода необходимо создать 3х героев с помощью класса Hero,
 используя при этом разные варианты конструкторов (либо первый либо второй).
  Затем поместить созданные экземпляры героев в массив и вернуть его с помощью команды return,
   как возвращаемый результат метода createHeroes Hero[ ]
Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.*/

        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(10);
        boss.setProtectionType("С помощью магии");
        System.out.println("Парамметры Босса:");
        System.out.println("Здоровье "+boss.getHealth());
        System.out.println("Урон "+boss.getDamage());
        System.out.println("Тип защиты "+boss.getProtectionType());

        for (int i = 0; i<3;i++){
            System.out.println(Arrays.asList(createHeros()).get(i).toString());
        }


    }
    public static Hero[] createHeros(){
        Hero hero = new Hero("Spider man",50,15,"spider sense");
        Hero hero2 = new Hero("iron Man",100,25);
        Hero hero3 = new Hero("black Panther",76,18);
        Hero[] heros = new Hero[3];
        heros[0]=hero;
        heros[1]=hero2;
        heros[2]=hero3;
        return heros;
    }
}

