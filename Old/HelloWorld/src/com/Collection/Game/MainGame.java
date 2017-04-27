package com.Collection.Game;

import java.util.Scanner;

/**
 * Created by simd0922 on 23/03/2017.
 */
public class MainGame {
    public static void main(String[] args) {
        Game superGame = new Game();
        Scanner scanner = new Scanner(System.in);
        int loc = 1;

        while (true){
            System.out.println(superGame.getLocations().get(loc).getDescription());
            if(loc==0){
                break;
            }
            else{
                loc=scanner.nextInt();
                if(!superGame.getLocations().containsKey(loc)){
                    System.out.println("Cannot go There");
                }else{

                }

            }

        }
    }

}
