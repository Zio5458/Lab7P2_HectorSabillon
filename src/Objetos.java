
import javax.swing.JOptionPane;


public class Objetos {

    private int id;
    private String name;
    private int category;
    private double price;
    private int aisle;
    private int bin;

    public Objetos(){        
    }
    
    public Objetos(int id, String name, int category, double price, int isle, int bin) {
        this.id = id;
        this.name = name;
        this.category = setCategory(category);
        this.price = price;
        this.aisle = isle;
        this.bin = bin;
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

    public int getAisle() {
        return aisle;
    }

    public int setAisle(int aisle) {
        if((Integer.toString(aisle)).length() == 3){
            return aisle;
        } else {
            JOptionPane.showMessageDialog(null, "Dato ingresado no valido");
            return -1;
        }
    }

    public int getBin() {
        return bin;
    }

    public int setBin(int bin) {
        if((Integer.toString(bin)).length() == 3){
            return bin;
        } else {
            JOptionPane.showMessageDialog(null, "Dato ingresado no valido");
            return -1;
        }
    }

    
    @Override
    public String toString() {
        return id + "," + name + "," + category + "," + price + "," + aisle + "," + bin;
    }

    
}
