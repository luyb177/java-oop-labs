package com.school.labs.lab03.three;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler {
    public static void main() {
        String urlStr = "https://www.weather.com.cn/weather15d/101200113.shtml";
        StringBuilder html = new StringBuilder();

        try {
            // 1. 创建 url
            URI uri = new URI(urlStr);
            URL url = uri.toURL();

            // 2. 建立连接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/146.0.0.0 Safari/537.36");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String line;
            while ((line = reader.readLine()) != null) {
                html.append(line);
            }
            reader.close();

            // 匹配每个 li
            Pattern liPattern = Pattern.compile("<li.*?>(.*?)</li>");
            Matcher liMatcher = liPattern.matcher(html.toString());

            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("wuhan_weather.txt"));

            while (liMatcher.find()) {
                String block = liMatcher.group(1);

                String time = match(block, "class=\"time\">(.*?)</span>");
                String wea = match(block, "class=\"wea\">(.*?)</span>");
                String tem = match(block, "class=\"tem\">(.*?)</span>");
                String wind = match(block, "class=\"wind\">(.*?)</span>");
                String wind1 = match(block, "class=\"wind1\">(.*?)</span>");

                String result = time + "  " + wea + "  " + tem + "  " + wind + " " + wind1;

                System.out.println(result);
                writer.write(result);
                writer.newLine();
            }

            writer.close();
            System.out.println("爬取完成");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String match(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group(1).replaceAll("<.*?>", "").trim();
        }
        return "";
    }
}


/*
<ul class="t clearfix">
<li class="t">
<span class="time">周四（9日）</span>
<big class="png30 d301"></big>
<big class="png30 n02"></big>
<span class="wea">雨转阴</span>
<span class="tem"><em>23℃</em>/18℃</span>
<span class="wind">北风</span>
<span class="wind1"><3级</span>
</li>
<li>
<span class="time">周五（10日）</span>
<big class="png30 d301"></big>
<big class="png30 n02"></big>
<span class="wea">雨转阴</span>
<span class="tem"><em>26℃</em>/18℃</span>
<span class="wind">东北风转东风</span>
<span class="wind1"><3级</span>
</li>
<li class="t">
<span class="time">周六（11日）</span>
<big class="png30 d02"></big>
<big class="png30 n301"></big>
<span class="wea">阴转雨</span>
<span class="tem"><em>23℃</em>/14℃</span>
<span class="wind">东风转南风</span>
<span class="wind1"><3级</span>
</li>
<li>
<span class="time">周日（12日）</span>
<big class="png30 d301"></big>
<big class="png30 n02"></big>
<span class="wea">雨转阴</span>
<span class="tem"><em>19℃</em>/13℃</span>
<span class="wind">南风转西北风</span>
<span class="wind1"><3级</span>
</li>
<li class="t">
<span class="time">周一（13日）</span>
<big class="png30 d01"></big>
<big class="png30 n02"></big>
<span class="wea">多云转阴</span>
<span class="tem"><em>22℃</em>/13℃</span>
<span class="wind">北风</span>
<span class="wind1"><3级</span>
</li>
<li>
<span class="time">周二（14日）</span>
<big class="png30 d301"></big>
<big class="png30 n02"></big>
<span class="wea">雨转阴</span>
<span class="tem"><em>18℃</em>/12℃</span>
<span class="wind">西北风转北风</span>
<span class="wind1"><3级</span>
</li>
<li class="t">
<span class="time">周三（15日）</span>
<big class="png30 d02"></big>
<big class="png30 n02"></big>
<span class="wea">阴</span>
<span class="tem"><em>26℃</em>/15℃</span>
<span class="wind">北风转东风</span>
<span class="wind1"><3级</span>
</li>
<li>
<span class="time">周四（16日）</span>
<big class="png30 d02"></big>
<big class="png30 n02"></big>
<span class="wea">阴</span>
<span class="tem"><em>25℃</em>/15℃</span>
<span class="wind">西南风转西风</span>
<span class="wind1"><3级</span>
</li>
 */