package com.hotel.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_room")
public class Room {

    private int id; 
    private String roomName;//room number
    private String remark;//room description
    private String image;//room image
    private  Room_cat room_cat;//room category
    private int isLive;//1: empty room, 2: reserved, 3: moved in/occupied, 4: room is out of order, 5: checked out
    private int floor; //floor: 1, 2
    private int isClean; //isCleaned?
    
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getRoomName() {
        return roomName;
    }
    
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    
    public String getRemark() {
        return remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public String getImage() {
        return image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    
    @ManyToOne
    @JoinColumn(name="room_cat_id")
    public Room_cat getRoom_cat() {
        return room_cat;
    }
    
    public void setRoom_cat(Room_cat room_cat) {
        this.room_cat = room_cat;
    }
    
    public int getIsLive() {
        return isLive;
    }
    
    public void setIsLive(int isLive) {
        this.isLive = isLive;
    }
    
    public int getFloor() {
        return floor;
    }
    
    public void setFloor(int floor) {
        this.floor = floor;
    }
    
    public int getIsClean() {
        return isClean;
    }
    
    public void setIsClean(int isClean) {
        this.isClean = isClean;
    }

    
    
    
}
