package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < word.length / 2; index++) {
            char temp = word[index];
            word[index] = word[word.length - index - 1];
            word[word.length - index - 1] = temp;
        }
        for (int index = 0; index < post.length / 2; index++) {
            char temp = post[index];
            post[index] = post[post.length - index - 1];
            post[post.length - index - 1] = temp;
        }
        for (int index = 0; index < post.length; index++) {
            if (post[index] != word[index]) {
                result = false;
                break;
                /* проверить. что массив word имеет последние элементы одинаковые с post */
            }
        }
        return result;
    }
}