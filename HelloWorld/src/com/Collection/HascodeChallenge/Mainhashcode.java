package com.Collection.HascodeChallenge;

/**
 * Created by simd0922 on 27/03/2017.
 */
public class Mainhashcode {
    public static void main(String[] args) {
        Dog bim = new Dog("BIM");
        Labrador lab = new Labrador("BIM");

        System.out.println(bim.equals(lab));
        System.out.println(lab.equals(bim));
    }
}
