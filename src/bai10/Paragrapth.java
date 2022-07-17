package bai10;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Paragrapth {
    private String text;

    public Paragrapth() {
    }

    public Paragrapth(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void normalize() {
        text = text.trim();
        text = text.replaceAll("\\s+", " ");
        text = text.toLowerCase();

        String[] tempString = text.split(" ");
        text = Arrays.stream(tempString)
                .map(text -> String.valueOf(text.charAt(0)).toUpperCase() + text.substring(1))
                .collect(Collectors.joining(" "));
    }

    public int wordCount() {
        this.normalize();
        return text.split(" ").length;
    }

    public long charCount(String character) {
        return Arrays.stream(text.split(" "))
                .filter(c -> c.equalsIgnoreCase(character))
                .count();
    }

    public void show() {
        System.out.println(text);
    }


}
