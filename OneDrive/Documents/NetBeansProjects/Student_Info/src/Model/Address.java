
package Model;

/**
 *
 * @author rutuj
 */
public class Address {
    String street;
    String apartment;
    String city;
    String zip;
    
    public Address(){
        this.street = "";
        this.apartment="";
        this.city="";
        this.zip="";
    }

    public String getStreet() {
        return street;
    }

    public String getApartment() {
        return apartment;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
  
    
}