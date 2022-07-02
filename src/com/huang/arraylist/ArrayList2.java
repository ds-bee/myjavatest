package com.huang.arraylist;

import com.itheima.arraylist.Movie;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("yanyuan",12,"adf"));
        movies.add(new Movie("yanyuan1",12,"adf"));
        movies.add(new Movie("yanyuan2",12,"adf"));

//        for (int i = 0; i < movies.size(); i++) {
//            movies[i]
//        }
        for (com.itheima.arraylist.Movie movie : movies) {
            System.out.println("片名：" + movie.getName());
            System.out.println("评分：" + movie.getScore());
            System.out.println("主演：" + movie.getActor());
        }
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println("片名：" + movie.getName());
            System.out.println("评分：" + movie.getScore());
            System.out.println("主演：" + movie.getActor());
        }



    }
}
