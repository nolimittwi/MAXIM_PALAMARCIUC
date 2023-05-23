package org.example.homework_nr_9;

import java.util.List;

public class MeetingRoom {
    public List<AttentTraining> atendees;

    public MeetingRoom(List<AttentTraining> atendees) {
        this.atendees = atendees;
    }

    public void Attend(){
        for (AttentTraining attendees: atendees
             ) {attendees.AttendTraining();
        }
    }

}