package productTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import product.Product;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ProductTest {

    private Product product;


    @ParameterizedTest()
    @MethodSource("stringIntAndListProvider")
    public void testGetter(int price, String name, int expectedPrice, String expectedName) {
        product = new Product(price, name);
        assertEquals(expectedName, product.getName());
        assertEquals(expectedPrice, product.getPrice());
    }

    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
                arguments(14, "Product1", 14, "Product1"),
                arguments(15, "Product2", 15, "Product2")
        );
    }
}
