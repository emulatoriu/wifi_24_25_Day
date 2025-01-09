package products.logic;

import products.data.Product;

import java.util.List;

public class ProductService {
    public List<Double> getProductsWithVat(List<Product> products) {
        return products.stream()
                .map(product -> product.price() * 1.2)
                .toList();
    }
}
