
import javax.swing.JOptionPane;


public class Objetos {

    private int id;
    private String name;
    private int category;
    private double price;
    private int isle;
    private int bin;

    public Objetos(int id, String name, int category, double price, int isle, int bin) {
        this.id = id;
        this.name = name;
        this.category = setCategory(category);
        this.price = price;
        this.isle = setIsle(isle);
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
        if(category >= 0 && category <= 9){
            return category;
        } else {
            JOptionPane.showMessageDialog(null, "El numero ingresado para categoria no es valido");
            return -1;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIsle() {
        return isle;
    }

    public int setIsle(int isle) {
        if (Integer.toString(isle).length() != 3){
            JOptionPane.showMessageDialog(null, "Numero ingresado para el isle no es valido");
            return 0;
        } else {
            return isle;
        }
    }

    public int getBin() {
        return bin;
    }

    public int setBin(int bin) {
        if (Integer.toString(bin).length() != 3){
            JOptionPane.showMessageDialog(null, "Numero ingresado para el bin no es valido");
            return 0;
        } else {
            return bin;
        }
    }

}
