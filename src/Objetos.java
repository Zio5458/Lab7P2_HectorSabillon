
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
        this.category = category;
        this.price = price;
        this.aisle = Integer.toString(aisle);
        this.bin = Integer.toString(bin);
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

    public void setCategory(int category) {
        if (category >= 0 || category <= 9){
            this.category = category;
        } else {
            System.out.println("Ingrese una categoria entre 0 y 9");
            return;
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

    public void setAisle(int aisle) {
        if((Integer.toString(aisle)).length() == 3){
            this.aisle = Integer.toString(aisle);
        } else {
            JOptionPane.showMessageDialog(null, "Dato ingresado no valido");
            this.aisle = "";
        }
    }

    public String getBin() {
        return bin;
    }

    public void setBin(int bin) {
        if((Integer.toString(bin)).length() == 3){
            this.bin =  Integer.toString(bin);
        } else {
            JOptionPane.showMessageDialog(null, "Dato ingresado no valido");
            this.bin = "";
        }
    }

    
    @Override
    public String toString() {
        return id + "," + name + "," + category + "," + price + "," + aisle + "," + bin;
    }

    
}
