public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullNam = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullNam);

        System.out.println("Задание 2");
        String s1 = fullNam.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + s1);

        System.out.println("Задание 3");
        String change = "Иванов Семён Семёнович";
        change= change.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + change);

    }
}