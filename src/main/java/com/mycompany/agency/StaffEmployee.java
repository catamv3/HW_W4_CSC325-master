package com.mycompany.agency;


// TODO 1: Make StaffEmployee a child of StaffMember (done)

public class StaffEmployee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    //  TODO 2: Sets up this staff employee with the specified
    //  information. (done)
    //-----------------------------------------------------------------
    public StaffEmployee(String eName, String eAddress, String ePhone,
                         String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);

        this.socialSecurityNumber = socSecNumber;
        this.payRate = rate;
    }

    //-----------------------------------------------------------------
    // TODO 3: complete the implementation of toString to return information
    //          about a staff employee as a string. (done)
    //-----------------------------------------------------------------
    public String toString()
    {
        return ("Name: " + super.name + " Address:  " + super.address + " Phone: " + super.phone +
                " SSN: " + socialSecurityNumber + " Pay Rate:  " + payRate);
    }

    //-----------------------------------------------------------------
    // TODO 4:  Returns the pay rate for this staff employee. (done)
    //-----------------------------------------------------------------
    public double pay()
    {
        return payRate;
    }
}
