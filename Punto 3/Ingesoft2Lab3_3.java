/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingesoft2lab3_1;

/**
 *
 * @author German le yo
 */
public class Ingesoft2Lab3_3 {
    
    // Taken from https://es.wikipedia.org/wiki/Builder_(patr%C3%B3n_de_dise%C3%B1o)
    
    // Product 
    static class Song {
        private String name;
        private String lyrics;
        private String author;
        private int speed;
        
        public void setName(String name){this.name = name;}
        public void setAuthor(String author){this.author = author;}
        public void setLyrics(String lyrics){this.lyrics = lyrics;}
        public void setSpeed(int speed){this.speed = speed;}
        
        public void play() throws InterruptedException{
            System.out.printf("Now Playing %s from %s\n", name, author);
            
            for(int i = 0; i < 20; i++){
                System.out.println(lyrics);
                Thread.sleep(speed);
            }
            
        }

    }
    
    // Builder
    static abstract class Artist {
        protected Song song;
        
        public Artist(){
            this.song = new Song();
        }
        
        public abstract void buildName();
        public abstract void buildAuthor();
        public abstract void buildLyrics();
        public abstract void buildSpeed();
        
        public Song buildSong(){
            buildAuthor();
            buildLyrics();
            buildName();
            buildSpeed();
            
            return song;
        }
    }
    
    // Concrete builder
    static class LinkinPark extends Artist {

        @Override
        public void buildName() { song.setName("In the end"); }

        @Override
        public void buildAuthor() { song.setAuthor("Linkin Park"); }

        @Override
        public void buildLyrics() { song.setLyrics("In the end, it doesn't even matter..."); }

        @Override
        public void buildSpeed() { song.setSpeed(450); }
        
    }
    
    // Concrete builder
    static class AnuelAA extends Artist {

        @Override
        public void buildName() { song.setName("Ella quiere beber"); }

        @Override
        public void buildAuthor() { song.setAuthor("Anuel AA"); }

        @Override
        public void buildLyrics() { song.setLyrics("Ella quiere beber, ella quiere bailar"); }

        @Override
        public void buildSpeed() { song.setSpeed(930); }
        
    }
    
    // Director
    static class RecordCompany {
        
        private Artist band;
        
        public void setBand(Artist band){
            this.band = band;
        }
        
        public Song getSong(){
            return this.band.buildSong();
        }
        
    }

    
    
    public static void main(String[] args) throws InterruptedException {
        
        RecordCompany VEVO = new RecordCompany();
        
        VEVO.setBand(new LinkinPark());
        VEVO.getSong().play();
        
        VEVO.setBand(new AnuelAA());
        VEVO.getSong().play();
        
    }
}
