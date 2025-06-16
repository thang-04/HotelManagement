package org.example.hotelmanagement.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Guest")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GuestID")
    private int guestID;

    @Column(name = "FirstName", length = 50 ,columnDefinition = "nvarchar(50)")
    private String userName;

    @Column(name = "Password", length = 255)
    private String password;

    @Column(name = "DateOfBirth")
    private LocalDate dateOfBirth;

    @Column(name = "Address", length = 255,columnDefinition = "nvarchar(255)")
    private String address;

    @Column(name = "Phone", length = 15)
    private String phone;

    @Column(name = "Email", length = 255)
    private String email;

    @Column(name = "ProfilePicture")
    private String profilePicture;

    @OneToMany(mappedBy = "guest")
    private List<Booking> bookings;

    @ManyToOne
    @JoinColumn(name = "roleId")
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGuestID() {
        return guestID;
    }

    public void setGuestID(int guestID) {
        this.guestID = guestID;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}

