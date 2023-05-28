package pojo;

public class BasicInfo {
    private String FirstName;
    private String Id;
    private String LastName;
    private  AddressInfo add;



    public String getFirstName() {
        return FirstName;
    }

    public AddressInfo getAdd() {
        return add;
    }

    public void setAdd(AddressInfo add) {
        this.add = add;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setAddressInfo(AddressInfo add) {
        this.add=add;
    }
}
