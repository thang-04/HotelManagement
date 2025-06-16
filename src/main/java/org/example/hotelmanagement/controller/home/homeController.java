package org.example.hotelmanagement.controller.home;

import org.example.hotelmanagement.entity.Room;
import org.example.hotelmanagement.service.room.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class homeController {

    @Autowired
    private  RoomService roomService;

    @GetMapping()
    public String getHomePage(Model model) {
        model.addAttribute("fragmentContent", "homePage/fragments/contentMain :: contentMain");
        return "homePage/index";
    }

    @GetMapping("/room-list")
    public String getRoomListPage(Model model) {
        List<Room> rooms = roomService.getAllRooms();
        model.addAttribute("listRooms", rooms);
        model.addAttribute("fragmentContent", "homePage/fragments/roomList :: roomList");
        return "homePage/index";
    }

    @GetMapping("/room-detail")
    public String getRoomDetailsPage(Model model) {
        model.addAttribute("fragmentContent", "homePage/fragments/roomDetail :: roomDetail");
        return "homePage/index";
    }
}
