package communityuni.com;

public class Main {
    public static void main(String[] args) {
        Staff personnel = new Staff();

        Executive boss = new Executive("Nguyễn Văn A", "Quận 1", "090123456", "SSN001", 5000);
        boss.awardBonus(1000);

        Hourly worker = new Hourly("Trần Thị B", "Quận 3", "090987654", "SSN002", 20);
        worker.addHours(40);

        Volunteer helper = new Volunteer("Lê Văn C", "Bình Thạnh", "091122334");

        personnel.addMember(boss);
        personnel.addMember(worker);
        personnel.addMember(helper);

        personnel.payday();
    }
}