import java.io.*;
import java.util.*;

class User {
    String email, password, role;
    double deposit = 30000;
    int carRented = 0, bikeRented = 0;

    User(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String toString() {
        return email + "," + password + "," + role + "," + deposit + "," + carRented + "," + bikeRented;
    }

    public static User fromString(String s) {
        String[] p = s.split(",");
        User u = new User(p[0], p[1], p[2]);
        u.deposit = Double.parseDouble(p[3]);
        u.carRented = Integer.parseInt(p[4]);
        u.bikeRented = Integer.parseInt(p[5]);
        return u;
    }
}

class Vehicle {
    int id;
    String name, type, plate;
    double rent;
    int available, kmRun;
    boolean serviced;

    Vehicle(int id, String name, String type, String plate, double rent, int available, int kmRun, boolean serviced) {
        this.id = id; this.name = name; this.type = type;
        this.plate = plate; this.rent = rent; this.available = available;
        this.kmRun = kmRun; this.serviced = serviced;
    }

    public String toString() {
        return id + "," + name + "," + type + "," + plate + "," + rent + "," + available + "," + kmRun + "," + serviced;
    }

    public static Vehicle fromString(String s) {
        String[] p = s.split(",");
        return new Vehicle(Integer.parseInt(p[0]), p[1], p[2], p[3], Double.parseDouble(p[4]), Integer.parseInt(p[5]), Integer.parseInt(p[6]), Boolean.parseBoolean(p[7]));
    }
}

class Rental {
    String email;
    int vehicleId;
    String date;
    double charge;

    Rental(String email, int vehicleId, String date, double charge) {
        this.email = email; this.vehicleId = vehicleId;
        this.date = date; this.charge = charge;
    }

    public String toString() {
        return email + "," + vehicleId + "," + date + "," + charge;
    }

    public static Rental fromString(String s) {
        String[] p = s.split(",");
        return new Rental(p[0], Integer.parseInt(p[1]), p[2], Double.parseDouble(p[3]));
    }
}

public class VehicleRentalSystem {
    static Scanner sc = new Scanner(System.in);
    static List<User> users = new ArrayList<>();
    static List<Vehicle> vehicles = new ArrayList<>();
    static List<Rental> rentals = new ArrayList<>();
    static final String USER_FILE = "users.txt";
    static final String VEHICLE_FILE = "vehicles.txt";
    static final String RENTAL_FILE = "rentals.txt";
    static User currentUser = null;

    public static void main(String[] args) {
        loadData();
        while (true) {
            System.out.println("1. Register\n2. Login\n3. Exit");
            int ch = Integer.parseInt(sc.nextLine());
            if (ch == 1) register();
            else if (ch == 2) {
                if ((currentUser = login()) != null) menu();
            } else break;
        }
    }

    static void register() {
        System.out.print("Email: "); String email = sc.nextLine();
        System.out.print("Password: "); String pw = sc.nextLine();
        System.out.print("Role (admin/borrower): "); String role = sc.nextLine();
        User u = new User(email, pw, role);
        users.add(u); saveAllUsers();
    }

    static User login() {
        System.out.print("Email: "); String email = sc.nextLine();
        System.out.print("Password: "); String pw = sc.nextLine();
        for (User u : users)
            if (u.email.equals(email) && u.password.equals(pw)) return u;
        System.out.println("Invalid."); return null;
    }

    static void menu() {
        if (currentUser.role.equals("admin")) adminMenu();
        else borrowerMenu();
    }

    static void adminMenu() {
        char ch;
        do {
            System.out.println("A) Add B) Modify C) Delete D) View E) Search F) Reports X) Logout");
            ch = sc.nextLine().toUpperCase().charAt(0);
            switch (ch) {
                case 'A': addVehicle(); break;
                case 'B': modifyVehicle(); break;
                case 'C': deleteVehicle(); break;
                case 'D': viewVehicles(true); break;
                case 'E': searchVehicle(); break;
                case 'F': adminReports(); break;
            }
        } while (ch != 'X');
    }

    static void borrowerMenu() {
        char ch;
        do {
            System.out.println("A) View Available B) Rent Vehicle C) Return Vehicle D) History X) Logout");
            ch = sc.nextLine().toUpperCase().charAt(0);
            switch (ch) {
                case 'A': viewVehicles(false); break;
                case 'B': rentVehicle(); break;
                case 'C': returnVehicle(); break;
                case 'D': viewHistory(); break;
            }
        } while (ch != 'X');
    }

    static void addVehicle() {
        System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
        System.out.print("Name: "); String name = sc.nextLine();
        System.out.print("Type (Car/Bike): "); String type = sc.nextLine();
        System.out.print("Plate: "); String plate = sc.nextLine();
        System.out.print("Rent: "); double rent = Double.parseDouble(sc.nextLine());
        System.out.print("Qty: "); int qty = Integer.parseInt(sc.nextLine());
        Vehicle v = new Vehicle(id, name, type, plate, rent, qty, 0, true);
        vehicles.add(v); saveAllVehicles();
    }

    static void modifyVehicle() {
        System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
        for (Vehicle v : vehicles) {
            if (v.id == id) {
                System.out.print("New Qty: "); v.available = Integer.parseInt(sc.nextLine());
                saveAllVehicles(); return;
            }
        }
    }

    static void deleteVehicle() {
        System.out.print("ID to delete: "); int id = Integer.parseInt(sc.nextLine());
        vehicles.removeIf(v -> v.id == id); saveAllVehicles();
    }

    static void viewVehicles(boolean all) {
        for (Vehicle v : vehicles) {
            if (all || (v.available > 0 && v.serviced))
                System.out.println(v.id + ": " + v.name + " (" + v.type + ") Rs." + v.rent + " Qty: " + v.available);
        }
    }

    static void searchVehicle() {
        System.out.print("Name or Plate: ");
        String s = sc.nextLine();
        for (Vehicle v : vehicles) if (v.name.contains(s) || v.plate.contains(s))
            System.out.println(v.id + " " + v.name);
    }

    static void rentVehicle() {
        viewVehicles(false);
        System.out.print("Vehicle ID: "); int id = Integer.parseInt(sc.nextLine());
        for (Vehicle v : vehicles) {
            if (v.id == id && v.available > 0 && v.serviced) {
                if ((v.type.equals("Car") && currentUser.carRented == 1) ||
                    (v.type.equals("Bike") && currentUser.bikeRented == 1)) {
                    System.out.println("Already rented."); return;
                }
                double min = v.type.equals("Car") ? 10000 : 3000;
                if (currentUser.deposit < min) {
                    System.out.println("Not enough deposit."); return;
                }
                currentUser.deposit -= v.rent;
                if (v.type.equals("Car")) currentUser.carRented = 1;
                else currentUser.bikeRented = 1;
                v.available--;
                rentals.add(new Rental(currentUser.email, id, new Date().toString(), v.rent));
                saveAll();
                System.out.println("Rented Successfully!");
                return;
            }
        }
        System.out.println("Not found.");
    }

    static void returnVehicle() {
        System.out.print("Vehicle ID to return: "); int id = Integer.parseInt(sc.nextLine());
        for (Vehicle v : vehicles) {
            if (v.id == id) {
                System.out.print("KMs used: "); int kms = Integer.parseInt(sc.nextLine());
                v.kmRun += kms;
                if ((v.type.equals("Car") && v.kmRun >= 3000) || (v.type.equals("Bike") && v.kmRun >= 1500))
                    v.serviced = false;
                if (kms > 500) {
                    double fine = v.rent * 0.15;
                    currentUser.deposit -= fine;
                    System.out.println("Extra km fine: Rs." + fine);
                }
                System.out.print("Damage? (LOW/MEDIUM/HIGH/NONE): ");
                String damage = sc.nextLine();
                if (!damage.equals("NONE")) {
                    double perc = damage.equals("LOW") ? 0.2 : damage.equals("MEDIUM") ? 0.5 : 0.75;
                    double fine = v.rent * perc;
                    currentUser.deposit -= fine;
                    System.out.println("Damage fine: Rs." + fine);
                }
                if (v.type.equals("Car")) currentUser.carRented = 0;
                else currentUser.bikeRented = 0;
                v.available++;
                saveAll();
                System.out.println("Returned!");
                return;
            }
        }
    }

    static void viewHistory() {
        for (Rental r : rentals)
            if (r.email.equals(currentUser.email))
                System.out.println(r.vehicleId + " " + r.date + " Rs." + r.charge);
    }

    static void adminReports() {
        System.out.println("Vehicles due for service:");
        for (Vehicle v : vehicles) if (!v.serviced) System.out.println(v.name);
        System.out.println("Sorted by Rent:");
        vehicles.stream().sorted(Comparator.comparingDouble(v -> v.rent)).forEach(v -> System.out.println(v.name + " Rs." + v.rent));
        System.out.println("Rented / Not Rented:");
        Set<Integer> rented = new HashSet<>();
        for (Rental r : rentals) rented.add(r.vehicleId);
        for (Vehicle v : vehicles)
            System.out.println(v.name + " - " + (rented.contains(v.id) ? "RENTED" : "NOT RENTED"));
    }

    static void loadData() {
        try (BufferedReader br = new BufferedReader(new FileReader(USER_FILE))) {
            String l; while ((l = br.readLine()) != null) users.add(User.fromString(l));
        } catch (Exception ignored) {}
        try (BufferedReader br = new BufferedReader(new FileReader(VEHICLE_FILE))) {
            String l; while ((l = br.readLine()) != null) vehicles.add(Vehicle.fromString(l));
        } catch (Exception ignored) {}
        try (BufferedReader br = new BufferedReader(new FileReader(RENTAL_FILE))) {
            String l; while ((l = br.readLine()) != null) rentals.add(Rental.fromString(l));
        } catch (Exception ignored) {}
    }

    static void saveAllUsers() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(USER_FILE))) {
            for (User u : users) bw.write(u + "\n");
        } catch (Exception ignored) {}
    }

    static void saveAllVehicles() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(VEHICLE_FILE))) {
            for (Vehicle v : vehicles) bw.write(v + "\n");
        } catch (Exception ignored) {}
    }

    static void saveAllRentals() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RENTAL_FILE))) {
            for (Rental r : rentals) bw.write(r + "\n");
        } catch (Exception ignored) {}
    }

    static void saveAll() {
        saveAllUsers(); saveAllVehicles(); saveAllRentals();
    }
}