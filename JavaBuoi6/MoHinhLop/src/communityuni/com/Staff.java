package communityuni.com;

import java.util.ArrayList;

public class Staff {
    private ArrayList<StaffMember> staffList;

    public Staff() {
        staffList = new ArrayList<>();
    }

    public void addMember(StaffMember member) {
        staffList.add(member);
    }

    public void payday() {
        for (StaffMember member : staffList) {
            System.out.println(member.toString());
            double amount = member.pay();
            if (amount == 0.0) {
                System.out.println("Thanh toán: Không có lương.");
            } else {
                System.out.println("Thanh toán: " + amount);
            }
            System.out.println("---------------------------------");
        }
    }
}
