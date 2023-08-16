package org.example.abstractfactory.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("1989", "Taylor");
        album.addSong("back to december", 3.5);
        album.addSong("you belong with me", 3.15);
        album.addSong("wildest dream", 3.25);
        album.addSong("enchanted", 3.35);
        album.addSong("blank space", 3.45);
        album.addSong("look what u make me do", 3.55);

        albums.add(album);

        album = new Album("2020", "Selena");
        album.addSong("who says", 3.5);
        album.addSong("love u like a love song", 3.5);
        album.addSong("i miss you", 3.5);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("you can't love him", playList);
        albums.get(0).addToPlayList("back to december", playList);
        albums.get(0).addToPlayList("you belong with me", playList);
        albums.get(0).addToPlayList("wildest dream", playList);
        albums.get(0).addToPlayList("enchanted", playList);

        albums.get(1).addToPlayList(5, playList);
        albums.get(1).addToPlayList(25, playList);
        albums.get(1).addToPlayList(1, playList);
        play(playList);


    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("no song in playlist");
        } else {
            System.out.println("now playing " + listIterator.next().toString());
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("reach the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("now playing "+listIterator.previous().toString());
                    }
                    else {
                        System.out.println("at start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    break;
                case 4:
//                    printList(playList);
                    break;
                case 5:
//                    printMenu();
                    break;
            }
        }
    }
}
