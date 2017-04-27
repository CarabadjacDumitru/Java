package com.Collection.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Theatre {
    private final String Name;
    private List<Seat> listSeats = new ArrayList<>();

    public Theatre(String name, int numRows, int seatsPerRow) {
        Name = name;
        int lastRow = 'A' + (numRows - 1);

        for (char row = 'A'; row < lastRow; row++)
            for (int seatNum = 1; seatNum < seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                listSeats.add(seat);
            }

    }

    public List<Seat> getListSeats() {
        return listSeats;
    }

    public String getName() {
        return Name;
    }
    public boolean reserveSeat(String seatNumber){
       /* Seat reqSeat = null;
        for(Seat seat : listSeats){
            if (seat.getSeatNumber().equals(seatNumber)){
                reqSeat = seat;
                break;
            }
        }

        if (reqSeat==null){
            System.out.println("Seat not found");

            return  reqSeat.reserve();
        }*/
       return true;
    }



}
