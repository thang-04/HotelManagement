package org.example.hotelmanagement.service.room.impl;

import org.example.hotelmanagement.entity.Room;
import org.example.hotelmanagement.repository.RoomRepository;
import org.example.hotelmanagement.service.room.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private  RoomRepository roomRepository;

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

}
