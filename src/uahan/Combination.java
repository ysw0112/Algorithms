package uahan;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Item {

  private String name;
  private int qty;
  private BigDecimal price;

  Item(String name, int qty, BigDecimal price){
    this.name = name;
    this.qty = qty;
    this.price = price;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public int getQty() {
    return qty;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }
  //constructors, getter/setters
}

public class Combination {
  public static void main(String[] ar){
    //3 apple, 2 banana, others 1
    List<Item> items = Arrays.asList(
            new Item("apple", 10, new BigDecimal("9.99")),
            new Item("banana", 20, new BigDecimal("19.99")),
            new Item("orang", 10, new BigDecimal("29.99")),
            new Item("watermelon", 10, new BigDecimal("29.99")),
            new Item("papaya", 20, new BigDecimal("9.99")),
            new Item("apple", 10, new BigDecimal("9.99")),
            new Item("banana", 10, new BigDecimal("19.99")),
            new Item("apple", 20, new BigDecimal("9.99"))
    );

    //group by price
    Map<BigDecimal, List<Item>> groupByPriceMap =
            items.stream().collect(Collectors.groupingBy(Item::getPrice));

    System.out.println(groupByPriceMap);

    // group by price, uses 'mapping' to convert List<Item> to Set<String>
    Map<BigDecimal, Set<String>> result =
            items.stream().collect(
                    Collectors.groupingBy(Item::getPrice,
                            Collectors.mapping(Item::getName, Collectors.toSet())
                    )
            );

    System.out.println(result);
  }
}
