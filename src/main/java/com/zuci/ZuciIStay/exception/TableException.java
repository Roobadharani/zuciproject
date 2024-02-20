package com.zuci.ZuciIStay.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Configuration
public class TableException {
    @ExceptionHandler(NoHotelPresentException.class)
    public String hotelException() {
        return "No Hotel Found!";
    }
    @ExceptionHandler(NoRoomAvailableException.class)
    public String roomException(){
        return "No Room Available!";
    }
    @ExceptionHandler(HotelBookingNotFoundException.class)
    public String bookingException(){return "No Booking Found!";}
}
