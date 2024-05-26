package com.npfk.tasks.strings.level.easy.chapter3;

/**
 * Hello. Методи .startsWith() та .endsWith()
 *
 * Ви вже багато чого вмієте робити з рядками, і вже маєте якусь базу. І це дуже круто;)
 *
 * В цій лекції ми продовжимо знайомитись з методами класу String. А саме, з endsWith() та startsWith()
 *
 * Це будуть досить прості методи, які ідеально підійдуть для того, щоб розігрітись.
 *
 * Думаю, ти вже розумієш з назви, що ці методи перевіряють, чи починається рядок (.startsWith()) або чи закінчується .endsWith()
 * з наданого промпту. І, це... Все. Так, це все.
 *
 * А, ще варто додати, що цей метод повертає або true або false, і використовується з умовними операторами.
 *
 * Давай ось такий приклад роздивимось
 *
 *  // Уявімо, що наша програма отримала інформацію про комп'ютер користувача
 * String aboutPC1 = "x86-64_os:Linux";
 *
 * // .repeat() перекладається як "повторити". В даному випадку повторити крапку 50 разів...
 * System.out.println(".".repeat(50));
 * System.out.println("Системна інформація про комп'ютер 1:");
 * ч
 * if (aboutPC1.startsWith("i386"))
 * {
 *     System.out.println("Архітектура: i386 (Розрядність: 32)");
 * }
 * else if (aboutPC1.startsWith("x86"))
 * {
 *     System.out.println("Архітектура: x86-64 (Розрядність: 64)");
 * }
 * else
 * {
 *     System.out.println("Архітектура: Невідомо");
 * }
 *
 * if (aboutPC1.endsWith("Linux"))
 * {
 *     System.out.println("Операційна система: Linux");
 * }
 * else if (aboutPC1.endWith("Win"))
 * {
 *     System.out.println("Операційна система: Windows");
 * }
 * else
 * {
 *     System.out.println("Операційна система: Невідомо");
 * }
 *
 *
 * Обов'язково запусти цей код, і подивись, що виведе;)
 *
 * Ну, добренько. Ось тобі завданнячко:)
 *
 * 1. Напиши програму, яка зчитує з клавіатури назву файла з його форматом.
 *    І опрацюй наступні формати, якщо користувач ввів такі файли:
 *    .html - Виведи : "Це інтернет сторінка!"
 *    .jpg - Виведи  : "Це картинка!"
 *    .jpeg - Виведи : "Це картинка!"
 *    .doc - Виведи  : "Це документ!"
 *    .docx - Виведи : "Це документ!"
 *    інакше - "Невідомий формат"
 *
 *    Наприклад:
 *    miami.jpg - "Це картинка!"
 *    salary.doc - "Це документ!"
 *    apple_com.html - "Це інтернет сторінка!"
 *    video.webmp - "Невідомий формат"
 *
 * 2.
 * У тебе є масив файлів:
 *
 * String[] allFilesOnMyDrive = {
 *     "miami.png", "allPassword(DON`T OPEN!!!).txt", "ти_сам_собі_країна_Скрябін.mp3", "meAndMyGirlfriend.jpeg",
 *     "звіт_за_перший_квартал.docx", "скільки_коштує_моя_мрія.excel", "paris.png", "ohne_dich_rammstein.mp3",
 *     "катерина_тарас_шевченко.ebook", "обійми_мене_океан_ельзи.mp3", "стрім_minecraft.mp4", "berlin.png",
 *     "не_йди_океан_ельзи.mp3"
 * };
 * І масив доступних форматів
 * String[] availableFormats = {".mp3", ".png", ".jpeg"};
 *
 * Так от, тобі треба циклом пройтись по масиву allFilesOnMyDrive, і перевірити, чи наявні в ньому файли формату з масиву availableFormats.
 * Якщо так, то виведи ці файли. І також, порахуй, скільки таких файлів знайшлось у масиві. І виведи їхню загальну кількість.
 *
 * P.S. Тобі допоможуть цикли for;)
 *
 */
public class Lesson1
{

    public static void main(String[] args)
    {
        // Напиши код тут.
    }
}
