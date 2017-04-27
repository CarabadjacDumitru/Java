package com.Collection.HascodeChallenge;

import com.Collection.advanced.Seat;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by simd0922 on 27/03/2017.
 */
public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i=1;i<=100;i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("Cubes are " + cubes.size()+" and squares are " + squares.size());

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("unions are " + union.size());
        System.out.println("Cubes are " + cubes.size()+" and squares are " + squares.size());

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("intersection are " + intersection.size());


    }

}
