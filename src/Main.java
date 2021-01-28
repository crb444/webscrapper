import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner ( System.in );

        System.out.println ( "Enter the players name: " );

        String player = keyboard.next ();


        //String player = "palad1n-dbt69x";
        String first_part_of_URL = "https://battlefieldtracker.com/bfv/profile/psn/";
        String last_part_of_URL = "/overview";
        String url = first_part_of_URL + player + last_part_of_URL;

        try {

            Document document = Jsoup.connect (url).get ();


            ArrayList<String> stats = new ArrayList<String> (  );


            for (Element row : document.select ( "div.numbers span" )) {
                if(!row.select ( "span.value" ).text ().isEmpty ()) {
                    String score = row.select ( "span.value" ).text ();
                    stats.add ( score );
                }
            }

            Player player1 = new Player();

            player1.score_min = stats.get ( 0 );
            player1.K_D = stats.get(1);
            player1.win_percentage = stats.get(3);
            player1.kills = stats.get(6);
            player1.deaths = stats.get(10);
            player1.wins = stats.get(9);


            System.out.println (player1);




        } catch (Exception e) {
            e.printStackTrace ();
        }

    }
}
