package com.mycompany.agency;




public class StaffEmployee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;


    public StaffEmployee(String eName, String eAddress, String ePhone,
                         String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);

        this.socialSecurityNumber = socSecNumber;
        this.payRate = rate;
    }


    public String toString()
    {
        return (super.toString() +
                " SSN: " + socialSecurityNumber + " Pay Rate:  " + payRate);
    }


    public double pay()
    {
        return payRate;
    }
}
