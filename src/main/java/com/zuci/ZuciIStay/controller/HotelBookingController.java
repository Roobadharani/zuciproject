package com.zuci.ZuciIStay.controller;

import com.zuci.ZuciIStay.model.Booking;
import com.zuci.ZuciIStay.model.BookingData;
import com.zuci.ZuciIStay.service.HotelBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class HotelBookingController {
    @Autowired
    HotelBookingService hotelBookingService;
    @PostMapping("/booking")
    public Booking createHotelBooking(@RequestBody Booking booking)
    {
        return hotelBookingService.createBooking(booking);
    }
    @GetMapping("/booking")
    public List<Booking> getAllHotelBooking()
    {
        return hotelBookingService.getAllBooking();
    }
    @GetMapping("/booking/{id}")
    public Booking getHotelBookingById(@PathVariable("id") int id)
    {
        return hotelBookingService.getBookingById(id);
    }
    @DeleteMapping("/booking/{bookingId}")
    public String deleteHotelBooking(@PathVariable("bookingId") int bookingId)
    {
        return hotelBookingService.DeleteBookingById(bookingId);
    }
    @GetMapping("/")
    public boolean getHistoryOfBookingByData(@RequestBody BookingData bookingData)
    {
        return hotelBookingService.getHistoryOfBookingByData(bookingData);
    }


}
