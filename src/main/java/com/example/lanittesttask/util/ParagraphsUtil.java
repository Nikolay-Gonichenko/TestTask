package com.example.lanittesttask.util;

import com.example.lanittesttask.dto.Paragraph;

import java.util.ArrayList;
import java.util.List;

public class ParagraphsUtil {

    private static final String END_PARAGRAPH =
            "Надеюсь, это поможет Вам. Если у Вас" +
                    " есть какие-либо дополнительные " +
                    "вопросы, пожалуйста, не стесняйтесь " +
                    "спрашивать. С уважением, Земляне!";

    public static List<Paragraph> convertTextToParagraphs(String text, String raceCode) {
        List<Paragraph> paragraphs = new ArrayList<>();
        String[] parts = text.split("\n");
        for (String part: parts) {
            switch (raceCode) {
                case "A1":
                    part = part.replaceAll("Здравствуйте", "こんにちは");
                    break;
                case "A2":
                    part = part.replaceAll("Здравствуйте", "Dif-tor heh smusma");
                    break;
                case "A3":
                    part = part.replaceAll("Здравствуйте", "안녕하세요");
                    break;
            }
            paragraphs.add(new Paragraph(part.trim()));
        }

        paragraphs.add(new Paragraph(END_PARAGRAPH));

        return paragraphs;
    }
}
