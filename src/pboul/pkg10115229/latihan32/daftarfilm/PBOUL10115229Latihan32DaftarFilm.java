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
public class PBOUL10115229Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("====Daftar Film Yang Sedang Tayang======== \n");
        Film film = new Film();
        film.setFilmName("Venom");
        film.setFilmGenre("Action, Horro, Scifi");
        film.setFilmRating("9.0");
        film.setFilmDuration("120 Menit");
        film.nowPlaying();
        
        System.out.println("\n");
        
        Film film1 = new Film();
        film1.setFilmName("Small Foot");
        film1.setFilmGenre("Animation");
        film1.setFilmRating("9.0");
        film1.setFilmDuration("96 Menit");
        film1.nowPlaying();
        
        System.out.println("\n");
        
        Film film2 = new Film();
        film2.setFilmName("Crazy Rich Asian");
        film2.setFilmGenre("Comedi");
        film2.setFilmRating("7.8");
        film2.setFilmDuration("119 Menit");
        film2.nowPlaying();
        
        System.out.println("\n");
        
        Film film3 = new Film();
        film3.setFilmName("Asih");
        film3.setFilmGenre("Horror");
        film3.setFilmRating("6.0");
        film3.setFilmDuration("100 Menit");
        film3.nowPlaying();
        
        
    }
    
  
    
    
    
    
}
