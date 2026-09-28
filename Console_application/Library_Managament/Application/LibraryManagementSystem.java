import java.io.*;
import java.util.*;
class User {
    String email;
    String password;
    String role;
    User(String email, String password, String role) 
    {
        this.email = email;
        this.password = password;
        this.role = role;
    }
    @Override
    public String toString() {
        return email + "," + password + "," + role;
    }

    public static User fromString(String line) {
        String[] parts = line.split(",");
        return new User(parts[0], parts[1], parts[2]);
    }
}

class Book {
    String isbn;
    String name;
    int quantity;
    double cost;

    Book(String isbn, String name, int quantity, double cost) {
        this.isbn = isbn;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return isbn + "," + name + "," + quantity + "," + cost;
    }

    public static Book fromString(String line) {
        String[] parts = line.split(",");
        return new Book(parts[0], parts[1], Integer.parseInt(parts[2]), Double.parseDouble(parts[3]));
    }
}

public class LibraryManagementSystem {

    static Scanner scanner = new Scanner(System.in);
    static List<User> users = new ArrayList<>();
    static List<Book> books = new ArrayList<>();
    static Map<String, List<String>> borrowerHistory = new HashMap<>();
    static final String USER_FILE = "users.txt";
    static final String BOOK_FILE = "books.txt";

    public static void main(String[] args) {
        loadUsers();
        loadBooks();
        System.out.println("===== Welcome to Library Management System =====");

        User loggedInUser = null;
        while (loggedInUser == null) {
            System.out.println("\n1. Register\n2. Login\nEnter your choice: ");
            int action = Integer.parseInt(scanner.nextLine());
            if (action == 1) {
                register();
            } else if (action == 2) {
                loggedInUser = login();
                if (loggedInUser == null) {
                    System.out.println("Invalid credentials. Try again.");
                }
            } else {
                System.out.println("Invalid choice.");
            }
        }
        char choice;    
        do {
            System.out.println("\n\nChoose a Module:");
            System.out.println("A. Authentication & Welcome Menu");
            System.out.println("B. Book Inventory Management");
            System.out.println("C. Borrowing Book");
            System.out.println("D. Fine & Regulations");
            System.out.println("E. Reports");
            System.out.println("X. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine().toUpperCase().charAt(0);

            switch (choice) {
                case 'A': moduleA(loggedInUser); break;
                case 'B': moduleB(loggedInUser); break;
                case 'C': moduleC(loggedInUser); break;
                case 'D': moduleD(loggedInUser); break;
                case 'E': moduleE(loggedInUser); break;
                case 'X': System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 'X');
    }
    static void loadUsers() {
        File file = new File(USER_FILE);
        if (!file.exists()) return;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                users.add(User.fromString(line));
            }
        } catch (IOException e) {
            System.out.println("Error loading users: " + e.getMessage());
        }
    }
    static void saveUser(User user) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(USER_FILE, true))) {
            bw.write(user.toString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error saving user: " + e.getMessage());
        }
    }

    static void loadBooks() {
        File file = new File(BOOK_FILE);
        if (!file.exists()) return;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                books.add(Book.fromString(line));
            }
        } catch (IOException e) {
            System.out.println("Error loading books: " + e.getMessage());
        }
    }

    static void saveBook(Book book) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(BOOK_FILE, true))) {
            bw.write(book.toString());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error saving book: " + e.getMessage());
        }
    }

    static void register() {
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        System.out.print("Enter Role (admin/borrower): ");
        String role = scanner.nextLine().toLowerCase();
        User user = new User(email, password, role);
        users.add(user);
        saveUser(user);
        System.out.println("Registration successful. You can now login.");
    }

    static User login() {
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        for (User u : users) {
            if (u.email.equals(email) && u.password.equals(password)) {
                return u;
            }
        }
        return null;
    }

    static void moduleA(User user) {
        System.out.println("Welcome, " + user.role.toUpperCase() + " - " + user.email);
        if (user.role.equals("admin")) {
            System.out.println("You can manage books, users, and reports.");
        } else {
            System.out.println("You can borrow books and view fines.");
        }
    }

    static void moduleB(User user) {
        if (!user.role.equals("admin")) {
            System.out.println("Access Denied: Admins only.");
            return;
        }
        System.out.println("\nBook Inventory Management");
        System.out.println("1. Add Book\n2. Modify Book\n3. Delete Book\n4. View Books");
        int ch = scanner.nextInt(); scanner.nextLine();
        switch (ch) {
            case 1: addBook(); break;
            case 2: modifyBook(); break;
            case 3: deleteBook(); break;
            case 4: viewBooks(); break;
            default: System.out.println("Invalid option");
        }
    }

    static void addBook() {
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = scanner.nextInt();
        System.out.print("Enter Cost: ");
        double cost = scanner.nextDouble();
        scanner.nextLine();
        Book book = new Book(isbn, name, qty, cost);
        books.add(book);
        saveBook(book);
        System.out.println("Book Added.");
    }

    static void modifyBook() {
        System.out.print("Enter ISBN to Modify: ");
        String isbn = scanner.nextLine();
        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                System.out.print("New Quantity: ");
                b.quantity = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Book Updated.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    static void deleteBook() {
        System.out.print("Enter ISBN to Delete: ");
        String isbn = scanner.nextLine();
        books.removeIf(b -> b.isbn.equals(isbn));
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(BOOK_FILE))) {
            for (Book b : books) {
                bw.write(b.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error updating book file: " + e.getMessage());
        }
        System.out.println("Book Deleted if existed.");
    }

    static void viewBooks() {
        System.out.println("\nBooks in Library:");
        for (Book b : books) {
            System.out.println(b.name + " | ISBN: " + b.isbn + " | Qty: " + b.quantity + " | Cost: Rs." + b.cost);
        }
    }

    static void moduleC(User user) {
        if (!user.role.equals("borrower")) {
            System.out.println("Only borrowers can access this module.");
            return;
        }
        System.out.println("\nBooks Available for Borrowing:");
        for (Book b : books) {
            if (b.quantity > 0) {
                System.out.println(b.name + " (ISBN: " + b.isbn + ")");
            }
        }
        System.out.print("Enter ISBN to Borrow: ");
        String isbn = scanner.nextLine();
        for (Book b : books) {
            if (b.isbn.equals(isbn) && b.quantity > 0) {
                borrowerHistory.computeIfAbsent(user.email, k -> new ArrayList<>()).add(b.name);
                b.quantity--;
                System.out.println("Book borrowed successfully.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    static void moduleD(User user) {
        System.out.println("\nFine Regulations:");
        System.out.println("1. Rs.2/day after 15 days.");
        System.out.println("2. Rs.10 fine for lost card.");
        System.out.println("3. 50% of book cost if book is lost.");
        System.out.println("(Future enhancement: Calculate actual fines.)");
    }

    static void moduleE(User user) {
        if (!user.role.equals("admin")) {
            System.out.println("Only admin can view reports.");
            return;
        }
        System.out.println("\nLibrary Reports:");
        System.out.println("1. Books with low quantity (<2)");
        for (Book b : books) {
            if (b.quantity < 2) {
                System.out.println("LOW: " + b.name + " (Qty: " + b.quantity + ")");
            }
        }
        System.out.println("(Future: Add borrowed stats, overdue list, student histories, etc.)");
    }
}