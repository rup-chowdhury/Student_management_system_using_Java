package studentmanagementsystem;


class User {
    private int ID;
    private String name,email,contactNumber,bloodGroup,course;
    
    public User(int ID, String contactNumber, String name, String email,String bloodGroup,String course)
    {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.bloodGroup= bloodGroup;
        this.course=course;
    }

    public int getID() {
        return ID;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }    
    public String getBloodGroup() {
        return bloodGroup;
    }
    public String getCourse() {
        return course;
    }
}
