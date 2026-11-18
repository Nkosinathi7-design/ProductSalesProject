
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    String[] products = {
        "Cozy Nights Monarch",
        "Restonic Barbados",
        "Sealy Phuket"
    };

    int[][] sales = {
        {25, 18, 20},
        {15, 10, 12},
        {18, 15, 20}
    };

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        Product product = new Product(products, sales);

        int result = product.GetTotalProductsSold();

        assertEquals(153, result);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        Product product = new Product(products, sales);

        double result = product.GetAverageProductSold();

        assertEquals(17.0, result, 0.001);
    }
}
