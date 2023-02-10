public class Main {
    public static void main(String[] args) {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        System.out.println("ФИО сотрудника = " + firstName +  " " + middleName + " " + lastName);


        String fullName = firstName + " " + middleName + " " + lastName;
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperFullName);

        String fillName = " Иванов Семён Семёнович";
        fillName = fillName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника -" + fillName);
    }
}