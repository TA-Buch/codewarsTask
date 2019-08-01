public class Item {
    private String name;
    private Integer sell_in;
    private Integer quality;

    Item(String a, Integer b, Integer c) {
        name = a;
        sell_in = b;
        quality = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public Integer getSellIn() {
        return sell_in;
    }

    public void setSellIn(Integer s) {
        sell_in = s;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer s) {
        quality = s;
    }
}
