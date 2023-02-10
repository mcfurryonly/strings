public class Main {
    public static void main(String[] args) {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        System.out.println("ФИО сотрудника = " + firstName +  " " + middleName + " " + lastName);


        String fullName = firstName + " " + middleName + " " + lastName;
        fullName = fullName.replace("i", "I");
        fullName = fullName.replace("v", "V");
        fullName = fullName.replace("a", "A");
        fullName = fullName.replace("n", "N");
        fullName = fullName.replace("o", "O");
        fullName = fullName.replace("c", "C");
        fullName = fullName.replace("h", "H");
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);

        String fillName = " Иванов Семён Семёнович";
        fillName = fillName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника -" + fillName);

    }
}