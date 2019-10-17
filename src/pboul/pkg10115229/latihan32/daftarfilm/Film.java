/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan32.daftarfilm;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * Nama     : Muhammad Lukman Hakim
 * Kelas    : PBO ULANG
 */
public class Film {
    
    public String filmName;
    public String filmGenre;
    public String filmRating;
    public String filmDuration;

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public String getFilmRating() {
        return filmRating;
    }

    public void setFilmRating(String filmRating) {
        this.filmRating = filmRating;
    }

    public String getFilmDuration() {
        return filmDuration;
    }

    public void setFilmDuration(String filmDuration) {
        this.filmDuration = filmDuration;
    }
    
    
    
    public void nowPlaying(){
        System.out.println("Judul Film: " +filmName);
        System.out.println("Genre Film: " +filmGenre);
        System.out.println("Rating Film: " +filmRating);
        System.out.println("Duration Film: " +filmDuration);
    }
    
    
}
