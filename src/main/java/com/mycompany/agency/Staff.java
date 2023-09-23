package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        StaffMember exec = new Executive("Leslie Fiene", "123 Red Lane", "516-111-1111", "111-22-3333",250000.0);
        StaffMember intrn = new Intern("Tom Collins", "789 Ocean Rd", "516-765-4444");
        StaffMember tempEmploy1 = new TempEmployee("Moaath Alrajab", "123 Farmingdale Rd","646-646-6464", "099-09-0000", 50.0);
        StaffMember tempEmploy2 = new TempEmployee("Albert Einstein", "489 Beach Rd","444-444-4444", "444-40-4040", 50.0);
        StaffMember tempEmploy3 = new TempEmployee("George Washington", "237 Washington Ave","516-555-5432", "555-50-5050", 50.0);
        StaffMember tempEmploy4 = new TempEmployee("Hannah Montanna", "90 Miley Court","777-707-7070", "880-80-8880", 50.0);

        // TODO 1: Add 6 emploees to the staffList
        staffList[0] = exec;
        staffList[1] = intrn;
        staffList[2] = tempEmploy1;
        staffList[3] = tempEmploy2;
        staffList[4] = tempEmploy3;
        staffList[5] = tempEmploy4;

        ((Executive)staffList[0]).awardBonus(500.00);
        ((TempEmployee)staffList[2]).addHours(40);
        ((TempEmployee)staffList[3]).addHours(40);
        ((TempEmployee)staffList[4]).addHours(40);
        ((TempEmployee)staffList[5]).addHours(40);






    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println("Employee - " + (count+1)+ staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
