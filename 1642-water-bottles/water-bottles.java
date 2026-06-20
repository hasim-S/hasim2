class Solution {
    public int numWaterBottles(int num, int exchange) {
      int total=num;
      int emptybottle=num;
      while(emptybottle>=exchange){
     int newbottle=emptybottle/exchange;
      total +=newbottle;
     int remaining=emptybottle % exchange;
      emptybottle=newbottle+ remaining;
      }
      return total;
    }
}