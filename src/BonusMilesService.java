public class BonusMilesService {

    public int calculate(int price) {
        int result;
        int bonuses = 20;
        result = price / bonuses;
        return result;
    }
}
