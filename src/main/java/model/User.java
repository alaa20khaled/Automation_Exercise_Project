package model;

public class User {

        private String title;
        private String password;
        private String day;
        private String month;
        private String year;


        private String firstName;
        private String lastName;
        private String company;
        private String address1;
        private String address2;
        private String country;
        private String city;
        private String state;

    public String getZIPCode() {
        return ZIPCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    private String ZIPCode;
    private String mobileNumber;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User(String title, String password, String day, String month, String year,
                String firstName, String lastName, String company,
                String address1, String address2, String country,
                String city, String state, String ZIPCode, String mobileNumber) {
        this.title = title;
        this.password = password;
        this.day = day;
        this.month = month;
        this.year = year;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.country = country;
        this.city = city;
        this.state = state;
        this.ZIPCode = ZIPCode;
        this.mobileNumber = mobileNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }




}
