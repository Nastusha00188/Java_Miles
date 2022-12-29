public class BonusMilesService {
    public int calculate(int cost) {
        int price = 20;
        int miles = 1;

        if (cost > price) {
            miles = (cost / price);
        } else {
            miles = 0;
        }
        return miles;
    }
}