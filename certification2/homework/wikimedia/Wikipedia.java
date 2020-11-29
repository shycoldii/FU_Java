package certification2.homework.wikimedia;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Wikipedia {
    public static void main(String[] args){
        //общение с пользователем
        Scanner in = new Scanner(System.in);
        String lang;
        String topic_code;
        print_help();
        String topic = "start";

        while (true){
            System.out.print("\u001B[34m"+"Введите тему: "+"\u001B[0m");
            topic = in.nextLine();
            if(topic.equals("")){
                print_exit();
                break;
            }
            topic_code = URLEncoder.encode(topic, StandardCharsets.UTF_8);
            lang = get_lang(topic,topic_code);
            Wikiparser.get_article(topic_code,lang);
        }
    }
    public static String get_lang(String topic,String topic_code){
        //вспомогательная ф-я для определения языка
        String lang;
        if (topic.equals(topic_code)){
            lang = "en";
        }
        else{
            lang = "ru";
        }
        return lang;
    }
    public static void print_help(){
        System.out.println("\u001B[34m"+"Добро пожаловать в консольную Wikipedia, введите свой запрос или нажмите enter для выхода."+"\u001B[0m");
    }
    public static void print_exit(){
        System.out.println("\u001B[34m"+"Выполняется выход...");
    }
}
