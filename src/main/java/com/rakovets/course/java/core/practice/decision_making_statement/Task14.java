package com.rakovets.course.java.core.practice.decision_making_statement;

/**
 * Разработать программу для сайта посвященного астрологии.
 * <p>
 * Определить название года по китайскому календарю, если считать что нет никаких циклических смещений, т.е.
 * нижеприведенный цикл повторяется для любых 12 лет после 0 н.э..
 * <p>
 * 2001 - `Snake`
 * 2002 - `Horse`
 * 2003 - `Ram`
 * 2004 - `Monkey`
 * 2005 - `Rooster`
 * 2006 - `Dog`
 * 2007 - `Pig`
 * 2008 - `Rat`
 * 2009 - `Ox`
 * 2010 - `Tiger`
 * 2011 - `Rabbit`
 * 2012 - `Dragon`
 */
class Task14 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int day = 12;
        int month = 12;
        int year = 2012;

        String monthName = getZodiacYearName(day, month, year);
        System.out.printf("Result: %s", monthName);
    }

    /**
     * Определяет названия года по китайскому календарю.
     *
     * @param day   число дня рождения
     * @param month месяц дня рождения
     * @param year  год дня рождения (больше 0 г. н.э.)
     * @return название года по китайскому календарю
     */
    static String getZodiacYearName(int day, int month, int year) {
      int numberOfTheCharter=(year%12);
      System.out.println (numberOfTheCharter);
      if (numberOfTheCharter == 9) {
          return "Snake";
      } else if (numberOfTheCharter == 10) {
          return "Horse";
      } else if (numberOfTheCharter == 11) {
          return "Ram";
      } else if (numberOfTheCharter == 0) {
          return "Monkey";
      } else if (numberOfTheCharter == 1) {
          return "Rooster";
      } else if (numberOfTheCharter == 2) {
          return "Dog";
      } else if (numberOfTheCharter == 3) {
          return "Pig";
      } else if (numberOfTheCharter == 4) {
          return "Rat";
      } else if (numberOfTheCharter == 5) {
          return "Ox";
      } else if (numberOfTheCharter == 6) {
          return "Tiger";
      } else if (numberOfTheCharter == 7) {
          return "Rabbit";
      } else {
          return "Dragon";
      }
    }
}
