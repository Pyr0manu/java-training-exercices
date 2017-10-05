package io.robusta.files;

import io.robusta.annotations.Fast;
import io.robusta.annotations.Slow;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DespacitoApplication {

    public static void main(String[] args) throws IOException {
        DespacitoApplication despacitoApplication = new DespacitoApplication();
        String content = despacitoApplication.readFromInternet("despacito.pw/bio.html");
        content = despacitoApplication.clean("http://despacito.pw/bio.html");
        despacitoApplication.writeInFile(content, "despacito.txt");

    }

    @Slow
    public String readFromInternet(String myUrl) throws IOException {

        URL url;
        try {
            url = new URL(myUrl);
        } catch (MalformedURLException e) {
            try {
                url = new URL("http://"+myUrl);
            } catch (MalformedURLException e1) {
                System.out.println("oups");
                url = null;
            }
        }
        URLConnection connection = url.openConnection();
        InputStream stream = connection.getInputStream();
        InputStreamReader reader = new InputStreamReader(stream);

        BufferedReader bufferedReader = new BufferedReader(reader);

        String result = "";
        String s;
        while ((s = bufferedReader.readLine()) != null){
            //System.out.println(s);
            result = result + s + "\n";
        }

        return result;
    }

    @Slow (expectedTime = 800)
    public String clean(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        String cleanContent = "";
        Elements bio = doc.select("p");
        for(Element element : bio){
            cleanContent += element.text() + "\n";
        }
        return cleanContent;
    }

    @Fast (40)
    public void writeInFile (String text, String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.flush();
        writer.close();

    }
}
