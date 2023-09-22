package com.mycompany.agency;


public class Intern extends StaffEmployee
{
    public Intern(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
    }

    public double pay()
    {
      return 0.00;
    }
}
