import java.util.Scanner;

public class TextMessage {

    //Переменная типа стринг класса TextMessage
    String txtmsg = "";


    // Конструктор по умолчанию класса TextMessage
   public TextMessage() {


    }

    // Конструктор с одним аргументом String text1 класса TextMessage
    public TextMessage(String text1){
        Scanner scanner = new Scanner(System.in);
        text1 = scanner.next();
      text1 = text1.replace("fuck", "f**k");
        text1 = text1.replace("Fuck", "F**k");
        text1 = text1.replace("FUCK", "F**K");
      text1 = text1.replace("bullshit", "b******t");
        text1 = text1.replace("Bullshit", "B******t");
        text1 = text1.replace("BULLSHIT", "B******T");

      System.out.println(text1);
   }


}
