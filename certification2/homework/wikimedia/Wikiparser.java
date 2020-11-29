package certification2.homework.wikimedia;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Wikiparser {
    public static String get_api_url(String lang,String topic_code){
        //функция для получения названий статей
        return "https://"+lang+".wikipedia.org/w/api.php?action=opensearch&format=json&search="+topic_code;
    }
    public static String get_content_url(String lang){
        //получение информации по конкретному имени
        return "https://"+lang+".wikipedia.org/w/api.php?action=query&prop=revisions&explaintext&exsectionformat=plain" +
                "&prop=extracts&format=json&redirects&titles=";
    }
    public static String url_connection(String api) throws IOException {
        //установление соединения и получение информации
        URL url = new URL(api);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String response = in.readLine();
        in.close();
        return response;
    }
    public static void get_article(String topic_code, String lang){
        //преобразование информации
        Gson gson = new Gson();
        String apiUrl = get_api_url(lang,topic_code);
        String contentUrl = get_content_url(lang);
        String topic = topic_code;
        if (lang.equals("ru")){
            topic = URLDecoder.decode(topic_code, StandardCharsets.UTF_8);
        }
        try {
            String response = url_connection(apiUrl);
            int flag = 1;
            JsonArray jsonObject = gson.fromJson(response, JsonArray.class);
            JsonArray titles = (JsonArray) jsonObject.get(1);
            if (titles.size() != 0){
                for (JsonElement i: titles){
                    String string = i.toString();
                    string = string.replaceAll("\"","");
                    if (string.toLowerCase().equals(topic.toLowerCase())){
                        System.out.printf("\u001B[34m"+"По запросу %s найдено: \n"+"\u001B[0m",topic);
                        if (lang.equals("ru")){
                            string = URLEncoder.encode(string, StandardCharsets.UTF_8);
                        }
                        contentUrl+=string;
                        response = url_connection(contentUrl);
                        JsonObject title_info = gson.fromJson(response, JsonObject.class);
                        JsonElement info = title_info.getAsJsonObject("query").get("pages");
                        String page_id = null;
                        for (Object j: info.getAsJsonObject().keySet()){
                            page_id = (String) j;
                        }
                        //article - полученная полная статья, но мы берем лишь маленький кусочек для "демо-версии"
                        String raw_article = info.getAsJsonObject().get(page_id).getAsJsonObject().get("extract").toString();
                        String article =  raw_article.substring(1,raw_article.length()-1).replaceAll( "\\\\n", "\n");
                        int index_break = article.indexOf("\n\n\n");
                        if(index_break!=-1){
                            System.out.println(article.substring(0,index_break));
                        }
                        else{
                            System.out.println(article);
                        }
                        break;
                    }
                    else{
                        //вывод всех тем, похожих на заданную
                        if (flag == 1){
                            System.out.println("\u001B[34m"+"Конкретной статьи не было найдено, но, возможно, вы искали:"+"\u001B[0m");
                            flag = 0;
                        }
                        System.out.println(string);
                    }
                }
            }
            else{
                System.out.println("\u001B[34m"+"Запрос не найден :("+"\u001B[0m");
            }
        } catch (Exception e) {
            System.out.println("\u001B[31m"+"Соединение прервано, перезаходим..."+"\u001B[0m");
            get_article(topic_code,lang);
        }
    }
}
