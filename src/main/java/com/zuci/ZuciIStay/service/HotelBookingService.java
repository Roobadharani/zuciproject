package com.zuci.ZuciIStay.service;
import com.zuci.ZuciIStay.model.Booking;
import com.zuci.ZuciIStay.model.BookingData;

import java.util.List;

public interface HotelBookingService {

    Booking createBooking(Booking booking);
    List<Booking> getAllBooking();
    Booking getBookingById(int bookingId);
    String DeleteBookingById(int bookingId);
    boolean getHistoryOfBookingByData(BookingData bookingData);

}