package meetingrooms;

import java.util.ArrayList;
import java.util.List;

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

    private String getRoomDetails(MeetingRoom meetingRoom){
        return meetingRoom.getName() + ": " + meetingRoom.getLength()+"m * "+meetingRoom.getWidth()+"m = "+meetingRoom.getArea()+" m^2";
    }
}
