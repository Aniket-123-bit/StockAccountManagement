package StockAccountService;
import org.json.JSONArray;
public abstract class StockAccountInterface {
    public abstract JSONArray buyShare(String companyName, JSONArray array);
    public abstract JSONArray sellShare(JSONArray array);
    public abstract void display(JSONArray jsonArray);
    public abstract void calculateEachValue(JSONArray jsonArray);
    public abstract void calculateTotalValue(JSONArray jsonArray);

}
