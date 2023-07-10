import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



/*
Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
Фамилия Имя Отчество датарождения номертелефона пол

Форматы данных:
фамилия, имя, отчество - строки
датарождения - строка формата dd.mm.yyyy
номертелефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.

Приложение должно проверить введенные данные по количеству.
Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение,
что он ввел меньше и больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
Можно использовать встроенные типы java и создать свои.
Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием,
равным фамилии, в него в одну строку должны записаться полученные данные, вида

<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом.

При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
пользователь должен увидеть стектрейс ошибки.

Критерии оценивания:
Слушатель напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке,
разделенные пробело
 */
public class Final_Task {
    public static void main(String[] args) {

        CheckExceptions userExceptions = new CheckExceptions();
        User usr = new User();

        while (true){
            String line = inputString();
            try {
                userExceptions.wordsCountCheck(line);
                ArrayList <String> words = new ArrayList(Arrays.asList(line.split(" ")));
                usr = userExceptions.wordsCheck(words);
                File file = new File(usr.getLastName()+".txt");
                if (file.createNewFile()){
                    System.out.println("File is created!");
                }
                else{
                    System.out.println("File already exists.");
                }
                try (FileWriter writer = new FileWriter(file, true)) {
                    writer.write(usr.toString()+"\n");
                    System.out.println("Data writing to file " + file.getName());
                    break;
                }


            } catch (wordsCountCheckException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println("File error: " + e.getMessage());
            }
        }




//        1. Метод который парсит строку и проверяет кол-во введенных параметров
//        2. Метод который определяет тип параметра и запускает соответствующий метод для проверки параметра на корректность ввода
//        3. Метод проверяющий наличие файла с фамилией
//        4. Метод создающий файл (если нет файла с такой фамилией)
//        5. Метод записывающий данные в файл

    }

    static String inputString () {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Last name, First name, Date of birth, Phone number and Gender:");
        return input.nextLine();
    }
}
