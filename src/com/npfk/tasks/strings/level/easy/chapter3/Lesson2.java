package com.npfk.tasks.strings.level.easy.chapter3;

/**
 * Hello. Методи .toUpperCase() та .toLowerCase()
 *
 * Ітак... Тут ми навчимось з тобою змінювати регістр нашого повідомлення. Ну наприклад...
 *
 * String message = "ДЖІММІ!! ДЕ МОЇ ГРОШІ?! ТИ МЕНІ ОБІЦЯВ ПОГАСИТИ БОРГ НА ЦЬОМУ ТИЖНІ!!";
 *
 * Так-так, пора когось трохи закрити...
 *
 * message.toLowerCase();
 * ---------------------------------------------------------------------------------------------------------------------
 * "джіммі!! ду мої гроші?! ти мені обіцяв погасити борг на цьому тижні!!"
 *
 * Ну, так вже краще;) Ну, залишимо цього Джіммі з його проблемами, і перейдемо до наступного прикладу ;-)
 *
 * String warning = "увага! На цьому тижні буде знижка на гру Assassin`s Creed: Black Flag";
 * Так, а це вже серйозно... Але... Думаю, так буде краще;)
 *
 * warning.toUpperCase()
 * ---------------------------------------------------------------------------------------------------------------------
 * "УВАГА! НА ЦЬОМУ ТИЖНІ БУДЕ ЗНИЖКА НА ГРУ ASSASSIN`S CREED: BLACK FLAG"
 *
 * Як ти сам бачиш, за допомогою цих методів ми можемо змінювати контекст повідомлення, наприклад.
 *
 * Але, є інша область застосування цих методів, де вони будуть більш корисні.
 *
 * Давай уявимо,що кристувач вводить назву файлу, і нам треба перевірити його формат.
 * if (anyFile.endsWith(".jpeg"))
 * {
 *     System.out.println("Це картинка.");
 * }
 *
 * але... А що буде, якщо користувач введе MIAMI.JPEG? Ця перевірка просто не спрацює...
 * Тому що ".JPEG" і ".jpeg" це абсолютно різні рядки.
 * Отже, в цьому нам і допоможе метод .toLowerCase()
 *
 * if (anyFile.toLowerCase().endsWith(".jpeg"))
 * {
 *     System.out.println("Це картинка.")
 * }
 * Тобто, спочатку ми регістр переводимо у нижній, а потім вже перевіряємо.
 *
 *
 * В такому випадку наш приклад спрацює.
 *
 * Отже, думаю поки що зрозуміло?
 *
 *
 *
 * Ну, добре, ось тобі завданнячко;)
 *
 * Напиши програму, яка зчитує данні з клавіатури.
 *
 * У тебе є масив зі словами-трігерами.
 * String[] triggers = {"мати", "бути", "робити", "повинен", "повинно", "знати"};
 *
 * І тепер зроби наступне: Якщо увведений рядок має в собі слова з цього масиву, переведи весь рядок у верхній регістр.
 * І виведи його.
 *
 * Якщо рядок не має в собі таких слів, то виведи: Do not contains.
 * Наприклад:
 * Користувач ввів:
 *                       | Ось |
 * Закони про працю мають бути розроблені таким чином, щоб захищати права робітників в умовах капіталістичної економіки
 * Програма виведе:
 * ЗАКОНИ ПРО ПРАЦЮ МАЮТЬ БУТИ РОЗРОБЛЕНІ ТАКИМ ЧИНОМ, ЩОБ ЗАХИЩАТИ ПРАВА РОБІТНИКІВ В УМОВАХ КАПІТАЛІСТИЧНОЇ ЕКОНОМІКИ.
 *
 *
 * P.S. Тобі допоможе метод .contains(), який перевіряє, чи має в собі рядок слово?
 * P.S.S. І НЕ ЗАБУДЬ TOLOWERCASE.toLowerCase:)
 *
 *
 * Ну наприклад
 *
 * String favoriteNames = "Алекс, Ліза, Джеммі, Ебігейл, Марія, Моніка, Мирослава";
 * if (favoriteNames.contains("Марія"))
 * {
 *     System.out.println("Ви вгадали моє улюблене ім'я!!!");
 * }
 * else
 * {
 *     System.out.println("Ні, це не моє улюблене ім'я!!");
 * }
 */
public class Lesson2
{
    public static void main(String[] args)
    {
    }
}
