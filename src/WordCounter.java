/*
build your dictionary which keeps track of unique words and their frequency
count from a text (refer to the tinyTale.txt on p371 of our text. The output
should conform to the left column on page 371
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter
{
        public static void main(String[] args)
        {
            String text =
                    "it was the best of times it was the worst of times " +
                    "it was the age of wisdom it was the age of foolishness " +
                    "it was the epoch of belief it was the epoch of incredulity " +
                    "it was the season of light it was the season of darkness " +
                    "it was the spring of hope it was the winter of despair";


            Map<String, Integer> wordCount = new HashMap<>();


            Scanner scanner = new Scanner(text);

            while (scanner.hasNext())
            {
                String word = scanner.next().toLowerCase(); // Convert to lowercase for uniformity
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }// end while loop

            scanner.close();


            for (Map.Entry<String, Integer> entry : wordCount.entrySet())
            {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }// end for loop



        }// end main
}// end class
