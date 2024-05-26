package com.npfk.tasks.strings;


import java.util.Scanner;

/**
 * Умови задачі:
 * Створіть, будь ласка, три змінні типу String, які будуть приймати від користувача 3 слова відповідно.
 * Після того як користувач введе 3 слова, він має отримати у вивід повноцінний рядок з цих слів, але без роздільників.
 * Тобто, рядок типу... "Рядок1Рядок2Рядок3"... "АннаЛюсіМартін"...
 *
 *
 *                                       ТЕОРІЯ
 * Щоб занести значення, яке буде вводити користувач, надайте програмі можливість зчитувати данні з клавіатури.
 * У вас вже є готова змінна anyLine класу Scanner. Вона буде посередником між зовнішнім світом, і вашошими зміннами.
 * І все що, ви занесете у цю змінну, вона покладе у ваші змінні. Для цього треба лише їй вказати, що вона починна
 * зчитувати клавіатури данні типу String. Для цього вона має в собі метод nextLine(). Цей метод наказує змінні приймати
 * з клавіатури значення типу String.
 *
 * Приклад, як покласти значення, яке користувач буде вводити з клавіатури, у ващу змінну:
 * String value = anyLine.nextLine();
 *
 * ЩО ТУТ ВІДБУВАЄТЬСЯ?
 * 1. Я оголошую змінну value типу String. Тобто, ця змінна буде зберігати в собі будь-яку текстову інформацію
 * 2. Я беру змінну посередник anyLine, яка має здібності зчитувати данні з клавіатури.
 * 3. Я цій змінній наказую зчитувати данні з клавіатури, викликаючи метод nextLine() та покласти значеня,
 * яке ввів користувач у змінну value.
 *----------------------------------------------------------------------------------------------------------------------
 *
 * Щоб складати рядки, використовуйте оператор +
 *
 * Наприклад:
 *
 * String partOfMessage1 = "Hello";
 * String partOfMessage2 = "world";
 *
 * System.out.println(partOfMessage1 + partOfMessage2);
 * Виведе:
 * Helloworld
 *
 * Дивно, чомусь немає пробілу... Тому що нам треба його додати:)
 * System.out.println(partOfMessage1 + " " + partOfMessage2);
 * Виведе:
 * Hello world
 * ---------------------------------------------------------------------------------------------------------------------
 * ;)
 *
 * Тестові данні для перевірки рішення:
 *
 * Користувач ввів:
 * Алекс
 * Джастін
 * Джеммі
 *
 * Користувач отримає:
 * АлексДжастінДжеммі
 *
 * Користувач ввів:
 * Дім
 * Квартира
 * Апартамент
 *
 * Користувач отриммає:
 * ДімКвартираАпартамент
 *
 * Корристувач ввів:
 * 13
 * років
 * 2004
 *
 * Користувач отримає:
 * 13років2004
 *
 *
 *
 */
public class TaskThird
{
    public static void main(String[] args)
    {
        Scanner anyLine = new Scanner(System.in);
        // Напишіть ваш код тут.
    }

}
