
import javax.swing.JOptionPane;


public class Objetos {

    private int id;
    private String name;
    private int category;
    private double price;
    private String aisle;
    private String bin;

    public Objetos(){        
    }
    
    public Objetos(int id, String name, int category, double price, int aisle, int bin) {
        this.id = id;
        this.name = name;
        this.category = setCategory(category);
        this.price = price;
        this.aisle = setAisle(aisle);
        this.bin = setBin(bin);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public int setCategory(int category) {
        if (category >= 0 && category <= 9){
            return category;
        } else {
            return -1;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAisle() {
        return aisle;
    }

    public String setAisle(int aisle) {
        if((Integer.toString(aisle)).length() == 3){
            return Integer.toString(aisle);
        } else {
            JOptionPane.showMessageDialog(null, "Dato ingresado no valido");
            return "";
        }
    }

    public String getBin() {
        return bin;
    }

    public String setBin(int bin) {
        if((Integer.toString(bin)).length() == 3){
            return Integer.toString(bin);
        } else {
            JOptionPane.showMessageDialog(null, "Dato ingresado no valido");
            return "";
        }
    }

    
    @Override
    public String toString() {
        return id + "," + name + "," + category + "," + price + "," + aisle + "," + bin;
    }

    
}
