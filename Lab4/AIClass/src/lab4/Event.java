/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

/**
 *
 * @author Admin
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
    }
}

// Minimal stub implementation of EventOrganizer for testing purposes.
class EventOrganizer {
    private String name;

    public EventOrganizer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EventOrganizer{name='" + name + "'}";
    }
}

// Minimal stub implementation of Wishlist for testing purposes.
class Wishlist {
    @Override
    public String toString() {
        return "Wishlist{}";
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
