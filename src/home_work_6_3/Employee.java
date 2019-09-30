package home_work_6_3;

import java.io.File;
import java.util.Date;

public class Employee {
    private long employeeId;
    private String lastName;
    private String firstName;
    private String title;
    private String titleOfCourtesy;
    private Date birthDate;
    private Date hireDate;
    private String address;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private String homePhone;
    private String extension;
    private File photo;
    private String notes;
    private String reportsTo;

    public Employee(long employeeId,
                    String lastName,
                    String firstName,
                    String title,
                    String titleOfCourtesy,
                    Date birthDate,
                    Date hireDate,
                    String address,
                    String city,
                    String region,
                    String postalCode,
                    String country,
                    String homePhone,
                    String extension,
                    File photo,
                    String notes,
                    String reportsTo) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
        this.titleOfCourtesy = titleOfCourtesy;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.homePhone = homePhone;
        this.extension = extension;
        this.photo = photo;
        this.notes = notes;
        this.reportsTo = reportsTo;
    }
}
