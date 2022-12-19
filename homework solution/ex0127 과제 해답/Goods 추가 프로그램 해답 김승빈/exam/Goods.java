public class Goods {

    private String code;
    private String name;
    private int price;
    private String explain;

    public Goods(String code, int price, String explain) {
        this.code = code;
        this.price = price;
        this.explain = explain;
    }

    public Goods(String code, String name, int price, String explain) {
        this(code, price, explain);
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getExplain() {
        return explain;
    }

}
