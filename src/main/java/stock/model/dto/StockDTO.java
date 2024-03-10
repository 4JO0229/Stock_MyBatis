package stock.model.dto;

public class StockDTO {
    private String title;
    private int count;
    private int price;

    public StockDTO(){}
    public StockDTO(String title, int price){
        this.title = title;
        this.price = price;
    }
    public StockDTO(String title, int count, int price){
        this.title = title;
        this.count = count;
        this.price = price;
    }

    public void setTitle(String title){this.title = title;}
    public void setCount(int count){this.count = count;}
    public void setPrice(int price){this.price = price;}

    public String getTitle(){return this.title;}
    public int getCount(){return this.count;}
    public int getPrice(){return this.price;}

    public String toString(){
        return "종목명 : " + this.title + ", 현재가 : " + this.price;
    }
}
