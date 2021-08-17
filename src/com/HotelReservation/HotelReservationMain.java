package com.HotelReservation;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class HotelReservationMain
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("LakeWood", 110, 90, 3, 80, 80);
        hotelReservation.addHotel("BridgeWood", 150, 50, 4, 110, 50);
        hotelReservation.addHotel("RidgeWood", 220, 150, 5, 100, 40);
        hotelReservation.getHotelDetails();
        //giving start and end dates of the schedule
        LocalDate dateStart = LocalDate.of(2020, Month.SEPTEMBER, 11);
        LocalDate dateEnd = LocalDate.of(2020, Month.SEPTEMBER, 12);
        System.out.println("Starting date : "+dateStart);
        System.out.println("Ending date : "+dateEnd);
        int noOfDays = (int) ChronoUnit.DAYS.between(dateStart, dateEnd)+1;
        System.out.println("Total days is : "+noOfDays);
        //finding getWeekDaysCount
        int weekEndsCount = hotelReservation.getWeekDaysCount(dateStart, noOfDays);
        int weekDaysCount = noOfDays - weekEndsCount;
        boolean cont = true;
        while (cont){
            System.out.println("1:Reward Rated Hotels 2:Normal Hotel Rates 0:Exit");
            int opt = sc.nextInt();
            switch (opt){
                case 1:
                    boolean cont1 = true;
                    while (cont1){
                        System.out.println("1:Cheapest best rated hotel 2:cheapest best rated hotel Hotel 0:Exit");
                        System.out.println("1:Cheapest best rated hotel 2:Cheapest best rated hotel Hotel 3:Cheapest best rated hotel Hotel 0:Exit");
                        int opt1 = sc.nextInt();
                        switch (opt1){
                            case 1:
                            	{
    //this class will do booking hotels and list of hotels and finding weekdays count and finding best rated and best coast hotel
                            		hotelReservation.getMinPriceBestRatedHotel(weekEndsCount, weekDaysCount, 2);
                            		break;
                            case 3:
                                //finding best rated and best coast hotel
                                hotelReservation.getMinPriceHotel(weekEndsCount, weekDaysCount, opt);
                                break;
                            case 0:
                                cont1 = false;
                                break;
                        }
                    }
                case 2:
                    boolean cont2 = true;
                    while (cont2){
                        System.out.println("1:Best Minimum price range Hotel 2:Best Minimum price range with average rated Hotel 3:Best Rated Hotel Or 0:toExit");
                        int opt2 = sc.nextInt();
                        switch (opt2){
                            case 1:
                                hotelReservation.getMinPriceHotel(weekEndsCount, weekDaysCount, opt);
                                break;
                            case 2:
                                hotelReservation.getMinPriceHotel(weekEndsCount, weekDaysCount, opt);
                                break;
                            case 3:
                                hotelReservation.getMinPriceHotel(weekEndsCount, weekDaysCount, opt);
                                break;
                            case 0:
                                cont=false;
                                break;
                        }
                    }
                case 0:
                    cont = false;
                    break;
            }
        }
    }
