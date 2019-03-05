/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author johan
 */
public class Time {
    // The private instance variables

    private int second;
    private int minute;
    private int hour;

    // The constructors (overloaded)
    public Time(int second, int minute, int hour) {
        // No input validation
        setSecond(second);
        setMinute(minute);
        setHour(hour);
    }

    public Time() {
        setSecond(0);
        setMinute(0);
        setHour(0);
    }
    
    public int getSecond() {
        return this.second;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getHour() {
        return this.hour;
    }

     public void setSecond(int second) {
      if (second >=0 && second <= 59) {
         this.second = second;
      } else {
         this.second = 0;  // Set to 0 and print error message
         System.out.println("error: invalid second");
      }
   }
   public void setMinute(int minute) {
      if (minute >=0 && minute <= 59) {
         this.minute = minute;
      } else {
         this.minute = 0;
         System.out.println("error: invalid minute");
      }
   }
   public void setHour(int hour) {
      if (hour >=0 && hour <= 23) {
         this.hour = hour;
      } else {
         this.hour = 0;
         System.out.println("error: invalid hour");
      }
   }

    // Return "hh:mm:ss" with leading zeros.
    public String toString() {
        // Use built-in function String.format() to form a formatted String
        return String.format("%02d:%02d:%02d", hour, minute, second);
        // Specifier "0" to print leading zeros, if available.
    }

    // Set second, minute and hour
    public void setTime(int second, int minute, int hour) {
        // No input validation
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    // Increment this instance by one second, and return this instance.
    public Time nextSecond() {
        ++second;
        if (second >= 60) {
            second = 0;
            ++minute;
            if (minute >= 60) {
                minute = 0;
                ++hour;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public Time previousSecond() {
        --second;
        if (second < 0) {
            second = 59;
            --minute;
            if (minute < 0) {
                minute = 59;
                --hour;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }
}
