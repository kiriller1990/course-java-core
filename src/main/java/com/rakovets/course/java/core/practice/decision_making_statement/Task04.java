package com.rakovets.course.java.core.practice.decision_making_statement;

/**
 * Разработать программу для desktop приложения:
 * которая преобразует номер дня недели в его словесный аналог.
 *
 * @author Dmitry Rakovets
 */
class Task04 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        byte dayOfWeekNumber = 1;

        String nameWeekday = getDayOfWeekNumber(dayOfWeekNumber);
        System.out.printf("Result: %s", nameWeekday);
    }

    /**
     * Возвращает название дня недели, в зависимости от его порядкового номера.
     *
     * @param dayOfWeekNumber номер дня недели
     * @return день недели на английском языке (UPPER CASE)
     */
    static String getDayOfWeekNumber(byte dayOfWeekNumber) {
       if (dayOfWeekNumber == 1) {
           return "MONDAY";
       } else if (dayOfWeekNumber == 2) {
           return "TUESDAY";
       }  else if (dayOfWeekNumber == 3)  {
           return "WEDNESDAY";
       } else if (dayOfWeekNumber == 4) {
           return "THURSDAY";
       } else if (dayOfWeekNumber == 5) {
           return "FRIDAY";
       } else if (dayOfWeekNumber == 6) {
           return "SATURDAY";
       } else if (dayOfWeekNumber == 7) {
           return "SUNDAY";
       } else {
           return null;
       }
    }
}
