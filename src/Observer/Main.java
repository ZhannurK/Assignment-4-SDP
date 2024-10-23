package Observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");

        agency.addObserver(channel1);
        agency.addObserver(channel2);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the latest news: ");
        String news = scanner.nextLine();

        agency.setLatestNews(news);

        scanner.close();
    }
}