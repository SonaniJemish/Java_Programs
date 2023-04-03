public class Print_Value {
    public static void main (String args[]){
        Store s1=new Store();
        s1.setName("Osia Mart");
        s1.setAddress("Sector 26");
        System.out.println("Name : "+s1.getName()+"Address : "+s1.getAddress());
    }    
}

class Store{
    private String Name;
    private String Address;

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getAddress(){
        return Address;
    }
    public void setAddress(String Address){
        this.Address=Address;
    }
}
