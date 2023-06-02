
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
    
    public Objetos(int id, String name, int category, double price, String isle, String bin) {
        this.id = id;
        this.name = name;
        this.category = setCategory(category);
        this.price = price;
        this.aisle = setIsle(isle);
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

    public String getIsle() {
        return aisle;
    }

    public String setIsle(String isle) {
        if (isle.length() != 3 && esNumero(isle)){
            JOptionPane.showMessageDialog(null, "Numero ingresado para el isle no es valido");
            return "";
        } else {
            return isle;
        }
    }

    public String getBin() {
        return bin;
    }

    public String setBin(String bin) {
        if (bin.length() != 3 && esNumero(bin)){
            JOptionPane.showMessageDialog(null, "Numero ingresado para el bin no es valido");
            return "";
        } else {
            return bin;
        }
    }

    public boolean esNumero(String num){
        int cont_numeros = 0;
        for (int i = 0; i < num.length(); i++){
            if ((int)num.charAt(i) >=48 && (int)num.charAt(i) <=57){
                cont_numeros++;
            }
        }
        if (cont_numeros == 3){
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El dato ingresado no es un nummero");
            return false;
        }
    }
    
    @Override
    public String toString() {
        return id + "," + name + "," + category + "," + price + "," + aisle + "," + bin;
    }

    
}
