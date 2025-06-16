package org.example.hotelmanagement.service.room;

import org.example.hotelmanagement.entity.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomService {
    List<Room> getAllRooms();
}
