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
    private String zipCode;
    private String mobileNumber;

    private User(Builder builder) {
        this.title = builder.title;
        this.password = builder.password;
        this.day = builder.day;
        this.month = builder.month;
        this.year = builder.year;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.company = builder.company;
        this.address1 = builder.address1;
        this.address2 = builder.address2;
        this.country = builder.country;
        this.city = builder.city;
        this.state = builder.state;
        this.zipCode = builder.zipCode;
        this.mobileNumber = builder.mobileNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    // ========= Getters فقط =========
    public String getTitle() { return title; }
    public String getPassword() { return password; }
    public String getDay() { return day; }
    public String getMonth() { return month; }
    public String getYear() { return year; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getCompany() { return company; }
    public String getAddress1() { return address1; }
    public String getAddress2() { return address2; }
    public String getCountry() { return country; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZipCode() { return zipCode; }
    public String getMobileNumber() { return mobileNumber; }

    public String getZIPCode() {
        return zipCode;
    }

    // ========= Builder =========
    public static class Builder {

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
        private String zipCode;
        private String mobileNumber;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder day(String day) {
            this.day = day;
            return this;
        }

        public Builder month(String month) {
            this.month = month;
            return this;
        }

        public Builder year(String year) {
            this.year = year;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder company(String company) {
            this.company = company;
            return this;
        }

        public Builder address1(String address1) {
            this.address1 = address1;
            return this;
        }

        public Builder address2(String address2) {
            this.address2 = address2;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder mobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
