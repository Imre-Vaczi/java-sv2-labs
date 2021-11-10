package meetingrooms;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }

    public String printNames(){
        StringBuilder sb = new StringBuilder();
        for (MeetingRoom room : meetingRooms){
            sb.append(room.getName() + "\n");
        }
        return sb.toString();
    }

    public String printNamesReverse(){
        StringBuilder sb = new StringBuilder();
        for (int roomIndex = meetingRooms.size()-1; roomIndex >= 0; roomIndex--){
            sb.append(meetingRooms.get(roomIndex).getName() + "\n");
        }
        return sb.toString();
    }

    public String printEvenNames(){
        StringBuilder sb = new StringBuilder();
        for (int roomIndex = 0; roomIndex < meetingRooms.size(); roomIndex+=2){
            sb.append(meetingRooms.get(roomIndex).getName() + "\n");
        }
        return sb.toString();
    }

    public String printAreas(){
        StringBuilder sb = new StringBuilder();
        for (MeetingRoom room : meetingRooms){
            sb.append(getRoomDetails(room) + "\n");
        }
        return sb.toString();
    }

    public String printMeetingRoomsWithName(String name){
        StringBuilder sb = new StringBuilder();
        for (MeetingRoom room : meetingRooms){
            if (name.toLowerCase(Locale.ROOT).trim().equals(room.getName().toLowerCase(Locale.ROOT))) {
                sb.append(getRoomDetails(room) + "\n");
            }
        }
        return sb.toString();
    }

    public String printMeetingRoomsContain(String part){
        StringBuilder sb = new StringBuilder();
        for (MeetingRoom room : meetingRooms){
            if (room.getName().toLowerCase(Locale.ROOT).contains(part.toLowerCase(Locale.ROOT).trim())){
                sb.append(getRoomDetails(room));
            }
        }
        return sb.toString();
    }

    public String printAreasLargerThan(int area){
        StringBuilder sb = new StringBuilder();
        for (MeetingRoom room : meetingRooms){
            if (room.getArea() > area){
                sb.append(getRoomDetails(room) + "\n");
            }
        }
        return sb.toString();
    }

    private String getRoomDetails(MeetingRoom meetingRoom){
        return meetingRoom.getName() + ": " + meetingRoom.getLength()+"m * "+meetingRoom.getWidth()+"m = "+meetingRoom.getArea()+" m^2";
    }
}
