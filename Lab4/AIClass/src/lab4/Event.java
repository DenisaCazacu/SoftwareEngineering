/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

/**
 *
 * @author Wissam, Denisa
 */
import java.util.UUID;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

// The Event class as required.
public class Event {

    // Instance variables.
    private UUID id;
    private String name;
    private Date date;
    private String location;
    private EventOrganizer organizer;
    private Wishlist wishlist;
    private List<Media> photoGallery;

    // Constructor.
    public Event(UUID id, String name, Date date, String location,
                 EventOrganizer organizer, Wishlist wishlist) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.location = location;
        this.organizer = organizer;
        this.wishlist = wishlist;
        this.photoGallery = new ArrayList<>();
    }

    // Method to add a photo to the gallery.
    public void addPhoto(Media photo) {
        // Theoretical method: add the given photo to the photoGallery list.
        if (photo != null) {
            photoGallery.add(photo);
        }
    }

    // Method to remove a photo from the gallery.
    public void removePhoto(Media photo) {
        // Theoretical method: remove the given photo from the photoGallery list.
        if (photo != null) {
            photoGallery.remove(photo);
        }
    }

    // Getter for the photoGallery (useful for testing and verifying outcomes).
    public List<Media> getPhotoGallery() {
        return photoGallery;
    }

    // Main method to test the class with example parameters.
    public static void main(String[] args) {
        // Create example parameters.
        UUID eventId = UUID.randomUUID();
        String eventName = "Community Meetup";
        Date eventDate = new Date(); // current date for demonstration
        String eventLocation = "Central Park";
        EventOrganizer organizer = new EventOrganizer("John Doe");
        Wishlist wishlist = new Wishlist();

        // Create an instance of Event.
        Event event = new Event(eventId, eventName, eventDate, eventLocation, organizer, wishlist);

        // Create example Media objects.
        Media photo1 = new Media("photo1.jpg");
        Media photo2 = new Media("photo2.jpg");

        // Test addPhoto method.
        event.addPhoto(photo1);
        event.addPhoto(photo2);
        System.out.println("Photo Gallery after adding photos: " + event.getPhotoGallery());

        // Test removePhoto method.
        event.removePhoto(photo1);
        System.out.println("Photo Gallery after removing photo1: " + event.getPhotoGallery());


        // Testing fund management
        organizer.receiveFunds(500.0);
        organizer.manageFunds(200.0);
        organizer.manageFunds(400.0); // Should print insufficient funds

        organizer.createEvent(event);

        // Testing wishlist management
        organizer.addGiftToWishlist("New Projector");
        organizer.addGiftToWishlist("Speakers");
        organizer.removeGiftFromWishlist("New Projector");

        // Printing final states
        System.out.println(organizer);
    }
}

// Updated EventOrganizer class with additional methods
class EventOrganizer {
    private String name;
    private List<Event> organizedEvents;
    private Wishlist wishlist;
    private double funds;

    public EventOrganizer(String name) {
        this.name = name;
        this.organizedEvents = new ArrayList<>();
        this.wishlist = new Wishlist();
        this.funds = 0.0;
    }

    // Method to create and store an event
    public void createEvent(Event event) {
        if (event != null) {
            organizedEvents.add(event);
            System.out.println("Event created: " + event);
        }
    }

    // Method to add a gift to the wishlist
    public void addGiftToWishlist(String gift) {
        if (gift != null && !gift.isEmpty()) {
            wishlist.addGift(gift);
            System.out.println("Gift added to wishlist: " + gift);
        }
    }

    // Method to remove a gift from the wishlist
    public void removeGiftFromWishlist(String gift) {
        if (gift != null && !gift.isEmpty()) {
            wishlist.removeGift(gift);
            System.out.println("Gift removed from wishlist: " + gift);
        }
    }

    // Method to manage funds (e.g., deduct for expenses)
    public void manageFunds(double amount) {
        if (amount > 0 && funds >= amount) {
            funds -= amount;
            System.out.println("Funds deducted: " + amount + ", Remaining balance: " + funds);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Method to receive funds (e.g., donations or event revenue)
    public void receiveFunds(double amount) {
        if (amount > 0) {
            funds += amount;
            System.out.println("Funds received: " + amount + ", Total balance: " + funds);
        }
    }

    @Override
    public String toString() {
        return "EventOrganizer{name='" + name + "', funds=" + funds + "}";
    }
}

// Updated Wishlist class to support gift management
class Wishlist {
    private List<String> gifts;

    public Wishlist() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(String gift) {
        gifts.add(gift);
    }

    public void removeGift(String gift) {
        gifts.remove(gift);
    }

    @Override
    public String toString() {
        return "Wishlist" + gifts;
    }
}


// Minimal stub implementation of Media for testing purposes.
class Media {
    private String fileName;

    public Media(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return fileName;
    }
}
