package com.npfk.tasks.strings.level.easy.chapter1;

/** 1.3 Bonjour. Рядки 1.
 *
 * Ну, ось ми і на місці. Пані та панове - Рядки.
 *
 * Думаю, ти щось чув про примітивні типи даних, чи не так? Перерахувати зможеш?
 * int, char, boolean, double, float, long, byte, short...
 *
 * А String'у нема... І от таке виникає запитаннячко: А чому?
 *
 * Давай розбиратись. Думаю, ти помітив косметичні нюанси. String пишеться з великої літери, і він чомусь не світиться...
 * Він що, якийсь особливий? І відповідь буде так. Цей тип даних дуже особливий. (Насправді він є класом)
 *
 * Скажу навіть так: він є особливим і в способі зберігання інформації, і в способі взаємодії з нею.
 *
 * Давай почнемо з чогось простого. Як ти вже розумієш, клас String зберігає в собі будь-яку текстову інформацію.
 * Але... Як це виглядає насправді? Як він всі данні перетворює у текст? Яка магія там відбувається?
 *
 * А відповідь отака: Ніякої магії тут немає;)
 *
 * Насправді, так званий текст є... масивом символів! Так, це масив символів! Тобто char[] text;
 * І, якщо упустити більшість моментів, то саме так і побудований тип String.
 *
 * Чому саме масив? Тому що один char зберігає в собі лише один символ.
 * char a = 'a';
 * char b = 'b'
 * char oneCharacter = '1';
 * char gap = ' '; // Символ пробілу
 * char utfCode = '\u00A9'; // Юнікод, відобразиться ©
 *
 * Але отак робити не можна! ЦЕ НЕ ПРАЦЮЄ!!!
 * char aa = 'aa'; - ALERT!!!
 *
 * А як зробити так, щоб працювало? Зробити масив
 * char[] aa = {'a', 'a'}; - Отак правильно, well done:)
 *
 * І, я думаю, ти вже починаєш здогадуватсь, що...
 * char[] hello = {'h', 'e', 'l', 'l', 'o'};
 * Це теж саме, що і...
 * String hello = "hello";
 *
 * А це...
 * char[] oneOneOne = {'1', '1', '1'};
 * Це теж саме, що і...
 * String oneOneOne = "111";
 *
 * Думаю, це поки що зрозуміло. Але тепер от таке запитаннячко: А чому тоді існує тип String, якщо ми можемо просто створити масив символів?
 * Ну...
 *
* char[] message = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
 * Ну як, подобається?;)
 *
 * Взагалі, ще є досить цікавий нюанс. Наприклад, щоб вивести це повідомлення, нам треба було б використовувати цикл.
 *
 * for (int i = 0; i < message.length; i++)
 * {
 *     System.out.print(message[i]);
 * }
 * System.out.println(); // Переводить курсор на новий рядок. НЕ ЗАБУДЬТЕ ОЦЕЙ println()!!!
 *
 *
 * І в консоль виведеться: Hello, world!
 *
 * Тому, тип String дуже сильно зпрощує роботу з текстом, і всі додаткові дії, які нам треба було б писати у коді, він бере на себе.
 * Ба більше, він пропонує методи, які дозволяють обробляти текст, що дозволить уникнути створення зайвих циклів і перевірок у нашому коді.
 * (Неповний список цих методів ти міг побачити в файли DESCRIPTION.MD, який ти мав прочитати перед початком цієї частини практики;) )
 *
 * На сьогодні теорії достатньо:) Ось тобі завдання.
 *
 * Умова:
 * Створи, будь ласка, 3 змінні типу String, які будуть відповідати за збереження певної інформації.
 * А саме: Ім'я, Прізвище, Дата народження.
 * І назви ці змінні відповідним чином: firstName, lastName, dateOfBirth;
 *
 * У тебе є данні для ініціалізації:
 * Ім'я - Уолтер
 * Прізвище - Кріс
 * Дата народження - 10.10.1986
 *
 *
 * І виведи їх у консоль наступним чином:
 * Призвіще Ім'я - дата народження;
 *
 * наприклад:
 * Уолтер Кріс - 10.10.1986
 *
 * P.S. Тобі допоможе оператор + :)
 */


public class Lesson3
{

    public static void main(String[] args)
    {

    }

}
