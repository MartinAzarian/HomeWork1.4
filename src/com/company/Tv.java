package com.company;

public class Tv {
   private  int channel;
   private int volume;
   private boolean on = false;
   private boolean turnOnOrOffTheTv(String onOrOff)
   {
      if(onOrOff.equals("on"))
      {
         this.on = true;
      }
      else if (onOrOff.equals("off"))
      {
         this.on = false;
      }
      return this.on;
   }
}
