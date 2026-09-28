//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Population of arrays
 String [] game = {"PS5", "xbox", "SWITCH"};
 String [] city = {"Cape Town", "Port Elizabeth", "Pretoria"};
 int [][] sales = {{1000,2000,3000}, {2000,3000,4000}, {1500,1100,1200}};

    System.out.println("---------------------------------------------------------------------------------");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("---------------------------------------------------------------------------------");
// designing the grid
    System.out.printf("%-18s", "");
    for (int g =0; g<game.length; g++ ){
        System.out.printf("%-8s" , game[g]);
    }
    System.out.println();

  for (int c=0; c< city.length; c++){
      System.out.printf("%-18s", city[c]);
      for (int s=0; s<sales.length; s++){
          System.out.printf("%-8d", sales[c][s]);
      }
      System.out.println();
  }
    System.out.println();
    System.out.println("---------------------------------------------------------------------------------");
    System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
    System.out.println("---------------------------------------------------------------------------------");
// separate calculation for total
    int [] Total  = new int [city.length];
    for (int c=0 ; c<city.length; c++){
        for (int v=0; v<game.length;v++){
            Total [c] += sales [c][v];
        }
    }
    // calculates the maximum
    int maximum = 0;
    int maxCity = 0;
     for (int c=0; c<city.length;c++){
         System.out.println(city[c] + "  " + Total[c]); // displays the total

         if (Total[c]> maximum) {
             maximum = Total[c];
             maxCity = c;
         }

     }
    System.out.println();
    System.out.println("CITY WITH THE MOST SALES: " + city[maxCity]);// displays the city with the highest city
    System.out.println("---------------------------------------------------------------------------------");
}
