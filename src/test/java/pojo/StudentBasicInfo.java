package pojo;

public class StudentBasicInfo {
    private String Name;
    private String Rollno;
    private String Id;
    private Address[] address;

    public Address[] getAddress() {
        return address;
    }

    public void setAddress(Address[] address) {
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getRollno() {
        return Rollno;
    }

    public void setRollno(String Rollno) {
        this.Rollno = Rollno;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
}
