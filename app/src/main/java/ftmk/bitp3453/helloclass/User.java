package ftmk.bitp3453.helloclass;

public class User {
    String fullname;
    String pwd;
    String address;
    String email;
    String birthdate;
    String gender;

    public User(String strFullName, String strPwd, String strAddress, String strEmail, String strBirth, String strGender) {
    }

    public String getFullname() {
    return fullname;
}

public String getPwd() {
    return pwd;
}

public String getAddress() {
    return address;
}

public String getEmail() {
    return email;
}

public String getBirthdate() {
    return birthdate;
}

public String getGender() {
    return gender;
}

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
