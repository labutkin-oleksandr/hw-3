public class ATM {
    public int countBanknotes(int sum) {
    int[] banknotes = { 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int cash = sum;
        int count = 0;
        int element = 0;
		while(cash != 0) {
        int amountBanknot = cash / banknotes[element];
        count = count + amountBanknot;
        cash = cash - (amountBanknot * banknotes[element]);
        element = element + 1;
        }
      
		return count;
    }
  
}
