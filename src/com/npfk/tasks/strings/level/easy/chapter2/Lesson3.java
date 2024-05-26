package com.npfk.tasks.strings.level.easy.chapter2;

import java.util.Scanner;

/** Hallöchen. Порівняння рядків.
 *
 * Ну, тепер навчившись вводити данні з клавіатури, ми зосередимось саме на типу даних String. Далі будемо вивчати лише його.
 *
 * Цього разу ми навчимось порівнювати рядки за допомогою спеціального методу .equals().
 * Поїхали;)
 *
 * Ну, що-ж. Думаю, ти вже знаєш, що щоб порівняти 2 сутністі, ми використовуємо оператор ==
 * І результатом порівняння завжди буде одне з двох: Або true (істина), або false (хиба)
 *
 * І в залежності від результата порівняння будуть виконуватись певні умови.
 * Тобто, якщо результат істина - виконується одна умова. Якщо результат хиба - виконується інша умова.
 *
 * Ну, наприклад:
 *
 * int age1 = 10;
 * int age2 = 11;
 *
 * if (age1 == age2)
 * {
 *     System.out.println("Ці діти є однолітками");
 * }
 * else
 * {
 *     System.out.println("На жаль, ці діти різного віку");
 * }
 *
 * Що, на твою думку, виведеться на екран твого монітору? Запусти код і перевір!;)
 *
 * Або ось ще тобі приклад коду:
 *
 * char symbolOne = 'a';
 * char symbolSecond = 'f';
 *
 * if (symbolOne == symbolSecond)
 * {
 *     System.out.println("Символи однакові. Ці символи будуть видалені з рядку.");
 * }
 * else
 * {
 *     System.out.println("Символ зовсім різні! Нічого не відбуватиметься.");
 * }
 *
 * А тут що виведеться?;) Запустив код і перевірив?;)
 *
 * Тобто, як ти сам бачиш, ми можемо порівнювати між собою дуже багато чого.
 * І якісь цифри, і символи, і результати обчислент, і данні з файлу, і навіть картинки, і пікселі, і музичні хвилі, і якість двох звуків, і кольори... Дуже багато чого!!!
 * І рядки, як ти вже зрозумів, ми також можемо порівнювати між собою.
 *
 * Ну, наприклад...
 *
 * String password = "qwerty3";
 * String typedPassword = "1111"; // Дослівно перекладається як "Введений пароль"
 *
 * if (typedPassword == password)
 * {
 *     System.out.println("З поверненням!;)");
 * }
 * else
 * {
 *     System.out.println("Пароль невірний! Вашу IP-Адресу заблоковано!!!");
 * }
 * І це працюватиме. Це дійсно працюватиме.
 *
 * І здавалось би, усього то нічого. Але... Ай, короче, краще покажу тобі це на наступному прикладі, а потім поясню чому так;)
 *
 *                  !!!!!!!!!!!!!ЦЕЙ КОД ОБОВ'ЯЗКОВИЙ ДО ЗАПУСКУ!!!!!!!!!!!!!
 * Scanner anyLine = new Scanner(System.in);
 * String address1 = anyLine.nextLine(); // Вводимо першу адресу...
 * String address2 = anyLine.nextLine(); // Вводимо другу адрусу...
 *
 * if (address2 == address1)
 * {
 *     System.out.println("Ці адреси співпадають.");
 * }
 * else
 * {
 *     System.out.println("Ці адреси різні!");
 * }
 *                  !!!!!!!!!!!!!ЦЕЙ КОД ОБОВ'ЯЗКОВИЙ ДО ЗАПУСКУ!!!!!!!!!!!!!
 * А тепер, давай введемо дві різні адреси:
 * Площа Ринок
 * Сердито
 *
 * Програма нам видасть: "Ці адрес різні!"
 *
 * Начебто, нічого дивного. Все працює так, як воно повинно. Але... А що буде, якщо ми введемо однакові адреси?...
 * Сердито
 * Сердито
 *
 * ... Ці адреси різні! ЩО? Воно не працює?!?!??!?!!!!
 * Здавалось би, ми ввели два однакові рядки. Ніяких пробілів, ніяких зайвих символів... "Ці адреси різні!"...
 * Як так?
 *
 * Спокійно! Зараз поясню на котятах;)
 * Ітак, що ми знаємо про String? Що він має в собі масив типу char, і що він є (!!!) класом. Добре.
 * А що ми знаємо про Scanner? Що він може читати будь-що і будь-звідки. Ага. І що він також клас!!!
 * А що про System знаємо? І це також клас!!!
 *
 * Так от, є таке правило. Абсолютно всі класи! Абсолютно!!! Треба порівнювати методом .equals().
 * Так, цей метод є не тільки у класу String, а й усіх інших класів. І в System, і в Scanner, і навіть в тих класах,
 * які ви будете створювати в майбутньому.
 *
 * Якщо, щоб порівняти 2 примітивних типа, ну наприклад, 2 цілих числа, або 2 символи, ми використовуємо оператор порівняння ==,
 * і це призведе в більшості випадків до правильних результатів порівняння.
 *
 * То з класами все зовсім по-інакшому. А особливо зі String. Насправді... Зміни з типом класу не зберігають безпосередньо в собі значення,
 * як це роблять примітивні типи даних. Вони зберігають посилання на це значення. А це значення зберігається в іншому місці.
 *
 * І, якщо ми хочемо порівняти 2 класи за допомогою оператору ==, ми насправді будемо порівнювати не безпосередньо значення,
 * а адреси в нашій оперативній пам'яті.
 * Як ти сам бачиш, в першому випадку код спрацював правильно, тому що зміні посилаються за різною адресою.
 * Тобто, якщо було б однакове значення, ці дві змінні посилались би за одною адресою.
 *
 * А в другому випадку, це не спрацювало через особливість роботи класу Scanner.
 *
 * І тому, якщо ми збираємось порівнювати саме значення, не адреси!!!, значення, то це зробить правильно метод .equals()
 *
 * Якщо так подивитись, він буде йти за адресою, і діставати звідти саме значення, а потім своїм магічним способом проводить порівняння
 * і поверне нам правильний результат.
 *
 * Давай перепишемо цей код.
 *
 *                  !!!!!!!!!!!!!ЦЕЙ КОД ОБОВ'ЯЗКОВИЙ ДО ЗАПУСКУ!!!!!!!!!!!!!
 * Scanner anyLine = new Scanner(System.in);
 * String address1 = anyLine.nextLine(); // Вводимо першу адресу...
 * String address2 = anyLine.nextLine(); // Вводимо другу адрусу...
 *
 * if (address2.equals(address1))
 * {
 *     System.out.println("Ці адреси співпадають.");
 * }
 * else
 * {
 *     System.out.println("Ці адреси різні!");
 * }
 *                  !!!!!!!!!!!!!ЦЕЙ КОД ОБОВ'ЯЗКОВИЙ ДО ЗАПУСКУ!!!!!!!!!!!!!
 *
 * І, коли ми запустимо цей код... Знову введемо ті ж самі значення...
 * Сердито
 * Сердито
 * .......
 * Ці адреси співпадають.
 *
 * БІНГО!!!! ВОНО ПРАЦЮЄ!!!!
 *
 * Запам'ятай, якщо захочеш порівняти два рядки, ЗАВЖДИ, використовуй метод .equals()!!!
 *
 * Добре, ось тобі завдання:
 *
 * 1) Напиши програму, яка буде зчитувати данні два рази (Тобто, у дві змінні буде заноситись по значенню)
 *    І перевіряє, чи є однаковими ці рядки. Якщо змінні мають однакове значення, ти маєш вивести на екран
 *    "Так, ці рядки однакові."
 *    А якщо ні, то...
 *    "Ці рядки зовсім не однакові!!!"
 *
 *
 *    Але, це завдання було б занадто просте;) Тому я хочу його ускладнити. Тобі надається цикл while().
 *    Зроби, будь ласка, наступне. Якщо ХОЧАБ ОДИН ІЗ РЯДКІВ отримує від користувача на ввід "вийти", вконання програми
 *    має завершитись. І перед завершенням програма має вивести "Всього доброго, моя робоча зміна закінчилась!" ;)
 *
 *----------------------------------------------------------------------------------------------------------------------
 *
 *    Невеличка підказка: тобі допоможе логічний оператор || (АБО). Він працює так: Якщо хочаб одна умова повертаю істину, то
 *    наслідок цієї умови в любому випадку виконається.
 *
 *    Ну наприклад. Уяви, що у нас є змінна String isMyFellowStudent (Fellow Students перекладається як "однокурсники")
 *    Ми вводимо в цю змінну будь-яке текстове значення. А також у нас є умовний if, який буде перевіряти ці значення.
 *
 *    І він тримає в собі 10 умов (Так, так робити не дуже гарно, але ми це робимо лише в цьому прикладі;))
 *
 *    if (умова1 || умова2 || умова3 || ... || умова9 || умова10)
 *    {
 *        System.out.println("Так, це мій однокурсник");
 *    }
 *    else
 *    {
 *        System.out.println("Цього я не знаю!");
 *    }
 *
 *    Припустимо наступну ситуацію. Користувач ввів ім'я "Джеммі". 9 умов повернули хибу, а остання, 10-та, умова повернула істину.
 *    І в такому випадку виведеться "Так, це мій однокурсник". Тут і спрацював оператор АБО.
 *    Ось тобі наглядна табличка, як він працює
 *
 *    істина || істина - наслідок відбудеться
 *    істина || ХИБА - наслідок відбудеться
 *    ХИБА || істина - наслідок відбудеться
 *    хиба || хиба - наслідок не відбудеться!!!
 *
 *    А також, тобі допоможе оператор break, який дозволяє за певних умов вийти з циклу while().
 *
 *    УВАГА!!! Якщо тобі щось не зрозуміло, перечитай, будь ласка, матеріал ще раз. В інакшому випадку ти можеш (І МАЄШ)
 *    звернутись до Google.
 *----------------------------------------------------------------------------------------------------------------------
 *
 * Ось так має працювати програма:
 * Кейс 1:
 * Привіт
 * Привіт
 * Так, ці рядки однакові
 *
 * Кейс 2:
 * Hallo
 * Hallöchen
 * Ці рядки зовсім не однакові!!!
 *
 * Кейс 3:
 * Як твої справи?
 * вихід
 * Всього доброго, моя робоча зміна закінчилась!
 *
 * Кейс 4:
 * 1
 * 1
 * Так, ці рядки однакові
 *
 * Кейс 5:
 * Вихід
 * Вихід
 * Так, ці рядки однакові (:))) )
 *
 * Кейс 6:
 * вихід
 * вихід
 * Всього доброго, моя робоча змінна закінчилась!
 *
 * 2) Доповни, будь ласка, попередню програму так, щоб вона виводила загальну кількість символів, яку ввів користувач,
 *    після завершення виконання програми.
 *
 *    Тобто, програма має вивести:
 *    Користувач ввів: (кількість символів)
 *    Всього доброго, моя робоча зміна закінчилась!
 *
 * 3) (*_*) Рівень-Босфайтінг (*_*)
 *
 *    Увага, це завдання для справжніх програмістів. Виконай його, якщо хочеш високу оцінку.
 *
 *    Додай до попередньої програми ліміт символів. Встанови ліміт в 10 символів.
 *    Якщо користувач вичерпав свій ліміт, програма має сповістити його про це, і користувач має знову ввести значення
 *    для ЦІЄЇ ЗМІННОЇ!!!.
 *
 *    Невеличка підказочка. Мабуть, тобі тут допоможе цикл do while (). Але це не точно;)
 */



public class Lesson3
{
    public static void main(String[] args)
    {
        Scanner anyLine = new Scanner(System.in);
        String firstLine = "";
        String secondLine = "";

        while (true)
        {
            // Напиши код тут.
        }
    }
}
