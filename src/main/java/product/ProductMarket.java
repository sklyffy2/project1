package product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class ProductMarket {

    List<Product> products;
    public ProductMarket(List<Product> products) {
        this.products = products;
    }
    public List<Product> getProducts() {
        return products;
    }
       public List<Integer> getAllPrice() {
        return products.stream()
                .map(Product::getPrice)
                .collect(Collectors.toList());
    }
    public List<String> getAllNames() {
        return products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }
    public List<Product> getPriceMoreThan(){
        return products.stream()
                .filter(product -> product.getPrice()>10)
                .collect(Collectors.toList());
    }
  public List<Product> getPriceLessThan() {
   return products.stream()
           .filter(product -> product.getPrice()<0)
           .collect(Collectors.toList());
  }
  public List<Product> getAllNamesSorted(){
        return products.stream()
                .sorted()
                .collect(Collectors.toList());
  }
}



